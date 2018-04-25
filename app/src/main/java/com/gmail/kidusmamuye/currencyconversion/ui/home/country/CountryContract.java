package com.gmail.kidusmamuye.currencyconversion.ui.home.country;

import com.gmail.kidusmamuye.currencyconversion.base.mvp.BasePresenter;
import com.gmail.kidusmamuye.currencyconversion.base.mvp.BaseView;

/**
 * Created by KidusMT on 4/25/2018.
 */

public interface CountryContract {

    interface View extends BaseView<Presenter>{
        void showCountries();
        void showCountryDetail();
    }

    interface Presenter extends BasePresenter<View>{
        void onCountryClicked();
        void loadCountries();
    }
}
