
package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import  testclasses.Shiftpojo;
public class EditshiftDao {
    
     public boolean updateShift(Shiftpojo trainer)
    {
        boolean flag=false;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
            Statement stmt =con.createStatement();
           
            stmt.executeUpdate( "Update shift set trainer='"+trainer.getTrainer()+"', shift_title='"+trainer.getShift()+"', days='"+trainer.getDays()+"' where shift_id="+trainer.getId()+"");
            flag=true;
           
            
           
        }
        catch(Exception e)
        {
             e.printStackTrace();
        }
        return flag;
    }
}
