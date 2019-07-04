package com.qphone.pojo;

import java.io.Serializable;

public class Admin implements Serializable {
    private Integer adminId;

    private String adminName;

    private String adminNickname;

    private String adminPassword;

    private String adminProfilePictureSrc;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminNickname() {
        return adminNickname;
    }

    public void setAdminNickname(String adminNickname) {
        this.adminNickname = adminNickname == null ? null : adminNickname.trim();
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    public String getAdminProfilePictureSrc() {
        return adminProfilePictureSrc;
    }

    public void setAdminProfilePictureSrc(String adminProfilePictureSrc) {
        this.adminProfilePictureSrc = adminProfilePictureSrc == null ? null : adminProfilePictureSrc.trim();
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", adminName='" + adminName + '\'' +
                ", adminNickname='" + adminNickname + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                ", adminProfilePictureSrc='" + adminProfilePictureSrc + '\'' +
                '}';
    }
}