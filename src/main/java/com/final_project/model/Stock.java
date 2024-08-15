package com.final_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer stockID;

    @NotNull
    private String name;

    @NotNull
    @Size(max = 10) // 股票代號最大長度為10
    private String symbol;

    private String description;

    @NotNull
    private BigDecimal currentPrice;

    private String sector;

    private LocalDate updatedDate;

    // Constructors
    public Stock() {
    }

    public Stock(Integer stockID, String name, String symbol, String description, BigDecimal currentPrice, String sector, LocalDate updatedDate) {
        this.stockID = stockID;
        this.name = name;
        this.symbol = symbol;
        this.description = description;
        this.currentPrice = currentPrice;
        this.sector = sector;
        this.updatedDate = updatedDate;
    }

    // Getters and Setters
    public Integer getStockID() {
        return stockID;
    }

    public void setStockID(Integer stockID) {
        this.stockID = stockID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }
}
