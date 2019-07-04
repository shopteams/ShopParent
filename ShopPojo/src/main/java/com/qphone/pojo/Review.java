package com.qphone.pojo;

import java.io.Serializable;
import java.util.Date;

public class Review implements Serializable{
    private Integer reviewId;

    private Date reviewCreatedate;

    private Integer reviewUserId;

    private Integer reviewProductId;

    private Integer reviewOrderitemId;

    private String reviewContent;

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public Date getReviewCreatedate() {
        return reviewCreatedate;
    }

    public void setReviewCreatedate(Date reviewCreatedate) {
        this.reviewCreatedate = reviewCreatedate;
    }

    public Integer getReviewUserId() {
        return reviewUserId;
    }

    public void setReviewUserId(Integer reviewUserId) {
        this.reviewUserId = reviewUserId;
    }

    public Integer getReviewProductId() {
        return reviewProductId;
    }

    public void setReviewProductId(Integer reviewProductId) {
        this.reviewProductId = reviewProductId;
    }

    public Integer getReviewOrderitemId() {
        return reviewOrderitemId;
    }

    public void setReviewOrderitemId(Integer reviewOrderitemId) {
        this.reviewOrderitemId = reviewOrderitemId;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent == null ? null : reviewContent.trim();
    }

    @Override
    public String toString() {
        return "Review{" +
                "reviewId=" + reviewId +
                ", reviewCreatedate=" + reviewCreatedate +
                ", reviewUserId=" + reviewUserId +
                ", reviewProductId=" + reviewProductId +
                ", reviewOrderitemId=" + reviewOrderitemId +
                ", reviewContent='" + reviewContent + '\'' +
                '}';
    }
}