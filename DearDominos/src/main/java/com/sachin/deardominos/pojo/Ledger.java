/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sachin.deardominos.pojo;

import java.util.Date;

/**
 *
 * @author Shyam sundar
 */
public class Ledger {
    
    private int id;
    private String name;

    @Override
    public String toString() {
        return "LedgerPOJO{" + "id=" + id + ", name=" + name + ", email=" + email + ", amt=" + amt + ", schedule=" + schedule + '}';
    }
    private String email;
    private double amt;
    private Date schedule;

    public Ledger(int id, String name, String email, double amt, Date schedule) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.amt = amt;
        this.schedule = schedule;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }

    public Date getSchedule() {
        return schedule;
    }

    public void setSchedule(Date schedule) {
        this.schedule = schedule;
    }
    
    

}
