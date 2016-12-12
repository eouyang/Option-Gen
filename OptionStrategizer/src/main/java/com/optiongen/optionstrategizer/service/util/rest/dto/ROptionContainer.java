package com.optiongen.optionstrategizer.service.util.rest.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by eouyang on 12/11/16.
 */
public class ROptionContainer {

    @SerializedName("option")
    List<ROption> options;

    public List<ROption> getOptions() {
        return options;
    }

    public void setOptions(List<ROption> options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "ROptionContainer{" +
                "options=" + options +
                '}';
    }
}
