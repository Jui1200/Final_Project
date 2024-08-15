package com.final_project.repository;

import com.final_project.model.SecurityAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SecurityAccountRepository extends JpaRepository<SecurityAccount, String> {
    
    List<SecurityAccount> findBySecuritiesFirm(String securitiesFirm);
    
    List<SecurityAccount> findByStatus(String status);
    
    List<SecurityAccount> findByUserID(String userID);
}
