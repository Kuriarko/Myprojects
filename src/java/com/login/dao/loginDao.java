/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login.dao;
import java.sql.*;

public class loginDao {
    boolean flag=false;
    String sql="select * from admin where name=? and password=?";
   public boolean checkCredentials(String uname,String pass)
    {
         boolean flag=false;
        try
        {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
        PreparedStatement stmt =con.prepareStatement(sql);
        stmt.setString(1, uname);
         stmt.setString(2, pass);
         ResultSet rs=stmt.executeQuery();
         if(rs.next())
         {
             flag=true;
         }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
            
        }
        return flag;
    }
    
}
