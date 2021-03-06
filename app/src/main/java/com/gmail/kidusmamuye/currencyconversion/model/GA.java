
package com.gmail.kidusmamuye.currencyconversion.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GA {

    @SerializedName("currencyId")
    @Expose
    private String currencyId;
    @SerializedName("currencyName")
    @Expose
    private String currencyName;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("alpha3")
    @Expose
    private String alpha3;
    @SerializedName("id")
    @Expose
    private String id;

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlpha3() {
        return alpha3;
    }

    public void setAlpha3(String alpha3) {
        this.alpha3 = alpha3;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
