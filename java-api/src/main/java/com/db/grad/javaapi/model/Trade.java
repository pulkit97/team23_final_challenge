package com.db.grad.javaapi.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "trades")
public class Trade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String currency;
    private String status;
    @Column(name = "unit_price")
    private float unitPrice;
    private int quantity;
    @Column(name = "buy_sell")
    private String buySell;
    @Column(name = "trade_date")
    private LocalDateTime tradeDate;
    @Column(name = "settlement_date")
    private LocalDateTime settlementDate;

    private int book_id;

    private int security_id;

    private int counterparty_id;


    public Trade() {
    }

    public Trade(int id, String currency, String status, float unitPrice, int quantity, String buySell, LocalDateTime tradeDate, LocalDateTime settlementDate, int book_id, int security_id, int counterparty_id) {
        this.id = id;
        this.currency = currency;
        this.status = status;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.buySell = buySell;
        this.tradeDate = tradeDate;
        this.settlementDate = settlementDate;
        this.book_id = book_id;
        this.security_id = security_id;
        this.counterparty_id = counterparty_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "Trade{" +
                "id=" + id +
                ", currency='" + currency + '\'' +
                ", status='" + status + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", buySell='" + buySell + '\'' +
                ", tradeDate=" + tradeDate +
                ", settlementDate=" + settlementDate +
                '}';
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getSecurity_id() {
        return security_id;
    }

    public void setSecurity_id(int security_id) {
        this.security_id = security_id;
    }

    public int getCounterparty_id() {
        return counterparty_id;
    }

    public void setCounterparty_id(int counterparty_id) {
        this.counterparty_id = counterparty_id;
    }
}
