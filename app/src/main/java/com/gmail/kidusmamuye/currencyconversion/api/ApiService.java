package com.gmail.kidusmamuye.currencyconversion.api;

import com.gmail.kidusmamuye.currencyconversion.model.Country;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by KidusMT on 4/25/2018.
 */

public interface ApiService {

    @Headers({"Content-Type:application/json"})
    @GET("/api/v5/convert")
    Observable<Country> getCurrency(@Query("q") String q);

    @Headers({"Content-Type:application/json"})
    @GET("/api/v5/countries")
    Observable<Country> getCountries();
}
