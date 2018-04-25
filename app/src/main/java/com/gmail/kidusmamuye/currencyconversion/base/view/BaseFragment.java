package com.gmail.kidusmamuye.currencyconversion.base.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.gmail.kidusmamuye.currencyconversion.util.Utils;


/**
 * Base class for all Fragments
 */
public class BaseFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        d("< -------------------- onCreate(Bundle) Fragment-------------------- >");
    }

    @Override
    public void onStart() {
        super.onStart();
        d("< -------------------- onStart() Fragment-------------------- >");
    }

    @Override
    public void onResume() {
        super.onResume();
        d("< -------------------- onResume() Fragment-------------------- >");
    }

    @Override
    public void onPause() {
        super.onPause();
        d("< -------------------- onPause() Fragment-------------------- >");
    }

    @Override
    public void onStop() {
        super.onStop();
        d("< -------------------- onStop() Fragment-------------------- >");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        d("< -------------------- onDestroy()Fragment -------------------- >");
    }

    /**
     * Show a debug message to the logcat
     *
     * @param message message to display
     */
    protected void d(String message) {
        Utils.d(message);
    }

    /**
     * Show an error message to the logcat
     *
     * @param message message to display
     */
    protected void e(String message) {
        Utils.e(message);
    }
}
