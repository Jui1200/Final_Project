package com.final_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import javax.validation.constraints.NotNull;

@Entity
public class StockHolding {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer stockholdingID;

    @NotNull
    private String userID;

    @NotNull
    private Integer stockID;

    // Constructors
    public StockHolding() {
    }

    public StockHolding(Integer stockholdingID, String userID, Integer stockID) {
        this.stockholdingID = stockholdingID;
        this.userID = userID;
        this.stockID = stockID;
    }

    // Getters and Setters
    public Integer getStockholdingID() {
        return stockholdingID;
    }

    public void setStockholdingID(Integer stockholdingID) {
        this.stockholdingID = stockholdingID;
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
}
