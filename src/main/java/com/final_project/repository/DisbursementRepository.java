package com.final_project.repository;

import com.final_project.model.Disbursement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DisbursementRepository extends JpaRepository<Disbursement, Integer> {
    
    List<Disbursement> findByUserID(String userID);
    
    List<Disbursement> findBySettlementAccountID(String settlementAccountID);
    
    List<Disbursement> findByOtherAccountID(String otherAccountID);
}
