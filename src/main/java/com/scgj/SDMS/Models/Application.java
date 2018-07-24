package com.scgj.SDMS.Models;


import javax.persistence.Column;
import javax.persistence.Id;

public class Application {

    @Id
    @Column(name = "applicationId")
    private int applicationId;

    @Column(name = "type")
    private String type;

    @Column(name = "status")
    private String status;

    @Column(name = "comment")
    private String comment;

    @Column(name = "isRejected")
    private String isRejected;


    public Application() {
    }

    public Application(int applicationId, String type, String status, String comment, String isRejected) {
        this.applicationId = applicationId;
        this.type = type;
        this.status = status;
        this.comment = comment;
        this.isRejected = isRejected;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getIsRejected() {
        return isRejected;
    }

    public void setIsRejected(String isRejected) {
        this.isRejected = isRejected;
    }
}
