package com.example.demo3.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Booking {

    @Id
    @GeneratedValue
    private int id;
    private String email;
    private String repemail;
    private String pass;
    private String reppass;
    private String fname;
    private String lname;
    private String ph;
    private String add;
    private String city;
    private String country;
    private String gender;
    private int date;
    private String month;
    private int year;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getrepEmail() {
        return repemail;
    }
    public void setrepEmail(String repemail) {
        this.repemail = repemail;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public void setrepPass(String reppass) {
        this.reppass = reppass;
    }
    public String getrepPass() {
        return reppass;
    }
    
    public String getfname() {
        return fname;
    }
    public void setfname(String fname){
        this.fname= fname;
    }
    public String getlname() {
        return lname;
    }
    public void setlname(String lname){
        this.lname= lname;
    }
    public String getph() {
        return ph;
    }
    public void setph(String ph){
        this.ph= ph;
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
    public String getGender() {
        return gender;
    }
    public void setGender(String gender){
        this.gender= gender;
    }
    public int getDate() {
        return date;
    }
    public void setDate(int date){
        this.date= date;
    }
    public String getMonth() {
        return month;
    }
    public void setMonth(String month){
        this.month= month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year){
        this.year= year;
    }

    
    
}
