package com.scgj.SDMS.Models;

import javax.persistence.Column;
import javax.persistence.Id;

public class Candidate {

    @Id
    @Column(name = "cid")
    private int cid;


    private String cname;
    private int cage;
    private String cemail;
    private int batchId;
    private String cgender;
    private String cqpId;
    private String caddress;
    private long caadhar;
    private int isplaced;
    private String dateOfJoining;
    private String cFathersName;
    private String cEducationLevel;
    private long cPhnNumber;
    private int isPass;
    private String scheme;
}
