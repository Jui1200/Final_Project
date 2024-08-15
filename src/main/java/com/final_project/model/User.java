package com.final_project.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
public class User {

    @Id
    @NotNull
    @Size(min = 10, max = 10) // 身分證字號應該為10個字符
    private String userID;

    @NotNull
    @Size(min = 12)
    @Pattern.List({
        @Pattern(regexp = ".*[A-Z].*"),  // 包含大寫字母
        @Pattern(regexp = ".*[a-z].*"),  // 包含小寫字母
        @Pattern(regexp = ".*\\d.*")     // 包含數字
    })
    private String password;

    private String nickName;
    private String realName;

    @NotNull
    @Email  // 檢查是否為有效的電子郵件地址
    private String email;

    private String address;

    @NotNull
    @Size(min = 10, max = 10) // 手機號碼應該為10個字符
    private String phoneNum;

    private LocalDate createdDate;

    // Constructors
    public User() {
    }

    public User(String userID, String password, String nickName, String realName, String email, String address, String phoneNum, LocalDate createdDate) {
        this.userID = userID;
        this.password = password;
        this.nickName = nickName;
        this.realName = realName;
        this.email = email;
        this.address = address;
        this.phoneNum = phoneNum;
        this.createdDate = createdDate;
    }

    // Getters and Setters
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }
}
