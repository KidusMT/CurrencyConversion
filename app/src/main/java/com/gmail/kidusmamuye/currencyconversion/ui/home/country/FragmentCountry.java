package com.gmail.kidusmamuye.currencyconversion.ui.home.country;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gmail.kidusmamuye.currencyconversion.R;
import com.gmail.kidusmamuye.currencyconversion.base.view.BaseFragment;

public class FragmentCountry extends BaseFragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_country, container, false);

        return v;
    }


}
