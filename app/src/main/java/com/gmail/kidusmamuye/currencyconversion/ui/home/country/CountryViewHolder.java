package com.gmail.kidusmamuye.currencyconversion.ui.home.country;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.gmail.kidusmamuye.currencyconversion.R;
import com.gmail.kidusmamuye.currencyconversion.data.model.Currency;
import com.gmail.kidusmamuye.currencyconversion.model.Country;

import java.util.List;

/**
 * Created by KidusMT on 3/29/2018.
 */

public class CountryViewHolder extends RecyclerView.ViewHolder {

    private ImageView requestImage;
    private TextView requestTitle;
    private TextView requestStatus;
    private TextView requestDate;
    public CountryViewHolder(View itemView) {
        super(itemView);
        requestImage = itemView.findViewById(R.id.country_flag);
        requestTitle = itemView.findViewById(R.id.country_name);
        requestStatus = itemView.findViewById(R.id.currency_name);
        requestDate = itemView.findViewById(R.id.currency_symbol);
    }

    public void update(List<Country> countries) {
        Country country = countries.get(getAdapterPosition());
        requestImage.setImageResource(R.drawable.ic_launcher_background);
        requestTitle.setText(String.valueOf(country.getResults()));
        requestStatus.setText(String.valueOf(country.getResults()));
        requestDate.setText(String.valueOf(country.getResults()));
    }
}
