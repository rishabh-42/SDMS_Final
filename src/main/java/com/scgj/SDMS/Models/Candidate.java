package com.scgj.SDMS.Models;

import javax.persistence.Column;
import javax.persistence.Id;

public class Candidate {

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
}
