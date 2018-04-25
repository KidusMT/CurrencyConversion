package com.gmail.kidusmamuye.currencyconversion.ui.home.converter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gmail.kidusmamuye.currencyconversion.R;
import com.gmail.kidusmamuye.currencyconversion.base.view.BaseFragment;
import com.gmail.kidusmamuye.currencyconversion.util.Utils;

public class FragmentConverter extends BaseFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_converter, container, false);
        Utils.hideKeyboard(getActivity());
        return v;
    }

}
