
package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import testclasses.Trainerpojo;
public class FetchtrainerrecordDao {
      String sql="select * from trainer where t_id=?";
      
       public  List<Trainerpojo> getTrainerRecord(int id)
    {
        ArrayList<Trainerpojo> list=new ArrayList<>();
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
            PreparedStatement stmt =con.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs=stmt.executeQuery();
            while(rs.next())
            {
                int uid=rs.getInt("t_id");
             String name=rs.getString("t_name");
               String phone= rs.getString("phone");
                String email= rs.getString("email");
                 String password= rs.getString("password");
                 
                Trainerpojo trainer=new Trainerpojo(uid,name,phone,email,password);
                 list.add(trainer);
            }
        }
        catch(Exception e)
        {
             e.printStackTrace();
        }
        return list;
    }
}
