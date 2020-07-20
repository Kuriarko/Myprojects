
package testclasses;


public class Trainerpojo {
    private int id;
    private String name;
    private String phone;
    private String email;
    private String password;
    
      public Trainerpojo( int id,String name,String phone,String email,String password)
    {
        this.id=id;
        this.name= name;
        this.phone=phone;
        this.email=email;
        this.password= password;
    }
      
       public void setId(int id)
    {
         this.id=id;
    }
   public int getId()
    {
        return id;
    }
     public void setName(String name)
    {
        this.name= name;
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
     public void  setEmail(String email)
    {
        this.email=email;
    }
    public String getEmail()
    {
        return email;
    }
     public void setPassword(String password)
    {
        this.password= password;
    }
     public String getPassword()
    {
        return password;
    }
}
