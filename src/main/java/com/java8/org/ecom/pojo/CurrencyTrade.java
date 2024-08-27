package com.java8.org.ecom.pojo;

public class CurrencyTrade {

    private String email;


    private String currencyPair;
    private int id;
    private double entryPrice;
    private double exitPrice;


    private double lotSize;
    private String tradeType;

    public CurrencyTrade(String email, int id, double entryPrice, double exitPrice, double lotSize, String tradeType, String currencyPair) {
        this.email = email;
        this.id = id;
        this.entryPrice = entryPrice;
        this.exitPrice = exitPrice;
        this.tradeType = tradeType;
        this.lotSize = lotSize;
        this.currencyPair = currencyPair;
    }


    public CurrencyTrade() {
    }

    public String getCurrencyPair() {
        return currencyPair;
    }

    public double getLotSize() {
        return lotSize;
    }

    public void setLotSize(double lotSize) {
        this.lotSize = lotSize;
    }

    public void setCurrencyPair(String currencyPair) {
        this.currencyPair = currencyPair;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getEntryPrice() {
        return entryPrice;
    }

    public void setEntryPrice(double entryPrice) {
        this.entryPrice = entryPrice;
    }

    public double getExitPrice() {
        return exitPrice;
    }

    public void setExitPrice(double exitPrice) {
        this.exitPrice = exitPrice;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }


}
