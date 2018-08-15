package com.xuzhu.fmsfinanceproductservice.domain;

import java.math.BigDecimal;
import java.util.Date;

public class IncomeItem {

    private String incomeItemName;
    private BigDecimal incomeItemAmount;
    private String incomeItemTimePoint;
    private String incomeItemSource;
    private String incomeItemMode;
    private String incomeItemPeriod;
    private Date updateTime;
    private String incomeItemInfo;

    public void setIncomeItemName(String incomeItemName) {
        this.incomeItemName = incomeItemName;
    }

    public String getIncomeItemName() {
        return incomeItemName;
    }

    public void setIncomeItemAmount(BigDecimal incomeItemAmount) {
        this.incomeItemAmount = incomeItemAmount;
    }

    public BigDecimal getIncomeItemAmount() {
        return incomeItemAmount;
    }

    public void setIncomeItemPeriod(String incomeItemPeriod) {
        this.incomeItemPeriod = incomeItemPeriod;
    }

    public String getIncomeItemPeriod() {
        return incomeItemPeriod;
    }

    public String getIncomeItemTimePoint() { return incomeItemTimePoint; }

    public void setIncomeItemTimePoint(String date) { this.incomeItemTimePoint = date; }

    public Date getUpdateTime(){ return updateTime; }

    public void setUpdateTime(Date updateTime) { this.updateTime = updateTime; }

    public void setIncomeItemInfo(String incomeItemInfo) {
        this.incomeItemInfo = incomeItemInfo;
    }

    public void setIncomeItemMode(String incomeItemMode) {
        this.incomeItemMode = incomeItemMode;
    }

    public void setIncomeItemSource(String incomeItemSource) {
        this.incomeItemSource = incomeItemSource;
    }

    public String getIncomeItemSource() {
        return incomeItemSource;
    }

    public String getIncomeItemInfo() {
        return incomeItemInfo;
    }

    public String getIncomeItemMode() {
        return incomeItemMode;
    }
}
