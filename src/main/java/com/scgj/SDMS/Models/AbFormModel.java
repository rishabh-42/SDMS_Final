package com.scgj.SDMS.Models;

import javax.persistence.*;


    @Entity
    @Table(name = "ab_form")
    public class AbFormModel {

        public AbFormModel() {
        }

        @Id
        @Column(name = "abId")
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int assessmentBodyId;

        @Column(name = "abName")
        private String abName;


        @Column(name = "abCity")
        private String abCity;

        @Column(name = "abState")
        private String abState;


        @Column(name = "abPincode")
        private int abPincode;

        @Column(name = "spocName")
        private String spocName;

        @Column(name = "mobileNo")
        private Long mobileNo;

        @Column(name = "website")
        private String website;

        @Column(name = "estdYear")
        private int estdYear;

        @Column(name = "agencyExperience")
        private boolean agencyExperience;

        @Column(name = "nsdcFund")
        private boolean nsdcFund;

        @Column(name = "pan")
        private Long pan;

        @Column(name = "gstn")
        private Long gstn;

        @Column(name = "isRecognised")
        private boolean isRecognised;

        @Column(name = "sscAffiliated")
        private boolean sscAffiliated;

        @Column(name = "mdName")
        private String mdName;

        @Column(name = "mdDesignation")
        private String mdDesignation;

        @Column(name = "mdContactNo")
        private Long mdContactNo;

        @Column(name = "mdEmail")
        private String mdEmail;

        @Column(name = "mdQualification")
        private String  mdqualificarion;

        @Column(name = "mdExperience")
        private int mdExperience;

       /* @Column(name = "mdCv")
        private int mdCv;*/


        @Column(name = "noOfAssessors")
        private int noOfAssessors;

        @Column(name = "technicalSector")
        private int technicalSector;

        @Column(name = "nonTechnicalSector")
        private int nonTechnicAlSector;

        @Column(name = "certifiedAssessorName")
        private String certifiedAssessorName;

        @Column(name = "certifiedJobRole")
        private String certifiedJobRole;

        @Column(name = "certifiedDesignation")
        private String certifiedDesignation;

        @Column(name = "certifiedContact")
        private Long certifiedContact;

        @Column(name = "certifiedExperience")
        private int certifiedExperience;

        @Column(name = "certifiedQualification")
        private String certifiedQualification ;

        @Column(name = "RegionalOfficeName")
        private String  RegionalOfficeName;

        @Column(name = "RegionalAddress")
        private String RegionalAddress ;

        @Column(name = "RegionalState")
        private String  RegionalState;

        @Column(name = "RegionalPincode")
        private int  RegionalPincode;

        @Column(name = "RegionalPhoneNumber")
        private Long RegionalPhoneNumber ;









        public int getAssessmentBodyId() {
            return assessmentBodyId;
        }

        public void setAssessmentBodyId(int assessmentBodyId) {
            this.assessmentBodyId = assessmentBodyId;
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

        public String getAbState() {
            return abState;
        }

        public void setAbState(String abState) {
            this.abState = abState;
        }

        public int getAbPincode() {
            return abPincode;
        }

        public void setAbPincode(int abPincode) {
            this.abPincode = abPincode;
        }

        public String getSpocName() {
            return spocName;
        }

        public void setSpocName(String spocName) {
            this.spocName = spocName;
        }

        public Long getMobileNo() {
            return mobileNo;
        }

        public void setMobileNo(Long mobileNo) {
            this.mobileNo = mobileNo;
        }

        public String getWebsite() {
            return website;
        }

        public void setWebsite(String website) {
            this.website = website;
        }

        public int getEstdYear() {
            return estdYear;
        }

        public void setEstdYear(int estdYear) {
            this.estdYear = estdYear;
        }

        public boolean isAgencyExperience() {
            return agencyExperience;
        }

        public void setAgencyExperience(boolean agencyExperience) {
            this.agencyExperience = agencyExperience;
        }

        public boolean isNsdcFund() {
            return nsdcFund;
        }

        public void setNsdcFund(boolean nsdcFund) {
            this.nsdcFund = nsdcFund;
        }

        public Long getPan() {
            return pan;
        }

        public void setPan(Long pan) {
            this.pan = pan;
        }

        public Long getGstn() {
            return gstn;
        }

        public void setGstn(Long gstn) {
            this.gstn = gstn;
        }

        public boolean isRecognised() {
            return isRecognised;
        }

        public void setRecognised(boolean recognised) {
            isRecognised = recognised;
        }

        public boolean isSscAffiliated() {
            return sscAffiliated;
        }

        public void setSscAffiliated(boolean sscAffiliated) {
            this.sscAffiliated = sscAffiliated;
        }

        public String getMdName() {
            return mdName;
        }

        public void setMdName(String mdName) {
            this.mdName = mdName;
        }

        public String getMdDesignation() {
            return mdDesignation;
        }

        public void setMdDesignation(String mdDesignation) {
            this.mdDesignation = mdDesignation;
        }

        public Long getMdContactNo() {
            return mdContactNo;
        }

        public void setMdContactNo(Long mdContactNo) {
            this.mdContactNo = mdContactNo;
        }

        public String getMdEmail() {
            return mdEmail;
        }

        public void setMdEmail(String mdEmail) {
            this.mdEmail = mdEmail;
        }

        public String getMdqualificarion() {
            return mdqualificarion;
        }

        public void setMdqualificarion(String mdqualificarion) {
            this.mdqualificarion = mdqualificarion;
        }

        public int getMdExperience() {
            return mdExperience;
        }

        public void setMdExperience(int mdExperience) {
            this.mdExperience = mdExperience;
        }

        public int getNoOfAssessors() {
            return noOfAssessors;
        }

        public void setNoOfAssessors(int noOfAssessors) {
            this.noOfAssessors = noOfAssessors;
        }

        public int getTechnicalSector() {
            return technicalSector;
        }

        public void setTechnicalSector(int technicalSector) {
            this.technicalSector = technicalSector;
        }

        public int getNonTechnicAlSector() {
            return nonTechnicAlSector;
        }

        public void setNonTechnicAlSector(int nonTechnicAlSector) {
            this.nonTechnicAlSector = nonTechnicAlSector;
        }

        public String getCertifiedAssessorName() {
            return certifiedAssessorName;
        }

        public void setCertifiedAssessorName(String certifiedAssessorName) {
            this.certifiedAssessorName = certifiedAssessorName;
        }

        public String getCertifiedJobRole() {
            return certifiedJobRole;
        }

        public void setCertifiedJobRole(String certifiedJobRole) {
            this.certifiedJobRole = certifiedJobRole;
        }

        public String getCertifiedDesignation() {
            return certifiedDesignation;
        }

        public void setCertifiedDesignation(String certifiedDesignation) {
            this.certifiedDesignation = certifiedDesignation;
        }

        public Long getCertifiedContact() {
            return certifiedContact;
        }

        public void setCertifiedContact(Long certifiedContact) {
            this.certifiedContact = certifiedContact;
        }

        public int getCertifiedExperience() {
            return certifiedExperience;
        }

        public void setCertifiedExperience(int certifiedExperience) {
            this.certifiedExperience = certifiedExperience;
        }

        public String getCertifiedQualification() {
            return certifiedQualification;
        }

        public void setCertifiedQualification(String certifiedQualification) {
            this.certifiedQualification = certifiedQualification;
        }

        public String getRegionalOfficeName() {
            return RegionalOfficeName;
        }

        public void setRegionalOfficeName(String regionalOfficeName) {
            RegionalOfficeName = regionalOfficeName;
        }

        public String getRegionalAddress() {
            return RegionalAddress;
        }

        public void setRegionalAddress(String regionalAddress) {
            RegionalAddress = regionalAddress;
        }

        public String getRegionalState() {
            return RegionalState;
        }

        public void setRegionalState(String regionalState) {
            RegionalState = regionalState;
        }

        public int getRegionalPincode() {
            return RegionalPincode;
        }

        public void setRegionalPincode(int regionalPincode) {
            RegionalPincode = regionalPincode;
        }

        public Long getRegionalPhoneNumber() {
            return RegionalPhoneNumber;
        }

        public void setRegionalPhoneNumber(Long regionalPhoneNumber) {
            RegionalPhoneNumber = regionalPhoneNumber;
        }
    }

