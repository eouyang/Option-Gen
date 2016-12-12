package com.optiongen.optionstrategizer.service.util.rest.dto;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

/**
 * Created by eouyang on 12/10/16.
 */

public class ROption {

    @SerializedName("symbol")
    private String symbol;

    @SerializedName("strike")
    private BigDecimal strike;

    @SerializedName("expiration_date")
    private String expirationDate;

    @SerializedName("option_type")
    private String optionType;

    @SerializedName("contract_size")
    private Integer contractSize;

    @SerializedName("expiration_type")
    private String expirationType;

    @SerializedName("underlying")
    private String underlying;

    @SerializedName("root_symbol")
    private String rootSymbol;

    @SerializedName("description")
    private String description;

    @SerializedName("exch")
    private String exchange;

    @SerializedName("type")
    private String type;

    @SerializedName("last")
    private BigDecimal last;

    @SerializedName("change")
    private BigDecimal change;

    @SerializedName("change_percentage")
    private BigDecimal changePercentage;

    @SerializedName("volume")
    private Integer volume;

    @SerializedName("average_volume")
    private Double averageVolume;

    @SerializedName("last_volume")
    private Integer lastVolume;

    @SerializedName("trade_date")
    private Long tradeDate;

    @SerializedName("open")
    private BigDecimal open;

    @SerializedName("high")
    private BigDecimal high;

    @SerializedName("low")
    private BigDecimal low;

    @SerializedName("close")
    private BigDecimal close;

    @SerializedName("prevclose")
    private BigDecimal prevClose;

    @SerializedName("week_52_high")
    private BigDecimal week52High;

    @SerializedName("week_52_low")
    private BigDecimal week52Low;

    @SerializedName("bid")
    private BigDecimal bid;

    @SerializedName("bidsize")
    private Integer bidSize;

    @SerializedName("bidexch")
    private String bidExch;

    @SerializedName("bid_date")
    private Long bidDate;

    @SerializedName("ask")
    private BigDecimal ask;

    @SerializedName("asksize")
    private Integer askSize;

    @SerializedName("askexch")
    private String askExch;

    @SerializedName("ask_date")
    private Long askDate;

    @SerializedName("open_interest")
    private Integer openInterest;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public BigDecimal getStrike() {
        return strike;
    }

    public void setStrike(BigDecimal strike) {
        this.strike = strike;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getOptionType() {
        return optionType;
    }

    public void setOptionType(String optionType) {
        this.optionType = optionType;
    }

    public Integer getContractSize() {
        return contractSize;
    }

    public void setContractSize(Integer contractSize) {
        this.contractSize = contractSize;
    }

    public String getExpirationType() {
        return expirationType;
    }

    public void setExpirationType(String expirationType) {
        this.expirationType = expirationType;
    }

    public String getUnderlying() {
        return underlying;
    }

    public void setUnderlying(String underlying) {
        this.underlying = underlying;
    }

    public String getRootSymbol() {
        return rootSymbol;
    }

    public void setRootSymbol(String rootSymbol) {
        this.rootSymbol = rootSymbol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getLast() {
        return last;
    }

    public void setLast(BigDecimal last) {
        this.last = last;
    }

    public BigDecimal getChange() {
        return change;
    }

    public void setChange(BigDecimal change) {
        this.change = change;
    }

    public BigDecimal getChangePercentage() {
        return changePercentage;
    }

    public void setChangePercentage(BigDecimal changePercentage) {
        this.changePercentage = changePercentage;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Double getAverageVolume() {
        return averageVolume;
    }

    public void setAverageVolume(Double averageVolume) {
        this.averageVolume = averageVolume;
    }

    public Integer getLastVolume() {
        return lastVolume;
    }

    public void setLastVolume(Integer lastVolume) {
        this.lastVolume = lastVolume;
    }

    public Long getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Long tradeDate) {
        this.tradeDate = tradeDate;
    }

    public BigDecimal getOpen() {
        return open;
    }

    public void setOpen(BigDecimal open) {
        this.open = open;
    }

    public BigDecimal getHigh() {
        return high;
    }

    public void setHigh(BigDecimal high) {
        this.high = high;
    }

    public BigDecimal getLow() {
        return low;
    }

    public void setLow(BigDecimal low) {
        this.low = low;
    }

    public BigDecimal getClose() {
        return close;
    }

    public void setClose(BigDecimal close) {
        this.close = close;
    }

    public BigDecimal getPrevClose() {
        return prevClose;
    }

    public void setPrevClose(BigDecimal prevClose) {
        this.prevClose = prevClose;
    }

    public BigDecimal getWeek52High() {
        return week52High;
    }

    public void setWeek52High(BigDecimal week52High) {
        this.week52High = week52High;
    }

    public BigDecimal getWeek52Low() {
        return week52Low;
    }

    public void setWeek52Low(BigDecimal week52Low) {
        this.week52Low = week52Low;
    }

    public BigDecimal getBid() {
        return bid;
    }

    public void setBid(BigDecimal bid) {
        this.bid = bid;
    }

    public Integer getBidSize() {
        return bidSize;
    }

    public void setBidSize(Integer bidSize) {
        this.bidSize = bidSize;
    }

    public String getBidExch() {
        return bidExch;
    }

    public void setBidExch(String bidExch) {
        this.bidExch = bidExch;
    }

    public Long getBidDate() {
        return bidDate;
    }

    public void setBidDate(Long bidDate) {
        this.bidDate = bidDate;
    }

    public BigDecimal getAsk() {
        return ask;
    }

    public void setAsk(BigDecimal ask) {
        this.ask = ask;
    }

    public Integer getAskSize() {
        return askSize;
    }

    public void setAskSize(Integer askSize) {
        this.askSize = askSize;
    }

    public String getAskExch() {
        return askExch;
    }

    public void setAskExch(String askExch) {
        this.askExch = askExch;
    }

    public Long getAskDate() {
        return askDate;
    }

    public void setAskDate(Long askDate) {
        this.askDate = askDate;
    }

    public Integer getOpenInterest() {
        return openInterest;
    }

    public void setOpenInterest(Integer openInterest) {
        this.openInterest = openInterest;
    }

    @Override
    public String toString() {
        return "ROption{" +
                "symbol='" + symbol + '\'' +
                ", strike=" + strike +
                ", expirationDate='" + expirationDate + '\'' +
                ", optionType='" + optionType + '\'' +
                ", contractSize=" + contractSize +
                ", expirationType='" + expirationType + '\'' +
                ", underlying='" + underlying + '\'' +
                ", rootSymbol='" + rootSymbol + '\'' +
                ", description='" + description + '\'' +
                ", exchange='" + exchange + '\'' +
                ", type='" + type + '\'' +
                ", last=" + last +
                ", change=" + change +
                ", changePercentage=" + changePercentage +
                ", volume=" + volume +
                ", averageVolume=" + averageVolume +
                ", lastVolume=" + lastVolume +
                ", tradeDate=" + tradeDate +
                ", open=" + open +
                ", high=" + high +
                ", low=" + low +
                ", close=" + close +
                ", prevClose=" + prevClose +
                ", week52High=" + week52High +
                ", week52Low=" + week52Low +
                ", bid=" + bid +
                ", bidSize=" + bidSize +
                ", bidExch='" + bidExch + '\'' +
                ", bidDate=" + bidDate +
                ", ask=" + ask +
                ", askSize=" + askSize +
                ", askExch='" + askExch + '\'' +
                ", askDate=" + askDate +
                ", openInterest=" + openInterest +
                '}';
    }
}
