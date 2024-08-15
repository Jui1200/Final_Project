package com.final_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderID;

    @NotNull
    private String userID;

    @NotNull
    private Integer stockID;

    @NotNull
    private String type;

    private String sort;

    @NotNull
    @Positive
    private Integer quantity;

    @NotNull
    private BigDecimal pricePerShare;

    @NotNull
    private String status;

    @NotNull
    private BigDecimal totalPrice;

    private LocalDate orderTime;

    // Constructors
    public Order() {
    }

    public Order(Integer orderID, String userID, Integer stockID, String type, String sort, Integer quantity, BigDecimal pricePerShare, String status, BigDecimal totalPrice, LocalDate orderTime) {
        this.orderID = orderID;
        this.userID = userID;
        this.stockID = stockID;
        this.type = type;
        this.sort = sort;
        this.quantity = quantity;
        this.pricePerShare = pricePerShare;
        this.status = status;
        this.totalPrice = totalPrice;
        this.orderTime = orderTime;
    }

    // Getters and Setters
    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDate getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDate orderTime) {
        this.orderTime = orderTime;
    }
}
