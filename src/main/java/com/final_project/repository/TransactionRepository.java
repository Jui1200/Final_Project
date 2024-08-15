package com.final_project.repository;

import com.final_project.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    
    List<Transaction> findByUserID(String userID);
    
    List<Transaction> findByStockID(Integer stockID);
    
    List<Transaction> findBySort(String sort);
}
