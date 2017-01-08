package com.optiongen.optionstrategizer.service.util;

import com.google.gson.Gson;
import com.optiongen.optionstrategizer.domain.option.Option;
import com.optiongen.optionstrategizer.service.util.rest.dto.ROption;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

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

    public Option convertToOptionDomain(ROption rOption) {
        Option option = new Option();

        option.setSymbol(rOption.getSymbol());
        option.setStrike(rOption.getStrike() != null ? rOption.getStrike().setScale(2, BigDecimal.ROUND_HALF_UP) : null);
        option.setExpirationDate(rOption.getExpirationDate());
        option.setOptionType(rOption.getOptionType());
        option.setDescription(rOption.getDescription());
        option.setLast(rOption.getLast() != null ? rOption.getLast().setScale(2, BigDecimal.ROUND_HALF_UP) : null);
        option.setBid(rOption.getBid() != null ? rOption.getBid().setScale(2, BigDecimal.ROUND_HALF_UP) : null);
        option.setAsk(rOption.getAsk() != null ?rOption.getAsk().setScale(2, BigDecimal.ROUND_HALF_UP) : null);
        option.setUnderlying(rOption.getUnderlying());
        option.setRootSymbol(rOption.getRootSymbol());

        return option;
    }
}
