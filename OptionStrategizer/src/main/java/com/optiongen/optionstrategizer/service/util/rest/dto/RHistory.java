package com.optiongen.optionstrategizer.service.util.rest.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by eouyang on 12/11/16.
 */
public class RHistory {

    @SerializedName("day")
    private List<RDataByDay> data;

    public List<RDataByDay> getData() {
        return data;
    }

    public void setData(List<RDataByDay> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "RHistory{" +
                "data=" + data +
                '}';
    }
}
