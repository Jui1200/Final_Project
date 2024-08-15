package com.final_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class SecurityAccount {

    @Id
    @NotNull
    @Size(max = 20) // 假設證券帳號長度最大為20個字符
    private String securitiesAccountID;

    private String securitiesFirm;
    private String status;

    @ManyToOne
    @JoinColumn(name = "settlement_account_id")
    private SettlementAccount settlementAccount;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Constructors
    public SecurityAccount() {
    }

    public SecurityAccount(String securitiesAccountID, String securitiesFirm, String status, SettlementAccount settlementAccount, User user) {
        this.securitiesAccountID = securitiesAccountID;
        this.securitiesFirm = securitiesFirm;
        this.status = status;
        this.settlementAccount = settlementAccount;
        this.user = user;
    }

    // Getters and Setters
    public String getSecuritiesAccountID() {
        return securitiesAccountID;
    }

    public void setSecuritiesAccountID(String securitiesAccountID) {
        this.securitiesAccountID = securitiesAccountID;
    }

    public String getSecuritiesFirm() {
        return securitiesFirm;
    }

    public void setSecuritiesFirm(String securitiesFirm) {
        this.securitiesFirm = securitiesFirm;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SettlementAccount getSettlementAccount() {
        return settlementAccount;
    }

    public void setSettlementAccount(SettlementAccount settlementAccount) {
        this.settlementAccount = settlementAccount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
