package com.optiongen.optionstrategizer.service;

import com.optiongen.optionstrategizer.domain.option.Option;
import com.optiongen.optionstrategizer.domain.option.OptionChain;
import com.optiongen.optionstrategizer.domain.option.OptionChainPair;
import com.optiongen.optionstrategizer.domain.option.OptionExpirations;
import com.optiongen.optionstrategizer.service.util.OptionStrategizerUtil;
import com.optiongen.optionstrategizer.service.util.rest.OptionMarketDataServices;
import com.optiongen.optionstrategizer.service.util.rest.dto.ROption;
import com.optiongen.optionstrategizer.service.util.rest.dto.ROptionChain;
import com.optiongen.optionstrategizer.service.util.rest.dto.ROptionExpirations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by eouyang on 12/10/16.
 */

@Component
public class OptionService {

    @Autowired
    OptionMarketDataServices optionMarketDataServices;

    @Autowired
    OptionStrategizerUtil optionStrategizerUtil;

    public OptionExpirations getOptionExpiration(String symbol) {
        OptionExpirations optionExpirations = new OptionExpirations();

        ROptionExpirations expirations = optionMarketDataServices.getOptionExpiration(symbol);
        optionExpirations.setExpirations(expirations.getRExpirations().getDates());

        return optionExpirations;
    }

    public OptionChain getOptionChain(String symbol, String expiry) {
        OptionChain optionChain = new OptionChain();
        List<Option> optionList = new ArrayList<Option>();
        final Map<BigDecimal, OptionChainPair> optionPairs = new LinkedHashMap<BigDecimal, OptionChainPair>();

        ROptionChain chain = optionMarketDataServices.getOptionChain(symbol, expiry);

        if (chain == null) {
            return  optionChain;
        }

        for (ROption rOption : chain.getOptionContainer().getOptions()) {
            Option option = optionStrategizerUtil.convertToOptionDomain(rOption);
            optionList.add(option);
        }

        for (Option option : optionList) {
            if (optionPairs.containsKey(option.getStrike())) {
                if (option.getOptionType().toUpperCase().equals("PUT")) {
                    optionPairs.get(option.getStrike()).setPutOption(option);
                } else {
                    optionPairs.get(option.getStrike()).setCallOption(option);
                }
            } else {
                OptionChainPair optionChainPair = new OptionChainPair();
                if (option.getOptionType().toUpperCase().equals("PUT")) {
                    optionChainPair.setPutOption(option);
                } else {
                    optionChainPair.setCallOption(option);
                }
                optionPairs.put(option.getStrike(), optionChainPair);
            }
        }

        List<OptionChainPair> ocPairList = new ArrayList<OptionChainPair>(optionPairs.values());
        Collections.sort(ocPairList);
        optionChain.setOptionPairs(ocPairList);

        return optionChain;
    }

}
