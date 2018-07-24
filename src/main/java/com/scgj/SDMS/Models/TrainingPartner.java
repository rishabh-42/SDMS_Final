package com.scgj.SDMS.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trainingpartner")
public class TrainingPartner {

    @Id
    @Column(name = "applicationId")
    private int applicationId;

    @Column(name = "tpId")
    private int tpId;

    @Column(name = "tpName")
    private String tpName;

    @Column(name = "tpAddress")
    private String tpCity;

    @Column(name = "tpState")
    private String tpStatus;

    @Column(name = "pin")
    private long pin;

    @Column(name = "spocName")
    private String spocName;

    @Column(name = "abPhn")
    private long abPhn;

    @Column(name = "yearOfEstablishment")
    private String yearOfEstablishment;

    @Column(name = "qp_id")
    private int qp_id;

    @Column(name = "is_NSDC_funded")
    private int is_NSDC_funded;

    @Column(name = "model_of_institution")
    private int model_of_institution;

    @Column(name = "total_centers")
    private int total_centers;

    @Column(name = "medium")
    private String medium;

    @Column(name = "pan")
    private long pan;

    @Column(name = "gst")
    private String gst;

    @Column(name = "turnOver")
    private int turnOver;

    @Column(name = "is_recognized")
    private int is_recognized;

    @Column(name = "experience_in_skilldevelopment")
    private int experience_in_skilldevelopment;

    @Column(name = "experience_in_skilltraining")
    private int experience_in_skilltraining;

    public TrainingPartner() {
    }

    public TrainingPartner(int applicationId, int tpId, String tpName, String tpCity, String tpStatus, long pin, String spocName, long abPhn, String yearOfEstablishment, int qp_id, int is_NSDC_funded, int model_of_institution, int total_centers, String medium, long pan, String gst, int turnOver, int is_recognized, int experience_in_skilldevelopment, int experience_in_skilltraining) {
        this.applicationId = applicationId;
        this.tpId = tpId;
        this.tpName = tpName;
        this.tpCity = tpCity;
        this.tpStatus = tpStatus;
        this.pin = pin;
        this.spocName = spocName;
        this.abPhn = abPhn;
        this.yearOfEstablishment = yearOfEstablishment;
        this.qp_id = qp_id;
        this.is_NSDC_funded = is_NSDC_funded;
        this.model_of_institution = model_of_institution;
        this.total_centers = total_centers;
        this.medium = medium;
        this.pan = pan;
        this.gst = gst;
        this.turnOver = turnOver;
        this.is_recognized = is_recognized;
        this.experience_in_skilldevelopment = experience_in_skilldevelopment;
        this.experience_in_skilltraining = experience_in_skilltraining;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public int getTpId() {
        return tpId;
    }

    public void setTpId(int tpId) {
        this.tpId = tpId;
    }

    public String getTpName() {
        return tpName;
    }

    public void setTpName(String tpName) {
        this.tpName = tpName;
    }

    public String getTpCity() {
        return tpCity;
    }

    public void setTpCity(String tpCity) {
        this.tpCity = tpCity;
    }

    public String getTpStatus() {
        return tpStatus;
    }

    public void setTpStatus(String tpStatus) {
        this.tpStatus = tpStatus;
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

    public int getQp_id() {
        return qp_id;
    }

    public void setQp_id(int qp_id) {
        this.qp_id = qp_id;
    }

    public int getIs_NSDC_funded() {
        return is_NSDC_funded;
    }

    public void setIs_NSDC_funded(int is_NSDC_funded) {
        this.is_NSDC_funded = is_NSDC_funded;
    }

    public int getModel_of_institution() {
        return model_of_institution;
    }

    public void setModel_of_institution(int model_of_institution) {
        this.model_of_institution = model_of_institution;
    }

    public int getTotal_centers() {
        return total_centers;
    }

    public void setTotal_centers(int total_centers) {
        this.total_centers = total_centers;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
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

    public int getTurnOver() {
        return turnOver;
    }

    public void setTurnOver(int turnOver) {
        this.turnOver = turnOver;
    }

    public int getIs_recognized() {
        return is_recognized;
    }

    public void setIs_recognized(int is_recognized) {
        this.is_recognized = is_recognized;
    }

    public int getExperience_in_skilldevelopment() {
        return experience_in_skilldevelopment;
    }

    public void setExperience_in_skilldevelopment(int experience_in_skilldevelopment) {
        this.experience_in_skilldevelopment = experience_in_skilldevelopment;
    }

    public int getExperience_in_skilltraining() {
        return experience_in_skilltraining;
    }

    public void setExperience_in_skilltraining(int experience_in_skilltraining) {
        this.experience_in_skilltraining = experience_in_skilltraining;
    }
}
