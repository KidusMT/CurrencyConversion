package com.gmail.kidusmamuye.currencyconversion;

import android.app.Application;
import android.content.Context;

/**
 * Created by KidusMT on 4/25/2018.
 */

public class App extends Application {

    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

    public static Context getContext() {
        return context;
    }
}
