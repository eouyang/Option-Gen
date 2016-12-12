package com.optiongen.optionstrategizer.service.util.rest.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by eouyang on 12/10/16.
 */

public class RExpirations {

    @SerializedName("date")
    private List<String> dates;

    public List<String> getDates() {
        return dates;
    }

    public void setDates(List<String> dates) {
        this.dates = dates;
    }

    @Override
    public String toString() {
        return "ROptionExpirations{" +
                "dates=" + dates +
                '}';
    }
}
