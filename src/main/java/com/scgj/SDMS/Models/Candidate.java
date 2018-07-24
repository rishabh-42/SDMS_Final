package com.scgj.SDMS.Models;

import javax.persistence.Column;
import javax.persistence.Id;

public class Candidate {

    public  Candidate() {

    }

    @Id
    @Column(name = "cid")
    private int cid;


    @Column(name = "c_name")
    private String c_name;

    @Column(name = "c_age")
    private int c_age;

    @Column(name = "c_email")
    private String c_email;

    @Column(name = "batch_id")
    private int batch_id;

    @Column(name = "c_gender")
    private String c_gender;

    @Column(name = "c_qp_id")
    private String c_qp_id;

    @Column(name = "c_address")
    private String c_address;

    @Column(name = "c_aadhar")
    private long c_aadhar;
    @Column(name = "is_placed")
    private int is_placed;
    @Column(name = "date_of_joining")
    private String date_of_joining;

    @Column(name = "c_father_name")
    private String c_father_name;

    @Column(name = "c_education_level")
    private String c_education_level;

    @Column(name = "c_phone_number")
    private long c_phone_number;

    @Column(name = "is_pass")
    private int is_pass;

    @Column(name = "scheme")
    private String scheme;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public int getC_age() {
        return c_age;
    }

    public void setC_age(int c_age) {
        this.c_age = c_age;
    }

    public String getC_email() {
        return c_email;
    }

    public void setC_email(String c_email) {
        this.c_email = c_email;
    }

    public int getBatch_id() {
        return batch_id;
    }

    public void setBatch_id(int batch_id) {
        this.batch_id = batch_id;
    }

    public String getC_gender() {
        return c_gender;
    }

    public void setC_gender(String c_gender) {
        this.c_gender = c_gender;
    }

    public String getC_qp_id() {
        return c_qp_id;
    }

    public void setC_qp_id(String c_qp_id) {
        this.c_qp_id = c_qp_id;
    }

    public String getC_address() {
        return c_address;
    }

    public void setC_address(String c_address) {
        this.c_address = c_address;
    }

    public long getC_aadhar() {
        return c_aadhar;
    }

    public void setC_aadhar(long c_aadhar) {
        this.c_aadhar = c_aadhar;
    }

    public int getIs_placed() {
        return is_placed;
    }

    public void setIs_placed(int is_placed) {
        this.is_placed = is_placed;
    }

    public String getDate_of_joining() {
        return date_of_joining;
    }

    public void setDate_of_joining(String date_of_joining) {
        this.date_of_joining = date_of_joining;
    }

    public String getC_father_name() {
        return c_father_name;
    }

    public void setC_father_name(String c_father_name) {
        this.c_father_name = c_father_name;
    }

    public String getC_education_level() {
        return c_education_level;
    }

    public void setC_education_level(String c_education_level) {
        this.c_education_level = c_education_level;
    }

    public long getC_phone_number() {
        return c_phone_number;
    }

    public void setC_phone_number(long c_phone_number) {
        this.c_phone_number = c_phone_number;
    }

    public int getIs_pass() {
        return is_pass;
    }

    public void setIs_pass(int is_pass) {
        this.is_pass = is_pass;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }
}
