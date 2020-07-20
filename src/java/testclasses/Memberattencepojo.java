/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testclasses;


public class Memberattencepojo {
    private String member;
        private String attendance;
        
       public Memberattencepojo(String member,String attendance)
        {
            this.member=member;
            this.attendance=attendance;
        }
       
        public void setMember(String member)
       {
         this.member=member;
       }
        
      public  String getMember()
       {
         return member;  
       }
       
        public void setAttendance(String attendance)
       {
            this.attendance=attendance;
       }
        public String getAttendance()
       {
         return attendance;  
       }

}
