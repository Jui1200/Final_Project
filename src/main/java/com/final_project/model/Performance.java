package com.final_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.YearMonth;

@Entity
public class Performance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer performanceID;

    @NotNull
    private String userID;

    @NotNull
    private YearMonth yearMonth;

    @NotNull
    @Positive
    private BigDecimal totalInvestment;

    @NotNull
    @Positive
    private BigDecimal currentAmount;

    @NotNull
    private BigDecimal returnAmount;

    // Constructors
    public Performance() {
    }

    public Performance(Integer performanceID, String userID, YearMonth yearMonth, BigDecimal totalInvestment, BigDecimal currentAmount, BigDecimal returnAmount) {
        this.performanceID = performanceID;
        this.userID = userID;
        this.yearMonth = yearMonth;
        this.totalInvestment = totalInvestment;
        this.currentAmount = currentAmount;
        this.returnAmount = returnAmount;
    }

    // Getters and Setters
    public Integer getPerformanceID() {
        return performanceID;
    }

    public void setPerformanceID(Integer performanceID) {
        this.performanceID = performanceID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public YearMonth getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(YearMonth yearMonth) {
        this.yearMonth = yearMonth;
    }

    public BigDecimal getTotalInvestment() {
        return totalInvestment;
    }

    public void setTotalInvestment(BigDecimal totalInvestment) {
        this.totalInvestment = totalInvestment;
    }

    public BigDecimal getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(BigDecimal currentAmount) {
        this.currentAmount = currentAmount;
    }

    public BigDecimal getReturnAmount() {
        return returnAmount;
    }

    public void setReturnAmount(BigDecimal returnAmount) {
        this.returnAmount = returnAmount;
    }
}
