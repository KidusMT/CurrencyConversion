package com.gmail.kidusmamuye.currencyconversion.util;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import com.gmail.kidusmamuye.currencyconversion.App;

import timber.log.Timber;

/**
 * Common class for functionality such as logging.
 */
public class Utils {

    /**
     * Show a debug message to the Android Logcat
     *
     * @param message the message to show to the log
     */
    public static void d(String message) {
        log(message, false);
    }

    /**
     * Show an error message to the Android Logcat
     ** @param message the message to show to the log
     */
    public static void e(String message) {
        log(message, true);
    }

    /**
     * Show a debug, or error message to the Android Logcat
\     * @param message Message String to show on the log
     * @param isError represents if the message should be displayed as a Log.e error or not.
     */
    private static void log(String message, boolean isError) {
        String output = message;
        if (isError) {
            Timber.e(output);
        } else {
            Timber.d(output);
        }
    }

    public static void toast(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static void toastLong(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    /**
     * For detecting the network state of the internet
     * @param context (required) for get the SystemService
     * @return true if there is an internet connection and false if there is not
     */
    public static boolean isNetworkAvailable(Context context){
        ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = connectivityManager.getActiveNetworkInfo();
        return info != null && info.isConnected();
    }


    public static void hideKeyboard(Activity activity) {
        activity.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        View cur_focus = activity.getCurrentFocus();
        if (cur_focus != null) {
            inputMethodManager.hideSoftInputFromWindow(cur_focus.getWindowToken(), 0);
        }
    }
}
