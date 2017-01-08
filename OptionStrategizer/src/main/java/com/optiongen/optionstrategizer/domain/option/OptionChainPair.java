package com.optiongen.optionstrategizer.domain.option;

import com.google.gson.annotations.SerializedName;

/**
 * Created by eouyang on 1/7/17.
 */
public class OptionChainPair implements Comparable<OptionChainPair> {

    @SerializedName("call")
    private Option callOption;

    @SerializedName("put")
    private Option putOption;

    public Option getCallOption() {
        return callOption;
    }

    public void setCallOption(Option callOption) {
        this.callOption = callOption;
    }

    public Option getPutOption() {
        return putOption;
    }

    public void setPutOption(Option putOption) {
        this.putOption = putOption;
    }

    @Override
    public String toString() {
        return "OptionChainPair{" +
                "callOption=" + callOption +
                ", putOption=" + putOption +
                '}';
    }

    @Override
    public int compareTo(OptionChainPair o) {
        return this.getCallOption().getStrike().compareTo(o.getCallOption().getStrike());
    }
}
