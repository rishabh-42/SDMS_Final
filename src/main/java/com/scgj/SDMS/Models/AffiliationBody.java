package com.scgj.SDMS.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "affiliationbody")
public class AffiliationBody {

    @Id
    @Column(name = "applicationId")
    private int applicationId;

    @Column(name = "abId")
    private int abId;

    @Column(name = "abName")
    private String abName;

    @Column(name = "abAddress")
    private String abCity;

    @Column(name = "abState")
    private String abStatus;

    @Column(name = "pin")
    private long pin;

    @Column(name = "spocName")
    private String spocName;

    @Column(name = "abPhn")
    private long abPhn;

    @Column(name = "yearOfEstablishment")
    private String yearOfEstablishment;

    @Column(name = "experience")
    private int experience;

    @Column(name = "pan")
    private long pan;

    @Column(name = "gst")
    private String gst;

    @Column(name = "isRecognized")
    private int isRecognized;

    @Column(name = "isAffiliated")
    private int isAffiliated;

    public AffiliationBody() {
    }

    public AffiliationBody(int applicationId, int abId, String abName, String abCity, String abStatus, long pin, String spocName, long abPhn, String yearOfEstablishment, int experience, long pan, String gst, int isRecognized, int isAffiliated) {
        this.applicationId = applicationId;
        this.abId = abId;
        this.abName = abName;
        this.abCity = abCity;
        this.abStatus = abStatus;
        this.pin = pin;
        this.spocName = spocName;
        this.abPhn = abPhn;
        this.yearOfEstablishment = yearOfEstablishment;
        this.experience = experience;
        this.pan = pan;
        this.gst = gst;
        this.isRecognized = isRecognized;
        this.isAffiliated = isAffiliated;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public int getAbId() {
        return abId;
    }

    public void setAbId(int abId) {
        this.abId = abId;
    }

    public String getAbName() {
        return abName;
    }

    public void setAbName(String abName) {
        this.abName = abName;
    }

    public String getAbCity() {
        return abCity;
    }

    public void setAbCity(String abCity) {
        this.abCity = abCity;
    }

    public String getAbStatus() {
        return abStatus;
    }

    public void setAbStatus(String abStatus) {
        this.abStatus = abStatus;
    }

    public long getPin() {
        return pin;
    }

    public void setPin(long pin) {
        this.pin = pin;
    }

    public String getSpocName() {
        return spocName;
    }

    public void setSpocName(String spocName) {
        this.spocName = spocName;
    }

    public long getAbPhn() {
        return abPhn;
    }

    public void setAbPhn(long abPhn) {
        this.abPhn = abPhn;
    }

    public String getYearOfEstablishment() {
        return yearOfEstablishment;
    }

    public void setYearOfEstablishment(String yearOfEstablishment) {
        this.yearOfEstablishment = yearOfEstablishment;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public long getPan() {
        return pan;
    }

    public void setPan(long pan) {
        this.pan = pan;
    }

    public String getGst() {
        return gst;
    }

    public void setGst(String gst) {
        this.gst = gst;
    }

    public int getIsRecognized() {
        return isRecognized;
    }

    public void setIsRecognized(int isRecognized) {
        this.isRecognized = isRecognized;
    }

    public int getIsAffiliated() {
        return isAffiliated;
    }

    public void setIsAffiliated(int isAffiliated) {
        this.isAffiliated = isAffiliated;
    }
}
