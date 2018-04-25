package com.gmail.kidusmamuye.currencyconversion.data;

import android.content.Context;

import com.androidnetworking.interceptors.HttpLoggingInterceptor;
import com.gmail.kidusmamuye.currencyconversion.BuildConfig;
import com.gmail.kidusmamuye.currencyconversion.api.ApiService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by KidusMT on 4/25/2018.
 */

public class BaseRemote {

    public static ApiService apiService;
    private Cache cache;

    public BaseRemote(Context context) {
        int cacheSize = 10 * 1024 * 1024;//10MB for the cache size
        cache = new Cache(context.getApplicationContext().getCacheDir(), cacheSize);

        Gson gson = new GsonBuilder().setLenient().create();

        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(BuildConfig.BASE_URL)
                .client(createClient())
                .build();

        retrofit.create(ApiService.class);
    }

    private OkHttpClient createClient() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return new OkHttpClient.Builder()
                .cache(cache)
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.MINUTES)
                .addInterceptor(interceptor)
                .build();
    }
}
