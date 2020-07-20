
package com.login.dao;

import java.sql.*;
import testclasses.memberBean;
public class memberDao {
     String sql="Insert into mydb.member(m_name,phone,email,password) values(?,?,?,?)";
    public String add_member(memberBean mb)
    {
        String ret="bhai";
        
        
        try
        {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
            
             PreparedStatement stmt =con.prepareStatement(sql);
             stmt.setString(1, mb.getName());
             stmt.setString(2, mb.getPhone());
             stmt.setString(3, mb.getEmail());
             stmt.setString(4, mb.getPassword());
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
