package com.final_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Disbursement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer disbursementID;

    @NotNull
    private String userID;

    @NotNull
    private LocalDate disbursementDate;

    @NotNull
    private String settlementAccountID;

    @NotNull
    private String otherAccountID;

    @NotNull
    @Positive
    private BigDecimal amount;

    // Constructors
    public Disbursement() {
    }

    public Disbursement(Integer disbursementID, String userID, LocalDate disbursementDate, String settlementAccountID, String otherAccountID, BigDecimal amount) {
        this.disbursementID = disbursementID;
        this.userID = userID;
        this.disbursementDate = disbursementDate;
        this.settlementAccountID = settlementAccountID;
        this.otherAccountID = otherAccountID;
        this.amount = amount;
    }

    // Getters and Setters
    public Integer getDisbursementID() {
        return disbursementID;
    }

    public void setDisbursementID(Integer disbursementID) {
        this.disbursementID = disbursementID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public LocalDate getDisbursementDate() {
        return disbursementDate;
    }

    public void setDisbursementDate(LocalDate disbursementDate) {
        this.disbursementDate = disbursementDate;
    }

    public String getSettlementAccountID() {
        return settlementAccountID;
    }

    public void setSettlementAccountID(String settlementAccountID) {
        this.settlementAccountID = settlementAccountID;
    }

    public String getOtherAccountID() {
        return otherAccountID;
    }

    public void setOtherAccountID(String otherAccountID) {
        this.otherAccountID = otherAccountID;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
