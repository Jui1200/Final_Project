package com.final_project.repository;

import com.final_project.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    
    List<Order> findByUserID(String userID);
    
    List<Order> findByStockID(Integer stockID);
    
    List<Order> findByStatus(String status);
}
