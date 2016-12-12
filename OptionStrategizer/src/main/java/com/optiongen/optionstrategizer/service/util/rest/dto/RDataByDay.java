package com.optiongen.optionstrategizer.service.util.rest.dto;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by eouyang on 12/11/16.
 */
public class RDataByDay {

    @SerializedName("date")
    private String date;

    @SerializedName("open")
    private BigDecimal open;

    @SerializedName("close")
    private BigDecimal close;

    @SerializedName("high")
    private BigDecimal high;

    @SerializedName("low")
    private BigDecimal low;

    @SerializedName("volume")
    private BigInteger volume;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public BigDecimal getOpen() {
        return open;
    }

    public void setOpen(BigDecimal open) {
        this.open = open;
    }

    public BigDecimal getClose() {
        return close;
    }

    public void setClose(BigDecimal close) {
        this.close = close;
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

    public BigInteger getVolume() {
        return volume;
    }

    public void setVolume(BigInteger volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "RDataByDay{" +
                "date='" + date + '\'' +
                ", open=" + open +
                ", close=" + close +
                ", high=" + high +
                ", low=" + low +
                ", volume=" + volume +
                '}';
    }
}
