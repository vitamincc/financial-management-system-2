package com.xuzhu.fmsfinanceproductservice.domain;

import java.math.BigDecimal;

import static java.lang.Integer.parseInt;

public class Item implements Comparable<Item>{
    private String financeItemName;
    private String financeItemKind;
    private String financeItemOutOrIn;
    private BigDecimal financeItemPerPrice;
    private BigDecimal financeItemAmount;
    private String financeItemTimePoint;
    private String financeItemInfo;

    public void setFinanceItemName(String financeItemName) {
        this.financeItemName = financeItemName;
    }

    public String getFinanceItemName() {
        return financeItemName;
    }

    public void setFinanceItemKind(String financeItemKind) {
        this.financeItemKind = financeItemKind;
    }

    public String getFinanceItemKind() {
        return financeItemKind;
    }

    public void setFinanceItemOutOrIn(String financeItemOutOrIn) {
        this.financeItemOutOrIn = financeItemOutOrIn;
    }

    public String getFinanceItemOutOrIn() {
        return financeItemOutOrIn;
    }

    public void setFinanceItemPerPrice(BigDecimal financeItemPerPrice) {
        this.financeItemPerPrice = financeItemPerPrice;
    }

    public BigDecimal getFinanceItemPerPrice() {
        return financeItemPerPrice;
    }

    public void setFinanceItemAmount(BigDecimal financeItemAmount) {
        this.financeItemAmount = financeItemAmount;
    }

    public BigDecimal getFinanceItemAmount() {
        return financeItemAmount;
    }

    public void setFinanceItemTimePoint(String financeItemTimePoint) {
        this.financeItemTimePoint = financeItemTimePoint;
    }

    public String getFinanceItemTimePoint() {
        return financeItemTimePoint;
    }

    public void setFinanceItemInfo(String financeItemInfo) {
        this.financeItemInfo = financeItemInfo;
    }

    public String getFinanceItemInfo() {
        return financeItemInfo;
    }

    @Override
    public int compareTo(Item o) {
        String[] timePointOfThis = this.financeItemTimePoint.split("-");
        String[] timePointOfO = o.getFinanceItemTimePoint().split("-");
        if(parseInt(timePointOfThis[0]) < parseInt(timePointOfO[0])){
            return -1;
        }
        else if (parseInt(timePointOfThis[0]) == parseInt(timePointOfO[0])) {
            if (parseInt(timePointOfThis[1]) < parseInt(timePointOfO[1])) return -1;
            else if (parseInt(timePointOfThis[1]) == parseInt(timePointOfO[1])) {
                if (parseInt(timePointOfThis[2]) < parseInt(timePointOfO[2])) return -1;
                else if (parseInt(timePointOfThis[2]) == parseInt(timePointOfO[2])) return 0;
                else return 1;
            }
            else return 1;
        }
        else return 1;
    }
}
