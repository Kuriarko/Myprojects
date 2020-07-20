
package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import testclasses.Memberpojo;


public class viewmemberDao {
     String sql="select * from member";
     
  public  List<Memberpojo> getMemberList()
    {
        ArrayList<Memberpojo> list=new ArrayList<>();
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
            PreparedStatement stmt =con.prepareStatement(sql);
            ResultSet rs=stmt.executeQuery();
            while(rs.next())
            {
                int id=rs.getInt("m_id");
             String name=rs.getString("m_name");
               String phone= rs.getString("phone");
                String email= rs.getString("email");
                 String password= rs.getString("password");
                 
                 Memberpojo member=new Memberpojo(id,name,phone,email,password);
                 list.add(member);
            }
        }
        catch(Exception e)
        {
             e.printStackTrace();
        }
        return list;
    }
}
