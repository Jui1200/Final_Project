package com.final_project.repository;

import com.final_project.model.FundHolding;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FundHoldingRepository extends JpaRepository<FundHolding, Integer> {
    
    List<FundHolding> findByUserID(String userID);
    
    List<FundHolding> findByFundID(Integer fundID);
}
