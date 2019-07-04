package com.qphone.pojo;

import java.io.Serializable;

public class Address implements Serializable{
    private String addressAreaid;

    private String addressName;

    private String addressRegionid;

    public String getAddressAreaid() {
        return addressAreaid;
    }

    public void setAddressAreaid(String addressAreaid) {
        this.addressAreaid = addressAreaid == null ? null : addressAreaid.trim();
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName == null ? null : addressName.trim();
    }

    public String getAddressRegionid() {
        return addressRegionid;
    }

    public void setAddressRegionid(String addressRegionid) {
        this.addressRegionid = addressRegionid == null ? null : addressRegionid.trim();
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressAreaid='" + addressAreaid + '\'' +
                ", addressName='" + addressName + '\'' +
                ", addressRegionid='" + addressRegionid + '\'' +
                '}';
    }
}