package com.scgj.SDMS.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="batches")
public class Batches {

    @Id
    @Column(name = "batch_id")
    private int batch_id;


    @Column(name = "tp_id")
    private int tp_id;

    @Column(name = "no_of_candidates")
    private int no_of_candidates;

    @Column(name = "no_of_candidates_placed")
    private int no_of_candidates_placed;

    @Column(name = "qp_id")
    private int qp_id;

    @Column(name = "ab_id")
    private int ab_id;

    @Column(name = "start_date")
    private String start_date;
    @Column(name = "end_date")
    private String end_date;

    @Column(name = "assessment_date")
    private String assessment_date;

    @Column(name = "is_assessed")
    private int is_assessed;

    @Column(name = "is_certified")
    private int is_certified;

    @Column(name = "certificate_uploaded")
    private int certificate_uploaded;

    @Column(name = "center_id")
    private int center_id;

    public Batches() {

    }


    public Batches(int batch_id, int tp_id, int no_of_candidates, int no_of_candidates_placed, int qp_id, int ab_id, String start_date, String end_date, String assessment_date, int is_assessed, int is_certified, int certificate_uploaded, int center_id) {
        this.batch_id = batch_id;
        this.tp_id = tp_id;
        this.no_of_candidates = no_of_candidates;
        this.no_of_candidates_placed = no_of_candidates_placed;
        this.qp_id = qp_id;

        this.ab_id = ab_id;

        this.start_date = start_date;
        this.end_date = end_date;
        this.assessment_date = assessment_date;
        this.is_assessed = is_assessed;
        this.is_certified = is_certified;
        this.certificate_uploaded = certificate_uploaded;
        this.center_id = center_id;
    }


    public int getBatch_id() {
        return batch_id;
    }

    public void setBatch_id(int batch_id) {
        this.batch_id = batch_id;
    }

    public int getTp_id() {
        return tp_id;
    }

    public void setTp_id(int tp_id) {
        this.tp_id = tp_id;
    }

    public int getNo_of_candidates() {
        return no_of_candidates;
    }

    public void setNo_of_candidates(int no_of_candidates) {
        this.no_of_candidates = no_of_candidates;
    }

    public int getNo_of_candidates_placed() {
        return no_of_candidates_placed;
    }

    public void setNo_of_candidates_placed(int no_of_candidates_placed) {
        this.no_of_candidates_placed = no_of_candidates_placed;
    }

    public int getQp_id() {
        return qp_id;
    }

    public void setQp_id(int qp_id) {
        this.qp_id = qp_id;
    }

    public int getAb_id() {
        return ab_id;
    }

    public void setAb_id(int ab_id) {
        this.ab_id = ab_id;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getAssessment_date() {
        return assessment_date;
    }

    public void setAssessment_date(String assessment_date) {
        this.assessment_date = assessment_date;
    }

    public int getIs_assessed() {
        return is_assessed;
    }

    public void setIs_assessed(int is_assessed) {
        this.is_assessed = is_assessed;
    }

    public int getIs_certified() {
        return is_certified;
    }

    public void setIs_certified(int is_certified) {
        this.is_certified = is_certified;
    }

    public int getCertificate_uploaded() {
        return certificate_uploaded;
    }

    public void setCertificate_uploaded(int certificate_uploaded) {
        this.certificate_uploaded = certificate_uploaded;
    }

    public int getCenter_id() {
        return center_id;
    }

    public void setCenter_id(int center_id) {
        this.center_id = center_id;
    }
}
