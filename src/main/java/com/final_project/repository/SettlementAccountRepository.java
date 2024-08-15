package com.final_project.repository;

import com.final_project.model.SettlementAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SettlementAccountRepository extends JpaRepository<SettlementAccount, String> {
    
    List<SettlementAccount> findByBank(String bank);
    
    List<SettlementAccount> findByUserID(String userID);
}
