
package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import testclasses.Memberpojo;
public class EditmemberDao {
     public boolean updateMember(Memberpojo trainer)
    {
        boolean flag=false;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
            Statement stmt =con.createStatement();
           
            stmt.executeUpdate( "Update member set m_name='"+trainer.getName()+"', phone='"+trainer.getPhone()+"', email='"+trainer.getEmail()+"', password='"+trainer.getPassword()+"' where m_id="+trainer.getId()+"");
            flag=true;
           
            
           
        }
        catch(Exception e)
        {
             e.printStackTrace();
        }
        return flag;
    }
}
