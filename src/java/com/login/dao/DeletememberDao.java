
package com.login.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;

public class DeletememberDao {
     String sql="Delete from member where m_id=?";
     
      public boolean delMember(int id)
    {
      boolean flag=false;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
            PreparedStatement stmt =con.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            flag=true;
            
           
        }
        catch(Exception e)
        {
             e.printStackTrace();
        }
      return flag;
    }
}
