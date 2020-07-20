
package com.login.dao;

import java.sql.*;
public class mloginDao {
      boolean flag=false;
    String sql="select * from member where m_name=? and password=?";
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
