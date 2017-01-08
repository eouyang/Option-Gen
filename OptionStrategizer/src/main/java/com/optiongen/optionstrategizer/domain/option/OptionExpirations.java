package com.optiongen.optionstrategizer.domain.option;

import java.util.List;

/**
 * Created by eouyang on 12/11/16.
 */

public class OptionExpirations {

    private List<String> expirations;

    public List<String> getExpirations() {
        return expirations;
    }

    public void setExpirations(List<String> expirations) {
        this.expirations = expirations;
    }

    @Override
    public String toString() {
        return "OptionExpirations{" +
                "expirations=" + expirations +
                '}';
    }
}
