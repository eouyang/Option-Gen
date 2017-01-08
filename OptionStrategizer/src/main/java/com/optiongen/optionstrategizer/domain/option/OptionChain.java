package com.optiongen.optionstrategizer.domain.option;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by eouyang on 12/11/16.
 */
public class OptionChain {

    @SerializedName("option_pairs")
    private List<OptionChainPair> optionPairs;

    public List<OptionChainPair> getOptionPairs() {
        return optionPairs;
    }

    public void setOptionPairs(List<OptionChainPair> optionPairs) {
        this.optionPairs = optionPairs;
    }

    @Override
    public String toString() {
        return "OptionChain{" +
                "optionPairs=" + optionPairs +
                '}';
    }
}
