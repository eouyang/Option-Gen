package com.optiongen.optionstrategizer.service.util.rest;

import com.optiongen.optionstrategizer.service.util.rest.dto.ROptionExpirations;
import com.optiongen.optionstrategizer.service.util.rest.dto.ROptionChain;
import com.optiongen.optionstrategizer.service.util.OptionStrategizerUtil;
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
 * Created by eouyang on 12/10/16.
 */

@Component
public class OptionMarketDataServices {

    @Value(value = "${market.services.token}")
    private String accessToken;

    @Value(value = "${option.expiration.endpoint}")
    private String optionExpirationUrl;

    @Value(value = "${option.chain.endpoint}")
    private String optionChainUrl;

    @Autowired
    OptionStrategizerUtil optionStrategizerUtil;

    private static final Logger logger = LoggerFactory.getLogger(OptionMarketDataServices.class);

    public ROptionExpirations getOptionExpiration(String underlyingSymbol) {
        ROptionExpirations rOptionExpirations = null;

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.set("Authorization", "Bearer " + accessToken);

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(optionExpirationUrl)
                .queryParam("symbol", underlyingSymbol);

        HttpEntity<String> entity = new HttpEntity<String>(headers);

        try {
            HttpEntity<String> responsePayload = restTemplate.exchange(
                    builder.build().encode().toUri(),
                    HttpMethod.GET,
                    entity,
                    String.class);

            logger.info("Option Expiration Market Data Service Response :: {}", responsePayload);

            rOptionExpirations = optionStrategizerUtil.unmarshallJson(responsePayload.getBody(), ROptionExpirations.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rOptionExpirations;
    }

    public ROptionChain getOptionChain(String underlyingSymbol, String expiration) {
        ROptionChain rOptionChain = null;
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.set("Authorization", "Bearer " + accessToken);

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(optionChainUrl)
                .queryParam("symbol", underlyingSymbol)
                .queryParam("expiration", expiration);

        HttpEntity<String> entity = new HttpEntity<String>(headers);

        try {
            HttpEntity<String> responsePayload = restTemplate.exchange(
                    builder.build().encode().toUri(),
                    HttpMethod.GET,
                    entity,
                    String.class);

            logger.info("Option Chain Market Data Service Response :: {}", responsePayload);

            rOptionChain = optionStrategizerUtil.unmarshallJson(responsePayload.getBody(), ROptionChain.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rOptionChain;
    }

}
