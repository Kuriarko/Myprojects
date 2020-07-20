<%-- 
    Document   : add_member
    Created on : Jun 11, 2020, 12:48:07 AM
    Author     : DEBANJAN KURI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add member</title>
        <style>
         body{ 
         background-image: url("https://source.unsplash.com/1600x900/?dumbell,gym");
         }
         
         input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
   input[type=password], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
   width: 600px;
   margin-top: 100px;
}
.header{
  background-color: cyan;
}
</style>
     </head>
    <body>
           <%
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
            if(session.getAttribute("username")==null)
            {
                response.sendRedirect("register.jsp");
            }
        %>
        <h1 class="header" align="center">Add new member details</h1>
        <center>
             <div>
  <form action="member" method="post" >
    <label for="fname">Enter Name</label>
    <input type="text" id="fname" name="name" placeholder=" Name..">
    
    <label for="fname">Enter Phone</label>
    <input type="text" id="fname" name="phone" placeholder="phone..">
    
    <label for="fname">Enter Email</label>
    <input type="text" id="fname" name="email" placeholder="email..">

    <label for="password">Password</label>
    <input type="password" id="password" name="password" placeholder="password..">

    
  
    <input type="submit" value="Add">
  </form>
</div>
                </center>

        
    </body>
</html>
