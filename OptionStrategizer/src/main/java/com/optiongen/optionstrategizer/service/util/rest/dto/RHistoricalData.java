package com.optiongen.optionstrategizer.service.util.rest.dto;

import com.google.gson.annotations.SerializedName;

/**
 * Created by eouyang on 12/11/16.
 */
public class RHistoricalData {

    @SerializedName("history")
    private RHistory history;

    public RHistory getHistory() {
        return history;
    }

    public void setHistory(RHistory history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return "RHistoricalData{" +
                "history=" + history +
                '}';
    }
}
