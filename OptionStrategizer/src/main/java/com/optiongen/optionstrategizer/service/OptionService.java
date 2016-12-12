package com.optiongen.optionstrategizer.service;

import com.optiongen.optionstrategizer.domain.option.Option;
import com.optiongen.optionstrategizer.domain.option.OptionChain;
import com.optiongen.optionstrategizer.domain.option.OptionExpirations;
import com.optiongen.optionstrategizer.service.util.rest.OptionMarketDataServices;
import com.optiongen.optionstrategizer.service.util.rest.dto.ROption;
import com.optiongen.optionstrategizer.service.util.rest.dto.ROptionChain;
import com.optiongen.optionstrategizer.service.util.rest.dto.ROptionExpirations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eouyang on 12/10/16.
 */

@Component
public class OptionService {

    @Autowired
    OptionMarketDataServices optionMarketDataServices;

    public OptionExpirations getOptionExpiration(String symbol) {
        OptionExpirations optionExpirations = new OptionExpirations();

        ROptionExpirations expirations = optionMarketDataServices.getOptionExpiration(symbol);
        optionExpirations.setExpirations(expirations.getRExpirations().getDates());

        return optionExpirations;
    }

    public OptionChain getOptionChain(String symbol, String expiry) {
        OptionChain optionChain = new OptionChain();
        List<Option> optionList = new ArrayList<Option>();

        ROptionChain chain = optionMarketDataServices.getOptionChain(symbol, expiry);

        for (ROption rOption : chain.getOptionContainer().getOptions()) {
            Option option = new Option();

            option.setSymbol(rOption.getSymbol());
            option.setStrike(rOption.getStrike());
            option.setExpirationDate(rOption.getExpirationDate());
            option.setOptionType(rOption.getOptionType());
            option.setDescription(rOption.getDescription());
            option.setLast(rOption.getLast());
            option.setBid(rOption.getBid());
            option.setAsk(rOption.getAsk());
            option.setUnderlying(rOption.getUnderlying());
            option.setRootSymbol(rOption.getRootSymbol());

            optionList.add(option);
        }

        optionChain.setOptions(optionList);

        return optionChain;
    }

}
