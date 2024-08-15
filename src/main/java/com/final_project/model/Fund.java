package com.final_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
public class Fund {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer fundID;

    @NotNull
    @Positive
    private BigDecimal amount;

    @NotNull
    private String fundType;

    @NotNull
    private BigDecimal currentPrice;

    private String manageCompany;

    // Constructors
    public Fund() {
    }

    public Fund(Integer fundID, BigDecimal amount, String fundType, BigDecimal currentPrice, String manageCompany) {
        this.fundID = fundID;
        this.amount = amount;
        this.fundType = fundType;
        this.currentPrice = currentPrice;
        this.manageCompany = manageCompany;
    }

    // Getters and Setters
    public Integer getFundID() {
        return fundID;
    }

    public void setFundID(Integer fundID) {
        this.fundID = fundID;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType;
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getManageCompany() {
        return manageCompany;
    }

    public void setManageCompany(String manageCompany) {
        this.manageCompany = manageCompany;
    }
}
