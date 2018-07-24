package com.scgj.SDMS.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tp_centerdetails")
public class TP_CenterDetails {

    @Column(name = "tpId")
    private int tpId;

    @Id
    @Column(name = "center_id")
    private int center_id;

    @Column(name = "center_name")
    private String center_name;

    @Column(name = "center_ohName")
    private String center_ohName;

    @Column(name = "center_oh_designation")
    private String center_oh_designation;

    @Column(name = "center_oh_phnNo")
    private long center_oh_phnNo;

    @Column(name = "center_oh_email")
    private String center_oh_email;

    @Column(name = "center_oh_eduQualification")
    private String center_oh_eduQualification;

    @Column(name = "center_oh_experience")
    private int center_oh_experience;

    @Column(name = "center_oh_cv")
    private int center_oh_cv;//this will be a file

    @Column(name = "center_acName")
    private String center_acName;

    @Column(name = "center_ac_designation")
    private String center_ac_designation;

    @Column(name = "center_ac_phnNo")
    private long center_ac_phnNo;

    @Column(name = "center_ac_email")
    private String center_ac_email;

    @Column(name = "center_ac_eduQualification")
    private String center_ac_eduQualification;

    @Column(name = "center_ac_experience")
    private int center_ac_experience;

    @Column(name = "center_ac_cv")
    private int center_ac_cv;//this will be a file

    @Column(name = "center_spocName")
    private String center_spocName;

    @Column(name = "center_spoc_designation")
    private String center_spoc_designation;

    @Column(name = "center_spoc_phnNo")
    private long center_spoc_phnNo;

    @Column(name = "center_spoc_email")
    private String center_spoc_email;

    @Column(name = "center_spoc_eduQualification")
    private String center_spoc_eduQualification;

    @Column(name = "center_spoc_experience")
    private int center_spoc_experience;

    @Column(name = "center_spoc_cv")
    private int center_spoc_cv;//this will be a file

    @Column(name = "permanent_number_of_office_manager")
    private int permanent_number_of_office_manager;

    @Column(name = "permanent_number_of_office_staff")
    private int permanent_number_of_office_staff;

    @Column(name = "permanent_number_of_lab_attendants")
    private int permanent_number_of_lab_attendants;

    @Column(name = "permanent_number_of_accountants")
    private int permanent_number_of_accountants;

    @Column(name = "permanent_number_of_support_staff")
    private int permanent_number_of_support_staff;

    @Column(name = "permanent_number_of_other_staff")
    private int permanent_number_of_other_staff;

    @Column(name = "temp_number_of_office_manager")
    private int temp_number_of_office_manager;

    @Column(name = "temp_number_of_office_staff")
    private int temp_number_of_office_staff;

    @Column(name = "temp_number_of_lab_attendants")
    private int temp_number_of_lab_attendants;

    @Column(name = "temp_number_of_accountants")
    private int temp_number_of_accountants;

    @Column(name = "temp_number_of_support_staff")
    private int temp_number_of_support_staff;

    @Column(name = "temp_number_of_other_staff")
    private int temp_number_of_other_staff;

    @Column(name = "area_of_premises")
    private int area_of_premises;

    @Column(name = "is_building_own")
    private int is_building_own;

    @Column(name = "size_of_classroom")
    private int size_of_classroom;

    @Column(name = "no_of_classroom")
    private int no_of_classroom;

    @Column(name = "size_of_lab")
    private int size_of_lab;

    @Column(name = "no_of_lab")
    private int no_of_lab;

    @Column(name = "size_of_workshop")
    private int size_of_workshop;

    @Column(name = "no_of_workshop")
    private int no_of_workshop;

    @Column(name = "is_mandatory_toolkit")
    private int is_mandatory_toolkit;

    @Column(name = "is_safe_drinking_water")
    private int is_safe_drinking_water;

    @Column(name = "is_power_backup")
    private int is_power_backup;

    @Column(name = "separate_toilet")
    private int separate_toilet;

    @Column(name = "transport_facility")
    private int transport_facility;

    @Column(name = "library_present")
    private int library_present;

    @Column(name = "illumination_level")
    private int illumination_level;

    @Column(name = "ventilation")
    private int ventilation;

    public TP_CenterDetails() {
    }

    public TP_CenterDetails(int tpId, int center_id, String center_name, String center_ohName, String center_oh_designation, long center_oh_phnNo, String center_oh_email, String center_oh_eduQualification, int center_oh_experience, int center_oh_cv, String center_acName, String center_ac_designation, long center_ac_phnNo, String center_ac_email, String center_ac_eduQualification, int center_ac_experience, int center_ac_cv, String center_spocName, String center_spoc_designation, long center_spoc_phnNo, String center_spoc_email, String center_spoc_eduQualification, int center_spoc_experience, int center_spoc_cv, int permanent_number_of_office_manager, int permanent_number_of_office_staff, int permanent_number_of_lab_attendants, int permanent_number_of_accountants, int permanent_number_of_support_staff, int permanent_number_of_other_staff, int temp_number_of_office_manager, int temp_number_of_office_staff, int temp_number_of_lab_attendants, int temp_number_of_accountants, int temp_number_of_support_staff, int temp_number_of_other_staff, int area_of_premises, int is_building_own, int size_of_classroom, int no_of_classroom, int size_of_lab, int no_of_lab, int size_of_workshop, int no_of_workshop, int is_mandatory_toolkit, int is_safe_drinking_water, int is_power_backup, int separate_toilet, int transport_facility, int library_present, int illumination_level, int ventilation) {
        this.tpId = tpId;
        this.center_id = center_id;
        this.center_name = center_name;
        this.center_ohName = center_ohName;
        this.center_oh_designation = center_oh_designation;
        this.center_oh_phnNo = center_oh_phnNo;
        this.center_oh_email = center_oh_email;
        this.center_oh_eduQualification = center_oh_eduQualification;
        this.center_oh_experience = center_oh_experience;
        this.center_oh_cv = center_oh_cv;
        this.center_acName = center_acName;
        this.center_ac_designation = center_ac_designation;
        this.center_ac_phnNo = center_ac_phnNo;
        this.center_ac_email = center_ac_email;
        this.center_ac_eduQualification = center_ac_eduQualification;
        this.center_ac_experience = center_ac_experience;
        this.center_ac_cv = center_ac_cv;
        this.center_spocName = center_spocName;
        this.center_spoc_designation = center_spoc_designation;
        this.center_spoc_phnNo = center_spoc_phnNo;
        this.center_spoc_email = center_spoc_email;
        this.center_spoc_eduQualification = center_spoc_eduQualification;
        this.center_spoc_experience = center_spoc_experience;
        this.center_spoc_cv = center_spoc_cv;
        this.permanent_number_of_office_manager = permanent_number_of_office_manager;
        this.permanent_number_of_office_staff = permanent_number_of_office_staff;
        this.permanent_number_of_lab_attendants = permanent_number_of_lab_attendants;
        this.permanent_number_of_accountants = permanent_number_of_accountants;
        this.permanent_number_of_support_staff = permanent_number_of_support_staff;
        this.permanent_number_of_other_staff = permanent_number_of_other_staff;
        this.temp_number_of_office_manager = temp_number_of_office_manager;
        this.temp_number_of_office_staff = temp_number_of_office_staff;
        this.temp_number_of_lab_attendants = temp_number_of_lab_attendants;
        this.temp_number_of_accountants = temp_number_of_accountants;
        this.temp_number_of_support_staff = temp_number_of_support_staff;
        this.temp_number_of_other_staff = temp_number_of_other_staff;
        this.area_of_premises = area_of_premises;
        this.is_building_own = is_building_own;
        this.size_of_classroom = size_of_classroom;
        this.no_of_classroom = no_of_classroom;
        this.size_of_lab = size_of_lab;
        this.no_of_lab = no_of_lab;
        this.size_of_workshop = size_of_workshop;
        this.no_of_workshop = no_of_workshop;
        this.is_mandatory_toolkit = is_mandatory_toolkit;
        this.is_safe_drinking_water = is_safe_drinking_water;
        this.is_power_backup = is_power_backup;
        this.separate_toilet = separate_toilet;
        this.transport_facility = transport_facility;
        this.library_present = library_present;
        this.illumination_level = illumination_level;
        this.ventilation = ventilation;
    }

    public int getTpId() {
        return tpId;
    }

    public void setTpId(int tpId) {
        this.tpId = tpId;
    }

    public int getCenter_id() {
        return center_id;
    }

    public void setCenter_id(int center_id) {
        this.center_id = center_id;
    }

    public String getCenter_name() {
        return center_name;
    }

    public void setCenter_name(String center_name) {
        this.center_name = center_name;
    }

    public String getCenter_ohName() {
        return center_ohName;
    }

    public void setCenter_ohName(String center_ohName) {
        this.center_ohName = center_ohName;
    }

    public String getCenter_oh_designation() {
        return center_oh_designation;
    }

    public void setCenter_oh_designation(String center_oh_designation) {
        this.center_oh_designation = center_oh_designation;
    }

    public long getCenter_oh_phnNo() {
        return center_oh_phnNo;
    }

    public void setCenter_oh_phnNo(long center_oh_phnNo) {
        this.center_oh_phnNo = center_oh_phnNo;
    }

    public String getCenter_oh_email() {
        return center_oh_email;
    }

    public void setCenter_oh_email(String center_oh_email) {
        this.center_oh_email = center_oh_email;
    }

    public String getCenter_oh_eduQualification() {
        return center_oh_eduQualification;
    }

    public void setCenter_oh_eduQualification(String center_oh_eduQualification) {
        this.center_oh_eduQualification = center_oh_eduQualification;
    }

    public int getCenter_oh_experience() {
        return center_oh_experience;
    }

    public void setCenter_oh_experience(int center_oh_experience) {
        this.center_oh_experience = center_oh_experience;
    }

    public int getCenter_oh_cv() {
        return center_oh_cv;
    }

    public void setCenter_oh_cv(int center_oh_cv) {
        this.center_oh_cv = center_oh_cv;
    }

    public String getCenter_acName() {
        return center_acName;
    }

    public void setCenter_acName(String center_acName) {
        this.center_acName = center_acName;
    }

    public String getCenter_ac_designation() {
        return center_ac_designation;
    }

    public void setCenter_ac_designation(String center_ac_designation) {
        this.center_ac_designation = center_ac_designation;
    }

    public long getCenter_ac_phnNo() {
        return center_ac_phnNo;
    }

    public void setCenter_ac_phnNo(long center_ac_phnNo) {
        this.center_ac_phnNo = center_ac_phnNo;
    }

    public String getCenter_ac_email() {
        return center_ac_email;
    }

    public void setCenter_ac_email(String center_ac_email) {
        this.center_ac_email = center_ac_email;
    }

    public String getCenter_ac_eduQualification() {
        return center_ac_eduQualification;
    }

    public void setCenter_ac_eduQualification(String center_ac_eduQualification) {
        this.center_ac_eduQualification = center_ac_eduQualification;
    }

    public int getCenter_ac_experience() {
        return center_ac_experience;
    }

    public void setCenter_ac_experience(int center_ac_experience) {
        this.center_ac_experience = center_ac_experience;
    }

    public int getCenter_ac_cv() {
        return center_ac_cv;
    }

    public void setCenter_ac_cv(int center_ac_cv) {
        this.center_ac_cv = center_ac_cv;
    }

    public String getCenter_spocName() {
        return center_spocName;
    }

    public void setCenter_spocName(String center_spocName) {
        this.center_spocName = center_spocName;
    }

    public String getCenter_spoc_designation() {
        return center_spoc_designation;
    }

    public void setCenter_spoc_designation(String center_spoc_designation) {
        this.center_spoc_designation = center_spoc_designation;
    }

    public long getCenter_spoc_phnNo() {
        return center_spoc_phnNo;
    }

    public void setCenter_spoc_phnNo(long center_spoc_phnNo) {
        this.center_spoc_phnNo = center_spoc_phnNo;
    }

    public String getCenter_spoc_email() {
        return center_spoc_email;
    }

    public void setCenter_spoc_email(String center_spoc_email) {
        this.center_spoc_email = center_spoc_email;
    }

    public String getCenter_spoc_eduQualification() {
        return center_spoc_eduQualification;
    }

    public void setCenter_spoc_eduQualification(String center_spoc_eduQualification) {
        this.center_spoc_eduQualification = center_spoc_eduQualification;
    }

    public int getCenter_spoc_experience() {
        return center_spoc_experience;
    }

    public void setCenter_spoc_experience(int center_spoc_experience) {
        this.center_spoc_experience = center_spoc_experience;
    }

    public int getCenter_spoc_cv() {
        return center_spoc_cv;
    }

    public void setCenter_spoc_cv(int center_spoc_cv) {
        this.center_spoc_cv = center_spoc_cv;
    }

    public int getPermanent_number_of_office_manager() {
        return permanent_number_of_office_manager;
    }

    public void setPermanent_number_of_office_manager(int permanent_number_of_office_manager) {
        this.permanent_number_of_office_manager = permanent_number_of_office_manager;
    }

    public int getPermanent_number_of_office_staff() {
        return permanent_number_of_office_staff;
    }

    public void setPermanent_number_of_office_staff(int permanent_number_of_office_staff) {
        this.permanent_number_of_office_staff = permanent_number_of_office_staff;
    }

    public int getPermanent_number_of_lab_attendants() {
        return permanent_number_of_lab_attendants;
    }

    public void setPermanent_number_of_lab_attendants(int permanent_number_of_lab_attendants) {
        this.permanent_number_of_lab_attendants = permanent_number_of_lab_attendants;
    }

    public int getPermanent_number_of_accountants() {
        return permanent_number_of_accountants;
    }

    public void setPermanent_number_of_accountants(int permanent_number_of_accountants) {
        this.permanent_number_of_accountants = permanent_number_of_accountants;
    }

    public int getPermanent_number_of_support_staff() {
        return permanent_number_of_support_staff;
    }

    public void setPermanent_number_of_support_staff(int permanent_number_of_support_staff) {
        this.permanent_number_of_support_staff = permanent_number_of_support_staff;
    }

    public int getPermanent_number_of_other_staff() {
        return permanent_number_of_other_staff;
    }

    public void setPermanent_number_of_other_staff(int permanent_number_of_other_staff) {
        this.permanent_number_of_other_staff = permanent_number_of_other_staff;
    }

    public int getTemp_number_of_office_manager() {
        return temp_number_of_office_manager;
    }

    public void setTemp_number_of_office_manager(int temp_number_of_office_manager) {
        this.temp_number_of_office_manager = temp_number_of_office_manager;
    }

    public int getTemp_number_of_office_staff() {
        return temp_number_of_office_staff;
    }

    public void setTemp_number_of_office_staff(int temp_number_of_office_staff) {
        this.temp_number_of_office_staff = temp_number_of_office_staff;
    }

    public int getTemp_number_of_lab_attendants() {
        return temp_number_of_lab_attendants;
    }

    public void setTemp_number_of_lab_attendants(int temp_number_of_lab_attendants) {
        this.temp_number_of_lab_attendants = temp_number_of_lab_attendants;
    }

    public int getTemp_number_of_accountants() {
        return temp_number_of_accountants;
    }

    public void setTemp_number_of_accountants(int temp_number_of_accountants) {
        this.temp_number_of_accountants = temp_number_of_accountants;
    }

    public int getTemp_number_of_support_staff() {
        return temp_number_of_support_staff;
    }

    public void setTemp_number_of_support_staff(int temp_number_of_support_staff) {
        this.temp_number_of_support_staff = temp_number_of_support_staff;
    }

    public int getTemp_number_of_other_staff() {
        return temp_number_of_other_staff;
    }

    public void setTemp_number_of_other_staff(int temp_number_of_other_staff) {
        this.temp_number_of_other_staff = temp_number_of_other_staff;
    }

    public int getArea_of_premises() {
        return area_of_premises;
    }

    public void setArea_of_premises(int area_of_premises) {
        this.area_of_premises = area_of_premises;
    }

    public int getIs_building_own() {
        return is_building_own;
    }

    public void setIs_building_own(int is_building_own) {
        this.is_building_own = is_building_own;
    }

    public int getSize_of_classroom() {
        return size_of_classroom;
    }

    public void setSize_of_classroom(int size_of_classroom) {
        this.size_of_classroom = size_of_classroom;
    }

    public int getNo_of_classroom() {
        return no_of_classroom;
    }

    public void setNo_of_classroom(int no_of_classroom) {
        this.no_of_classroom = no_of_classroom;
    }

    public int getSize_of_lab() {
        return size_of_lab;
    }

    public void setSize_of_lab(int size_of_lab) {
        this.size_of_lab = size_of_lab;
    }

    public int getNo_of_lab() {
        return no_of_lab;
    }

    public void setNo_of_lab(int no_of_lab) {
        this.no_of_lab = no_of_lab;
    }

    public int getSize_of_workshop() {
        return size_of_workshop;
    }

    public void setSize_of_workshop(int size_of_workshop) {
        this.size_of_workshop = size_of_workshop;
    }

    public int getNo_of_workshop() {
        return no_of_workshop;
    }

    public void setNo_of_workshop(int no_of_workshop) {
        this.no_of_workshop = no_of_workshop;
    }

    public int getIs_mandatory_toolkit() {
        return is_mandatory_toolkit;
    }

    public void setIs_mandatory_toolkit(int is_mandatory_toolkit) {
        this.is_mandatory_toolkit = is_mandatory_toolkit;
    }

    public int getIs_safe_drinking_water() {
        return is_safe_drinking_water;
    }

    public void setIs_safe_drinking_water(int is_safe_drinking_water) {
        this.is_safe_drinking_water = is_safe_drinking_water;
    }

    public int getIs_power_backup() {
        return is_power_backup;
    }

    public void setIs_power_backup(int is_power_backup) {
        this.is_power_backup = is_power_backup;
    }

    public int getSeparate_toilet() {
        return separate_toilet;
    }

    public void setSeparate_toilet(int separate_toilet) {
        this.separate_toilet = separate_toilet;
    }

    public int getTransport_facility() {
        return transport_facility;
    }

    public void setTransport_facility(int transport_facility) {
        this.transport_facility = transport_facility;
    }

    public int getLibrary_present() {
        return library_present;
    }

    public void setLibrary_present(int library_present) {
        this.library_present = library_present;
    }

    public int getIllumination_level() {
        return illumination_level;
    }

    public void setIllumination_level(int illumination_level) {
        this.illumination_level = illumination_level;
    }

    public int getVentilation() {
        return ventilation;
    }

    public void setVentilation(int ventilation) {
        this.ventilation = ventilation;
    }
}
