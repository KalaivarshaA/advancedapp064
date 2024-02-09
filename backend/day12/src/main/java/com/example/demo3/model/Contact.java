package com.example.demo3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Contact {

    @Id
    private String fname;
    private String lname;
    private String cname;
    private String email;
    private String ph;
    private String c;
    private String message;
    public String getFname() {
        return fname;
    }
    public void setEmail(String fname) {
        this.fname = fname;
    }
    public String getlname() {
        return lname;
    }
    public void setlname(String lname) {
        this.lname = lname;
    }
    public String getcname() {
        return cname;
    }
    public void setcname(String cname) {
        this.cname = cname;
    }
    public String getemail() {
        return email;
    }
    public void setemail(String email) {
        this.email = email;
    }
    public String getph() {
        return ph;
    }
    public void setph(String ph){
        this.ph= ph;
    }
    public String getc() {
        return c;
    }
    public void setc(String c){
        this.c= c;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
