package com.final_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transactionID;

    @NotNull
    private String userID;

    @NotNull
    private Integer stockID;

    @NotNull
    private String sort;

    @NotNull
    @Positive
    private Integer quantity;

    @NotNull
    private BigDecimal pricePerShare;

    @NotNull
    private BigDecimal totalPrice;

    @NotNull
    private LocalDateTime transactionDate;

    // Constructors
    public Transaction() {
    }

    public Transaction(Integer transactionID, String userID, Integer stockID, String sort, Integer quantity, BigDecimal pricePerShare, BigDecimal totalPrice, LocalDateTime transactionDate) {
        this.transactionID = transactionID;
        this.userID = userID;
        this.stockID = stockID;
        this.sort = sort;
        this.quantity = quantity;
        this.pricePerShare = pricePerShare;
        this.totalPrice = totalPrice;
        this.transactionDate = transactionDate;
    }

    // Getters and Setters
    public Integer getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(Integer transactionID) {
        this.transactionID = transactionID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public Integer getStockID() {
        return stockID;
    }

    public void setStockID(Integer stockID) {
        this.stockID = stockID;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPricePerShare() {
        return pricePerShare;
    }

    public void setPricePerShare(BigDecimal pricePerShare) {
        this.pricePerShare = pricePerShare;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }
}
