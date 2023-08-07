package com.db.grad.javaapi.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "security")
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String isin;
    private String cusip;
    @Column(name = "issuer_name")
    private String issuerName;
    @Column(name = "maturity_date")
    private LocalDateTime maturityDate;
    private float coupon;
    private String type;
    @Column(name = "face_value")
    private float faceValue;
    private String currency;
    private String status;
    @Column(name = "bond_holder")
    private String bondHolder;

    public Security(int id, String isin, String cusip, String issuerName, LocalDateTime maturityDate, float coupon, String type, float faceValue, String currency, String status) {
        this.id = id;
        this.isin = isin;
        this.cusip = cusip;
        this.issuerName = issuerName;
        this.maturityDate = maturityDate;
        this.coupon = coupon;
        this.type = type;
        this.faceValue = faceValue;
        this.currency = currency;
        this.status = status;
    }

    public Security() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public String getCusip() {
        return cusip;
    }

    public void setCusip(String cusip) {
        this.cusip = cusip;
    }

    public String getIssuerName() {
        return issuerName;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }

    public LocalDateTime getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(LocalDateTime maturityDate) {
        this.maturityDate = maturityDate;
    }

    public float getCoupon() {
        return coupon;
    }

    public void setCoupon(float coupon) {
        this.coupon = coupon;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(float faceValue) {
        this.faceValue = faceValue;
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

    @Override
    public String toString() {
        return "Security{" +
                "id=" + id +
                ", isin='" + isin + '\'' +
                ", cusip='" + cusip + '\'' +
                ", issuerName='" + issuerName + '\'' +
                ", maturityDate=" + maturityDate +
                ", coupon=" + coupon +
                ", type='" + type + '\'' +
                ", faceValue=" + faceValue +
                ", currency='" + currency + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String getBondHolder() {
        return bondHolder;
    }

    public void setBondHolder(String bondHolder) {
        this.bondHolder = bondHolder;
    }
}
