/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sachin.deardominos.dao;

import com.sachin.deardominos.db.MySQLConnection;
import com.sachin.deardominos.pojo.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Shyam sundar
 */
public class ProductDAO {
    public static Product findProductByProdId(String prodId)throws SQLException {
        
        Connection connection = MySQLConnection.getConnection();
        PreparedStatement ps = connection.prepareStatement("select * from products where prod_id = ?");
        ps.setString(1, prodId);
        ResultSet rs = ps.executeQuery();
        Product product = null; 
        while(rs.next()) {
            product = new Product(rs.getString(3), rs.getDouble(4));
        }
       return product;    
    
    } 

    
}
