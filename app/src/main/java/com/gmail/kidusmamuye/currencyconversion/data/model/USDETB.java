
package com.gmail.kidusmamuye.currencyconversion.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class USDETB {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("val")
    @Expose
    private Double val;
    @SerializedName("to")
    @Expose
    private String to;
    @SerializedName("fr")
    @Expose
    private String fr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getVal() {
        return val;
    }

    public void setVal(Double val) {
        this.val = val;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

}
