package com.smalltomato.bean;

import java.util.Date;

public class Stock extends StockKey {
    private String name;

    private String opening;

    private String yesterdayClose;

    private String highest;

    private String lowest;

    private String totalVolume;

    private String totalLimit;

    private String buyOneVolume;

    private String buyTwoVolume;

    private String buyThreeVolume;

    private String buyFourVolume;

    private String buyFiveVolume;

    private String buyOnePrice;

    private String buyTwoPrice;

    private String buyThreePrice;

    private String buyFourPrice;

    private String buyFivePrice;

    private String sellOneVolume;

    private String sellTwoVolume;

    private String sellThreeVolume;

    private String sellFourVolume;

    private String sellFiveVolume;

    private String sellOnePrice;

    private String sellTwoPrice;

    private String sellThreePrice;

    private String sellFourPrice;

    private String sellFivePrice;

    private String time;

    private Date createDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getOpening() {
        return opening;
    }

    public void setOpening(String opening) {
        this.opening = opening == null ? null : opening.trim();
    }

    public String getYesterdayClose() {
        return yesterdayClose;
    }

    public void setYesterdayClose(String yesterdayClose) {
        this.yesterdayClose = yesterdayClose == null ? null : yesterdayClose.trim();
    }

    public String getHighest() {
        return highest;
    }

    public void setHighest(String highest) {
        this.highest = highest == null ? null : highest.trim();
    }

    public String getLowest() {
        return lowest;
    }

    public void setLowest(String lowest) {
        this.lowest = lowest == null ? null : lowest.trim();
    }

    public String getTotalVolume() {
        return totalVolume;
    }

    public void setTotalVolume(String totalVolume) {
        this.totalVolume = totalVolume == null ? null : totalVolume.trim();
    }

    public String getTotalLimit() {
        return totalLimit;
    }

    public void setTotalLimit(String totalLimit) {
        this.totalLimit = totalLimit == null ? null : totalLimit.trim();
    }

    public String getBuyOneVolume() {
        return buyOneVolume;
    }

    public void setBuyOneVolume(String buyOneVolume) {
        this.buyOneVolume = buyOneVolume == null ? null : buyOneVolume.trim();
    }

    public String getBuyTwoVolume() {
        return buyTwoVolume;
    }

    public void setBuyTwoVolume(String buyTwoVolume) {
        this.buyTwoVolume = buyTwoVolume == null ? null : buyTwoVolume.trim();
    }

    public String getBuyThreeVolume() {
        return buyThreeVolume;
    }

    public void setBuyThreeVolume(String buyThreeVolume) {
        this.buyThreeVolume = buyThreeVolume == null ? null : buyThreeVolume.trim();
    }

    public String getBuyFourVolume() {
        return buyFourVolume;
    }

    public void setBuyFourVolume(String buyFourVolume) {
        this.buyFourVolume = buyFourVolume == null ? null : buyFourVolume.trim();
    }

    public String getBuyFiveVolume() {
        return buyFiveVolume;
    }

    public void setBuyFiveVolume(String buyFiveVolume) {
        this.buyFiveVolume = buyFiveVolume == null ? null : buyFiveVolume.trim();
    }

    public String getBuyOnePrice() {
        return buyOnePrice;
    }

    public void setBuyOnePrice(String buyOnePrice) {
        this.buyOnePrice = buyOnePrice == null ? null : buyOnePrice.trim();
    }

    public String getBuyTwoPrice() {
        return buyTwoPrice;
    }

    public void setBuyTwoPrice(String buyTwoPrice) {
        this.buyTwoPrice = buyTwoPrice == null ? null : buyTwoPrice.trim();
    }

    public String getBuyThreePrice() {
        return buyThreePrice;
    }

    public void setBuyThreePrice(String buyThreePrice) {
        this.buyThreePrice = buyThreePrice == null ? null : buyThreePrice.trim();
    }

    public String getBuyFourPrice() {
        return buyFourPrice;
    }

    public void setBuyFourPrice(String buyFourPrice) {
        this.buyFourPrice = buyFourPrice == null ? null : buyFourPrice.trim();
    }

    public String getBuyFivePrice() {
        return buyFivePrice;
    }

    public void setBuyFivePrice(String buyFivePrice) {
        this.buyFivePrice = buyFivePrice == null ? null : buyFivePrice.trim();
    }

    public String getSellOneVolume() {
        return sellOneVolume;
    }

    public void setSellOneVolume(String sellOneVolume) {
        this.sellOneVolume = sellOneVolume == null ? null : sellOneVolume.trim();
    }

    public String getSellTwoVolume() {
        return sellTwoVolume;
    }

    public void setSellTwoVolume(String sellTwoVolume) {
        this.sellTwoVolume = sellTwoVolume == null ? null : sellTwoVolume.trim();
    }

    public String getSellThreeVolume() {
        return sellThreeVolume;
    }

    public void setSellThreeVolume(String sellThreeVolume) {
        this.sellThreeVolume = sellThreeVolume == null ? null : sellThreeVolume.trim();
    }

    public String getSellFourVolume() {
        return sellFourVolume;
    }

    public void setSellFourVolume(String sellFourVolume) {
        this.sellFourVolume = sellFourVolume == null ? null : sellFourVolume.trim();
    }

    public String getSellFiveVolume() {
        return sellFiveVolume;
    }

    public void setSellFiveVolume(String sellFiveVolume) {
        this.sellFiveVolume = sellFiveVolume == null ? null : sellFiveVolume.trim();
    }

    public String getSellOnePrice() {
        return sellOnePrice;
    }

    public void setSellOnePrice(String sellOnePrice) {
        this.sellOnePrice = sellOnePrice == null ? null : sellOnePrice.trim();
    }

    public String getSellTwoPrice() {
        return sellTwoPrice;
    }

    public void setSellTwoPrice(String sellTwoPrice) {
        this.sellTwoPrice = sellTwoPrice == null ? null : sellTwoPrice.trim();
    }

    public String getSellThreePrice() {
        return sellThreePrice;
    }

    public void setSellThreePrice(String sellThreePrice) {
        this.sellThreePrice = sellThreePrice == null ? null : sellThreePrice.trim();
    }

    public String getSellFourPrice() {
        return sellFourPrice;
    }

    public void setSellFourPrice(String sellFourPrice) {
        this.sellFourPrice = sellFourPrice == null ? null : sellFourPrice.trim();
    }

    public String getSellFivePrice() {
        return sellFivePrice;
    }

    public void setSellFivePrice(String sellFivePrice) {
        this.sellFivePrice = sellFivePrice == null ? null : sellFivePrice.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}