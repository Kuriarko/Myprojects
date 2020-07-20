
package testclasses;


public class trainerBean {
     private String name,phone,email,password;
    
   public trainerBean(String name,String phone,String email,String password)
    {
        this.name=name;
        this.phone=phone;
        this.email=email;
        this.password=password;
    }
   public void setName(String name)
   {
       this.name=name;
   }        
   public String getName()
   {
       return name;  
   }
   public void setPhone(String phone)
   {
       this.phone=phone;
   } 
    public String getPhone()
   {
       return phone;  
   }
     public void setEmail(String email)
   {
       this.email=email;
   } 
    public String getEmail()
   {
       return email;  
   }
     public void setPassword(String password)
   {
       this.password=password;
   } 
    public String getPassword()
   {
       return password;  
   }
   
}
