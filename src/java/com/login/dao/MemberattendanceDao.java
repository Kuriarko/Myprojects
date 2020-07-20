/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import testclasses.Memberattencepojo;
public class MemberattendanceDao {
    boolean flag=false;
    public boolean markAttendance(Memberattencepojo ma)
    {
        boolean flag=false;
         
           try
        {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
            
           Statement stmt=con.createStatement();
             
             stmt.executeUpdate("Insert into attendance(member,attendance) values('"+ma.getMember()+"','"+ma.getAttendance()+"') ");
             
           flag=true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
           
        }
        
        
        
        
        return flag;
    }
}
