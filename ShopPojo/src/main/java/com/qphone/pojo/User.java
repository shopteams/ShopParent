package com.qphone.pojo;

import java.util.Date;

public class User {
    private Integer userId;

    private String userName;

    private String userNickname;

    private String userPassword;

    private String userRealname;

    private Boolean userGender;

    private Date userBirthday;

    private String userAddress;

    private String userHomeplace;

    private String userProfilePictureSrc;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname == null ? null : userNickname.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserRealname() {
        return userRealname;
    }

    public void setUserRealname(String userRealname) {
        this.userRealname = userRealname == null ? null : userRealname.trim();
    }

    public Boolean getUserGender() {
        return userGender;
    }

    public void setUserGender(Boolean userGender) {
        this.userGender = userGender;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getUserHomeplace() {
        return userHomeplace;
    }

    public void setUserHomeplace(String userHomeplace) {
        this.userHomeplace = userHomeplace == null ? null : userHomeplace.trim();
    }

    public String getUserProfilePictureSrc() {
        return userProfilePictureSrc;
    }

    public void setUserProfilePictureSrc(String userProfilePictureSrc) {
        this.userProfilePictureSrc = userProfilePictureSrc == null ? null : userProfilePictureSrc.trim();
    }
}