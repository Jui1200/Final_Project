package com.final_project.repository;

import com.final_project.model.StockHolding;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockHoldingRepository extends JpaRepository<StockHolding, Integer> {
    
    List<StockHolding> findByUserID(String userID);
    
    List<StockHolding> findByStockID(Integer stockID);
}
