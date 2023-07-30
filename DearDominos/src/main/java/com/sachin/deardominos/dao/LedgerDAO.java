/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sachin.deardominos.dao;

import com.sachin.deardominos.db.MySQLConnection;
import com.sachin.deardominos.pojo.Ledger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shyam sundar
 */
public class LedgerDAO {
     public static List<Ledger> getAllRecords()throws SQLException {
        List<Ledger> data = new ArrayList<>();
        Connection connection = MySQLConnection.getConnection();
        PreparedStatement ps = connection.prepareStatement("select * from ledger");
        ResultSet rs = ps.executeQuery();
        while(rs.next()) {
            data.add(new Ledger(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getTimestamp(5)));
        }
        return data;
    
    
    } 
     public static void saveRocerd(Ledger ledger)throws  SQLException {
        Connection connection = MySQLConnection.getConnection();
        PreparedStatement ps = connection.prepareStatement("insert into ledger(name, email, amt) values(?, ?, ?)");
        ps.setString(1, ledger.getName());
        ps.setString(2, ledger.getEmail());
        ps.setDouble(3, ledger.getAmt());
        int ans = ps.executeUpdate();
     }

    
}

    

