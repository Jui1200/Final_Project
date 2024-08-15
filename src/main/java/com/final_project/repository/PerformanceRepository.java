package com.final_project.repository;

import com.final_project.model.Performance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PerformanceRepository extends JpaRepository<Performance, Integer> {
    
    List<Performance> findByUserID(String userID);
    
    List<Performance> findByYearMonth(String yearMonth);
}
