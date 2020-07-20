
package com.login.dao;

public class ShiftBean {
    private String trainer;
    private String shift_title;
        private String days;

    
      public ShiftBean( String trainer,String shift_title,String days)
    {
      
        this.trainer= trainer;
        this.shift_title=shift_title;
                this.days=days;

       
    }
      
       public void setTrainer(String trainer)
    {
        this.trainer= trainer;
    }
    public String getTrainer()
    {
        return trainer;
    }
    
     public void setShift(String shift_title)
    {
        this.shift_title= shift_title;
    }
    public String getShift()
    {
        return shift_title;
    }
    
     public void setDays(String days)
    {
         this.days=days; 
    }
    public String getDays()
    {
        return days;
    }
      
}
