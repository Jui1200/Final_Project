package com.final_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.time.LocalDate;

@Entity
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer recordID;

    @NotNull
    private String userID;

    @NotNull
    private LocalDate recordDate;

    @NotNull
    private String flowType;

    @NotNull
    @Positive
    private Integer amount;

    @NotNull
    @Positive
    private Integer walletBalance;

    // Constructors
    public Record() {
    }

    public Record(Integer recordID, String userID, LocalDate recordDate, String flowType, Integer amount, Integer walletBalance) {
        this.recordID = recordID;
        this.userID = userID;
        this.recordDate = recordDate;
        this.flowType = flowType;
        this.amount = amount;
        this.walletBalance = walletBalance;
    }

    // Getters and Setters
    public Integer getRecordID() {
        return recordID;
    }

    public void setRecordID(Integer recordID) {
        this.recordID = recordID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public LocalDate getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(LocalDate recordDate) {
        this.recordDate = recordDate;
    }

    public String getFlowType() {
        return flowType;
    }

    public void setFlowType(String flowType) {
        this.flowType = flowType;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(Integer walletBalance) {
        this.walletBalance = walletBalance;
    }
}
