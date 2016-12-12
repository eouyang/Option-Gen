package com.optiongen.optionstrategizer.service.util.rest.dto;

import com.google.gson.annotations.SerializedName;

/**
 * Created by eouyang on 12/10/16.
 */

public class ROptionExpirations {

    @SerializedName("expirations")
    RExpirations RExpirations;

    public RExpirations getRExpirations() {
        return RExpirations;
    }

    public void setRExpirations(RExpirations RExpirations) {
        this.RExpirations = RExpirations;
    }

    @Override
    public String toString() {
        return "ROptionExpirations{" +
                "RExpirations=" + RExpirations +
                '}';
    }
}
