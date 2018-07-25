package com.scgj.SDMS.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ab_staffdetails")
public class AB_StaffDetails {

    @Id
    @Column(name = "abId")
    private int abId;

    @Column(name = "scgjCertifiedAssessorName")
    private String scgjCertifiedAssessorName;

    @Column(name = "scgjCertifiedAssessorQP")
    private String scgjCertifiedAssessorQP;

    @Column(name = "scgjCertifiedAssessorPhn")
    private String scgjCertifiedAssessorPhn;

    @Column(name = "scgjCertifiedAssessorEmail")
    private String scgjCertifiedAssessorEmail;

    @Column(name = "scgjCertifiedAssessorEducationalQlf")
    private String scgjCertifiedAssessorEducationalQlf;

    @Column(name = "scgjCertifiedAssessorDistrict")
    private String scgjCertifiedAssessorDistrict;

    @Column(name = "scgjCertifiedAssessorState")
    private String scgjCertifiedAssessorState;

    @Column(name = "scgjCertifiedAssessorCV")
    private int scgjCertifiedAssessorCV;  //this is file

    public AB_StaffDetails() {
    }

    public AB_StaffDetails(int abId, String scgjCertifiedAssessorName, String scgjCertifiedAssessorQP, String scgjCertifiedAssessorPhn, String scgjCertifiedAssessorEmail, String scgjCertifiedAssessorEducationalQlf, String scgjCertifiedAssessorDistrict, String scgjCertifiedAssessorState, int scgjCertifiedAssessorCV) {
        this.abId = abId;
        this.scgjCertifiedAssessorName = scgjCertifiedAssessorName;
        this.scgjCertifiedAssessorQP = scgjCertifiedAssessorQP;
        this.scgjCertifiedAssessorPhn = scgjCertifiedAssessorPhn;
        this.scgjCertifiedAssessorEmail = scgjCertifiedAssessorEmail;
        this.scgjCertifiedAssessorEducationalQlf = scgjCertifiedAssessorEducationalQlf;
        this.scgjCertifiedAssessorDistrict = scgjCertifiedAssessorDistrict;
        this.scgjCertifiedAssessorState = scgjCertifiedAssessorState;
        this.scgjCertifiedAssessorCV = scgjCertifiedAssessorCV;
    }

    public int getAbId() {
        return abId;
    }

    public void setAbId(int abId) {
        this.abId = abId;
    }

    public String getScgjCertifiedAssessorName() {
        return scgjCertifiedAssessorName;
    }

    public void setScgjCertifiedAssessorName(String scgjCertifiedAssessorName) {
        this.scgjCertifiedAssessorName = scgjCertifiedAssessorName;
    }

    public String getScgjCertifiedAssessorQP() {
        return scgjCertifiedAssessorQP;
    }

    public void setScgjCertifiedAssessorQP(String scgjCertifiedAssessorQP) {
        this.scgjCertifiedAssessorQP = scgjCertifiedAssessorQP;
    }

    public String getScgjCertifiedAssessorPhn() {
        return scgjCertifiedAssessorPhn;
    }

    public void setScgjCertifiedAssessorPhn(String scgjCertifiedAssessorPhn) {
        this.scgjCertifiedAssessorPhn = scgjCertifiedAssessorPhn;
    }

    public String getScgjCertifiedAssessorEmail() {
        return scgjCertifiedAssessorEmail;
    }

    public void setScgjCertifiedAssessorEmail(String scgjCertifiedAssessorEmail) {
        this.scgjCertifiedAssessorEmail = scgjCertifiedAssessorEmail;
    }

    public String getScgjCertifiedAssessorEducationalQlf() {
        return scgjCertifiedAssessorEducationalQlf;
    }

    public void setScgjCertifiedAssessorEducationalQlf(String scgjCertifiedAssessorEducationalQlf) {
        this.scgjCertifiedAssessorEducationalQlf = scgjCertifiedAssessorEducationalQlf;
    }

    public String getScgjCertifiedAssessorDistrict() {
        return scgjCertifiedAssessorDistrict;
    }

    public void setScgjCertifiedAssessorDistrict(String scgjCertifiedAssessorDistrict) {
        this.scgjCertifiedAssessorDistrict = scgjCertifiedAssessorDistrict;
    }

    public String getScgjCertifiedAssessorState() {
        return scgjCertifiedAssessorState;
    }

    public void setScgjCertifiedAssessorState(String scgjCertifiedAssessorState) {
        this.scgjCertifiedAssessorState = scgjCertifiedAssessorState;
    }

    public int getScgjCertifiedAssessorCV() {
        return scgjCertifiedAssessorCV;
    }

    public void setScgjCertifiedAssessorCV(int scgjCertifiedAssessorCV) {
        this.scgjCertifiedAssessorCV = scgjCertifiedAssessorCV;
    }
}
