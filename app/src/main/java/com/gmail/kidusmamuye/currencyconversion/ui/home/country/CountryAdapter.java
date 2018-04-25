package com.gmail.kidusmamuye.currencyconversion.ui.home.country;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import com.gmail.kidusmamuye.currencyconversion.model.Country;
import com.kidusmt.shemetacustomerapp.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KidusMT on 3/29/2018.
 */

public class CountryAdapter extends RecyclerView.Adapter<CountryViewHolder> implements Filterable {

    private CountryContract.Presenter presenter;
    private List<Country> requests;
    private List<Country> filteredRequests;

    public CountryAdapter(CountryContract.Presenter presenter) {
        requests = new ArrayList<>();
        this.presenter = presenter;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_history, parent,false);
        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.update(requests);
        holder.itemView.setOnClickListener(v -> presenter.onHistoryClicked(position));
    }

    public void update(List<Country> data) {
        requests.clear();
        requests.addAll(data);
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return requests.size();
    }

    @Override
    public Filter getFilter() {
        return null;
    }

//    @Override
//    public Filter getFilter() {
//        //TODO search filter should be implemented
//        return new Filter() {
//            @Override
//            protected FilterResults performFiltering(CharSequence constraint) {
//                String charString = constraint.toString();
//                if (charString.isEmpty()) {
//                    filteredRequests = requests;
//                } else {
//                    List<Request> filteredList = new ArrayList<>();
//                    for (Request request : requests) {
//                        if (request.getItemName().toLowerCase().contains(charString.toLowerCase()) ||
//                                request.getManufacturedBy().toLowerCase().contains(charString.toLowerCase())) {
//                            filteredList.add(request);
//                        }
//                    }
//                    filteredRequests = filteredList;
//                }
//                FilterResults filterResults = new FilterResults();
//                filterResults.values = filteredRequests;
//                return filterResults;
//            }
//
//            @Override
//            protected void publishResults(CharSequence constraint, FilterResults results) {
//                filteredRequests = (ArrayList<Request>) results.values;
//                notifyDataSetChanged();
//            }
//        };
//    }
}
