package com.final_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class SettlementAccount {

    @Id
    @NotNull
    @Size(max = 20) // 假設交割戶帳號長度最大為20個字符
    private String settlementAccountID;

    private String bank;

    @NotNull
    private double balance;

    @NotNull
    @Size(max = 10) // 假設使用者ID長度最大為10個字符
    private String userID;

    // Constructors
    public SettlementAccount() {
    }

    public SettlementAccount(String settlementAccountID, String bank, double balance, String userID) {
        this.settlementAccountID = settlementAccountID;
        this.bank = bank;
        this.balance = balance;
        this.userID = userID;
    }

    // Getters and Setters
    public String getSettlementAccountID() {
        return settlementAccountID;
    }

    public void setSettlementAccountID(String settlementAccountID) {
        this.settlementAccountID = settlementAccountID;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
