package com.gmail.kidusmamuye.currencyconversion.data.remote;

import com.gmail.kidusmamuye.currencyconversion.model.Country;

import io.reactivex.Observable;

/**
 * Created by KidusMT on 4/25/2018.
 */

public interface CountryRemoteContract {

    Observable<Country> getCurrency(String from, String to);

    Observable<Country> getCountries();
}
