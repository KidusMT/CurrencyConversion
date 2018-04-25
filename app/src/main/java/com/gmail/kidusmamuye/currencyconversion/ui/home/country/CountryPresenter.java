package com.gmail.kidusmamuye.currencyconversion.ui.home.country;

import com.kidusmt.shemetacustomerapp.data.model.Request;
import com.kidusmt.shemetacustomerapp.data.repo.request.RequestRepoContract;
import com.kidusmt.shemetacustomerapp.utils.ActivityState;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;
import retrofit2.HttpException;

/**
 * Created by KidusMT on 3/29/2018.
 */

public class CountryPresenter implements CountryContract.Presenter {

    private ActivityState state;
    private OpenContract.View view;
    private RequestRepoContract repository;

    public CountryPresenter(RequestRepoContract repository) {
        this.repository = repository;
        this.state = ActivityState.getInstance();
    }

    @Override
    public void start() {
        loadHistory();
    }

    @Override
    public void attachView(CountryContract.View view) {

    }

    @Override
    public void attachView(OpenContract.View view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        this.view = null;
    }

    @Override
    public OpenContract.View getView() {
        return this.view;
    }

    @Override
    public void onHistoryClicked(int position) {
        view.showHistoryDetail(position);
    }

    @Override
    public void loadHistory() {
        view.showLoading();
        repository.getRequest()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableObserver<List<Request>>() {
                    @Override
                    public void onNext(List<Request> requests) {
                        //Handle error
                        view.showHistories(requests);
                    }

                    @Override
                    public void onError(Throwable e) {
                        state.setStateError(e);

                        if (view == null) return;
                        view.showLoading();

                        if (e instanceof SocketTimeoutException) {
                            view.onTimeout();
                        } else if (e instanceof IOException) {
                            view.onNetworkError();
                        } else if (e instanceof HttpException) {
                            int code = ((HttpException) e).response().code();
                            if (code >= 400 && code < 404) {
                                //TODO should implement this in a better way for all status code
                                view.onUnknownError("Unauthorized! Login again.");
                            } else {
                                ResponseBody responseBody = ((HttpException) e).response().errorBody();
                                try {//should display the correct error message form the http protocol
                                    if (responseBody != null) {
                                        JSONObject jObjError = new JSONObject(responseBody.toString());
                                        view.onUnknownError(jObjError.toString());
                                    }
                                } catch (JSONException e1) {
                                    e1.printStackTrace();
                                }
                            }
                        } else {
                            view.onUnknownError(e.getMessage());
                        }
                        e.printStackTrace();
                        view.hideLoading();
                    }

                    @Override
                    public void onComplete() {
                        view.hideLoading();
                    }
                });
    }

    @Override
    public void onCountryClicked() {

    }

    @Override
    public void loadCountries() {

    }
}
