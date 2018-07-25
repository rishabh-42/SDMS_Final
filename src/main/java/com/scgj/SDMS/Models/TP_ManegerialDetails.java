package com.scgj.SDMS.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tp_managerialdetails")
public class TP_ManegerialDetails {

    @Id
    @Column(name = "abId")
    private int tpId;

    @Column(name = "name")
    private String name;

    @Column(name = "designation")
    private String designation;

    @Column(name = "phnNo")
    private long phnNo;

    @Column(name = "email")
    private String email;

    @Column(name = "eduQualification")
    private String eduQualification;

    @Column(name = "experience")
    private int experience;

    @Column(name = "cv")
    private int cv;//this will be a file

    public TP_ManegerialDetails() {
    }

    public TP_ManegerialDetails(int tpId, String name, String designation, long phnNo, String email, String eduQualification, int experience, int cv) {
        this.tpId = tpId;
        this.name = name;
        this.designation = designation;
        this.phnNo = phnNo;
        this.email = email;
        this.eduQualification = eduQualification;
        this.experience = experience;
        this.cv = cv;
    }

    public int getTpId() {
        return tpId;
    }

    public void setTpId(int tpId) {
        this.tpId = tpId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public long getPhnNo() {
        return phnNo;
    }

    public void setPhnNo(long phnNo) {
        this.phnNo = phnNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEduQualification() {
        return eduQualification;
    }

    public void setEduQualification(String eduQualification) {
        this.eduQualification = eduQualification;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }
}
