/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sachin.deardominos.pojo;

/**
 *
 * @author Shyam sundar
 */
public class Product {
   // private String prodId;
    private String prodName;
    private double amt;
    @Override
    public String toString() {
        return "Product{" + "prodName=" + prodName + ", amt=" + amt + '}';
    }
    public Product(String prodName, double amt) {
        
        this.prodName = prodName;
        this.amt = amt;
    }
    

  /*ublic Product(String prodId, String prodName, double amt) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.amt = amt;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }*/

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }
    
    
}
