/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login.dao;

import java.sql.*;
import com.login.dao.ShiftBean;
public class ShiftDao {
    String sql="Insert into mydb.shift(trainer,shift_title,days) values(?,?,?)";
    
    public String add_shift(ShiftBean mb)
    {
        String ret="bhai";
        
        
        try
        {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
            
             PreparedStatement stmt =con.prepareStatement(sql);
             stmt.setString(1, mb.getTrainer());
             stmt.setString(2, mb.getShift());
             stmt.setString(3, mb.getDays());

             
             stmt.executeUpdate();
             
             ret="success"; 
        }
        catch(Exception e)
        {
            e.printStackTrace();
            ret="failure";
        }
        
        
        
        
        return ret;
    }
}
