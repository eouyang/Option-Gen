package com.optiongen.optionstrategizer.service.util.rest.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by eouyang on 12/10/16.
 */

public class ROptionChain {

    @Expose @SerializedName("options")
    ROptionContainer optionContainer;

    public ROptionContainer getOptionContainer() {
        return optionContainer;
    }

    public void setOptionContainer(ROptionContainer optionContainer) {
        this.optionContainer = optionContainer;
    }

    @Override
    public String toString() {
        return "ROptionChain{" +
                "optionContainer=" + optionContainer +
                '}';
    }
}
