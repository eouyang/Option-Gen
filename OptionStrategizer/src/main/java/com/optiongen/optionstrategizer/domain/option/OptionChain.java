package com.optiongen.optionstrategizer.domain.option;

import java.util.List;

/**
 * Created by eouyang on 12/11/16.
 */
public class OptionChain {

    List<Option> options;

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "OptionChain{" +
                "options=" + options +
                '}';
    }
}
