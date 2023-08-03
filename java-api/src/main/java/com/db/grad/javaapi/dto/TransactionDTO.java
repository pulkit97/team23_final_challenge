package com.db.grad.javaapi.dto;

import javax.persistence.Column;
import java.time.LocalDateTime;

public class TransactionDTO {
    private String currency;
    private String status;
    private float unitPrice;
    private int quantity;
    private String buySell;
    private LocalDateTime tradeDate;
    private LocalDateTime settlementDate;

    public TransactionDTO() {
    }

    public TransactionDTO(String currency, String status, float unitPrice, int quantity, String buySell, LocalDateTime tradeDate, LocalDateTime settlementDate) {
        this.currency = currency;
        this.status = status;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.buySell = buySell;
        this.tradeDate = tradeDate;
        this.settlementDate = settlementDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBuySell() {
        return buySell;
    }

    public void setBuySell(String buySell) {
        this.buySell = buySell;
    }

    public LocalDateTime getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(LocalDateTime tradeDate) {
        this.tradeDate = tradeDate;
    }

    public LocalDateTime getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(LocalDateTime settlementDate) {
        this.settlementDate = settlementDate;
    }

    @Override
    public String toString() {
        return "TransactionDTO{" +
                "currency='" + currency + '\'' +
                ", status='" + status + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", buySell='" + buySell + '\'' +
                ", tradeDate=" + tradeDate +
                ", settlementDate=" + settlementDate +
                '}';
    }
}
