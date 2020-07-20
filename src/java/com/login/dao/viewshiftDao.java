
package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import testclasses.Shiftpojo;

public class viewshiftDao {
     String sql="select * from shift";
     
      public  List<Shiftpojo> getShiftList()
    {
        ArrayList<Shiftpojo> list=new ArrayList<>();
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
            PreparedStatement stmt =con.prepareStatement(sql);
            ResultSet rs=stmt.executeQuery();
            while(rs.next())
            {
                int id=rs.getInt("shift_id");
             String trainer=rs.getString("trainer");
               String shift_title= rs.getString("shift_title");
                              String days= rs.getString("days");

               
                 
                Shiftpojo shift=new Shiftpojo(id,trainer,shift_title,days);
                 list.add(shift);
            }
        }
        catch(Exception e)
        {
             e.printStackTrace();
        }
        return list;
    }
}
