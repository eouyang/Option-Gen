package com.optiongen.optionstrategizer.service.util.rest;

import com.optiongen.optionstrategizer.service.util.OptionStrategizerUtil;
import com.optiongen.optionstrategizer.service.util.rest.dto.RHistoricalData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Collections;

/**
 * Created by eouyang on 12/11/16.
 */

@Component
public class HistoricalMarketDataServices {

    @Value(value = "${market.services.token}")
    private String accessToken;

    @Value(value = "${historical.data.endpoint}")
    private String historicalDataUrl;

    @Autowired
    OptionStrategizerUtil optionStrategizerUtil;

    private static final Logger logger = LoggerFactory.getLogger(HistoricalMarketDataServices.class);

    public RHistoricalData getHistoricalData(String underlyingSymbol, String timeFrame) {
        RHistoricalData rHistoricalData = null;

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.set("Authorization", "Bearer " + accessToken);

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(historicalDataUrl)
                .queryParam("symbol", underlyingSymbol);

        HttpEntity<String> entity = new HttpEntity<String>(headers);

        try {
            HttpEntity<String> responsePayload = restTemplate.exchange(
                    builder.build().encode().toUri(),
                    HttpMethod.GET,
                    entity,
                    String.class);

            logger.info("Option Expiration Market Data Service Response :: {}", responsePayload);

            rHistoricalData = optionStrategizerUtil.unmarshallJson(responsePayload.getBody(), RHistoricalData.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rHistoricalData;
    }

}
