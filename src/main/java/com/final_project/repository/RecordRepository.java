package com.final_project.repository;

import com.final_project.model.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecordRepository extends JpaRepository<Record, Integer> {
    
    List<Record> findByUserID(String userID);
    
    List<Record> findByRecordDate(java.time.LocalDate recordDate);
}
