package com.optiongen.optionstrategizer.service.util;

import com.google.gson.Gson;
import org.springframework.stereotype.Component;

/**
 * Created by eouyang on 12/10/16.
 */

@Component
public class OptionStrategizerUtil {

    public <T> T unmarshallJson(String json, Class<T> type) {
        T object = null;
        Gson gson = new Gson();

        object = gson.fromJson(json, type);

        return object;
    }
}
