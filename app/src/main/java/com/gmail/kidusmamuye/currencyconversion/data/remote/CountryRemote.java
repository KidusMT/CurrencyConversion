package com.gmail.kidusmamuye.currencyconversion.data.remote;

import android.content.Context;

import com.gmail.kidusmamuye.currencyconversion.data.BaseRemote;
import com.gmail.kidusmamuye.currencyconversion.model.Country;

import io.reactivex.Observable;

/**
 * Created by KidusMT on 4/25/2018.
 */

public class CountryRemote extends BaseRemote implements CountryRemoteContract{

    public CountryRemote(Context context) {
        super(context);
    }

    @Override
    public Observable<Country> getCurrency(String from, String to) {
        return BaseRemote.apiService.getCurrency(from+"_"+to);
    }

    @Override
    public Observable<Country> getCountries() {
        return BaseRemote.apiService.getCountries();
    }
}
