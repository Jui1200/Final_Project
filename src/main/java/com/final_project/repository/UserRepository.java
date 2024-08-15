package com.final_project.repository;

import com.final_project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    // 根據 userID 查詢使用者
    Optional<User> findByUserID(String userID);

    // 根據 email 查詢使用者
    Optional<User> findByEmail(String email);

    // 根據手機號碼查詢使用者
    Optional<User> findByPhoneNum(String phoneNum);

    // 自定義查詢方法範例（可以根據需求添加更多）
    // List<User> findByNickNameContaining(String keyword);
}
