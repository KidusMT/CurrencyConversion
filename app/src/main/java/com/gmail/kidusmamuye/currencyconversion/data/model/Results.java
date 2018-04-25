
package com.gmail.kidusmamuye.currencyconversion.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Results {

    @SerializedName("USD_ETB")
    @Expose
    private USDETB uSDETB;

    public USDETB getUSDETB() {
        return uSDETB;
    }

    public void setUSDETB(USDETB uSDETB) {
        this.uSDETB = uSDETB;
    }

}
