package com.example.demo3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Activity {

    @Id
    @GeneratedValue
    private int aid;
    private String name;
    private String email;
    private String add;
    private String city;
    private String country;
    private String ph;
    public int getAid() {
        return aid;
    }
    public void setAid(int aid) {
        this.aid = aid;
    }
    public String getname() {
        return name;
    }
    public void setname(String name){
        this.name= name;
    }
    public String getemail() {
        return email;
    }
    public void setemail(String email){
        this.email= email;
    }
    public String getadd() {
        return add;
    }
    public void setadd(String add){
        this.add= add;
    }
    public String getcity() {
        return city;
    }
    public void setcity(String city){
        this.city= city;
    }
    public String getcountry() {
        return country;
    }
    public void setcountry(String country){
        this.country= country;
    }
    public String getph() {
        return ph;
    }
    public void setph(String ph){
        this.ph= ph;
    }
    
    
    
    
}
