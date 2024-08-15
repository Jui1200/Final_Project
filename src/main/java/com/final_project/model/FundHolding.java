package com.final_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import javax.validation.constraints.NotNull;

@Entity
public class FundHolding {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer fundholdingID;

    @NotNull
    private String userID;

    @NotNull
    private Integer fundID;

    // Constructors
    public FundHolding() {
    }

    public FundHolding(Integer fundholdingID, String userID, Integer fundID) {
        this.fundholdingID = fundholdingID;
        this.userID = userID;
        this.fundID = fundID;
    }

    // Getters and Setters
    public Integer getFundholdingID() {
        return fundholdingID;
    }

    public void setFundholdingID(Integer fundholdingID) {
        this.fundholdingID = fundholdingID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public Integer getFundID() {
        return fundID;
    }

    public void setFundID(Integer fundID) {
        this.fundID = fundID;
    }
}
