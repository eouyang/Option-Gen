package com.optiongen.optionstrategizer.web.option;

import com.optiongen.optionstrategizer.domain.option.OptionChain;
import com.optiongen.optionstrategizer.domain.option.OptionExpirations;
import com.optiongen.optionstrategizer.service.OptionService;
import com.optiongen.optionstrategizer.service.util.rest.HistoricalMarketDataServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by eouyang on 12/10/16.
 */

@Controller
@RequestMapping(value = "/option/")
public class OptionController {

    @Autowired
    OptionService optionService;

    @Autowired
    HistoricalMarketDataServices historicalMarketDataServices;

    private static final Logger logger = LoggerFactory.getLogger(OptionController.class);

    @RequestMapping(value = "expirations",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody OptionExpirations getOptionExpirations(@RequestParam("symbol") String symbol) {
        OptionExpirations optionExpirations = null;

        logger.info("Option expirations request for symbol [{}]", symbol);

        optionExpirations = optionService.getOptionExpiration(symbol);

        logger.info("Option expirations response for symbol [{}] :: {}", symbol, optionExpirations);

        return optionExpirations;
    }

    @RequestMapping(value = "chain",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody OptionChain getOptionChain(@RequestParam("symbol") String symbol, @RequestParam("expiry") String expiry) {
        OptionChain optionChain = null;

        logger.info("Option chain request for symbol [{}] and expiry [{}]", symbol, expiry);

        optionChain = optionService.getOptionChain(symbol, expiry);

        logger.info("Option chain response for symbol [{}] and expiry [{}] :: {}", symbol, expiry, optionChain);

        return optionChain;
    }

}
