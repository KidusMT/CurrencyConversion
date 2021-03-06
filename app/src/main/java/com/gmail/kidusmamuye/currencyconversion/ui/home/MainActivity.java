package com.gmail.kidusmamuye.currencyconversion.ui.home;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;

import com.gmail.kidusmamuye.currencyconversion.R;
import com.gmail.kidusmamuye.currencyconversion.base.view.BaseActivity;
import com.gmail.kidusmamuye.currencyconversion.ui.home.converter.FragmentConverter;
import com.gmail.kidusmamuye.currencyconversion.ui.home.country.FragmentCountry;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @BindView(R.id.tabs)
    TabLayout tabLayout;
    @BindView(R.id.home_viewpager)
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Currency Converter");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //sets the viewpager
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        HomeViewPager adapter = new HomeViewPager(getSupportFragmentManager());
        adapter.addFragment(new FragmentConverter(), "Converter");
        adapter.addFragment(new FragmentCountry(), "Country");
        viewPager.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //TODO there has to be a better way of implementing this
        if (item.getItemId() == R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
