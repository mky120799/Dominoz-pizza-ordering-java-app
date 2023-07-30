/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sachin.deardominos.dao;

import com.sachin.deardominos.db.MySQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shyam sundar
 */
public class UserDAO {
     public static boolean checkUser(String p)throws SQLException {
        Connection connection = MySQLConnection.getConnection();
        PreparedStatement ps = connection.prepareStatement("select * from user");
        ResultSet rs = ps.executeQuery();
        String password = null;
        while(rs.next()) {
            password = rs.getString(2);
        }
        if(password.equals(p)) {
           return true;  
    } else {
            return false;
        }
    
    
    } 

    
}
