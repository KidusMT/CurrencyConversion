package com.gmail.kidusmamuye.currencyconversion.ui.home.country;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.kidusmt.shemetacustomerapp.R;
import com.kidusmt.shemetacustomerapp.data.model.Request;

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
        requestImage = itemView.findViewById(R.id.iv_history_product);
        requestTitle = itemView.findViewById(R.id.tv_history_product_name);
        requestStatus = itemView.findViewById(R.id.tv_history_status);
        requestDate = itemView.findViewById(R.id.tv_history_date);
    }

    public void update(List<Request> requests) {
        Request request = requests.get(getAdapterPosition());

        //TODO should implement the date formatting in better way for display as the UI design
        requestImage.setImageResource(R.drawable.profile);
        requestTitle.setText(String.valueOf(request.getStatus()));
        requestStatus.setText(String.valueOf(request.getStatus()));
        requestDate.setText(String.valueOf(request.getStatus()));
    }
}
