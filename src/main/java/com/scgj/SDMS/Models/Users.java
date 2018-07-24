package com.scgj.SDMS.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {


    public Users(){

    }
    @Column(name = "name")
    private String name;


    @Column(name = "email")
    private String email;

    @Column(name = "phon_no")
    private  long phon_no;


    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;


    @Id
    @Column(name = "application_id")
    private int application_id;

    public Users(String name, String email, long phon_no, String password, String role, int application_id) {
        this.name = name;
        this.email = email;
        this.phon_no = phon_no;
        this.password = password;
        this.role = role;
        this.application_id = application_id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhon_no() {
        return phon_no;
    }

    public void setPhon_no(long phon_no) {
        this.phon_no = phon_no;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getApplication_id() {
        return application_id;
    }

    public void setApplication_id(int application_id) {
        this.application_id = application_id;
    }
}
