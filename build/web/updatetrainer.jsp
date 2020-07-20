<%-- 
    Document   : updatetrainer
    Created on : Jul 10, 2020, 12:55:43 PM
    Author     : DEBANJAN KURI
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>update trainer</title>
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
         <h1 class="header" align="center">Make necessary changes to trainer</h1>
      
         <c:forEach var="items" items="${trainer}">
             <center>
         <div>
  <form action="Edittrainer" method="post" >
      <label for="fname">Id</label>
    <input type="hidden" id="fname" name="id" value="${items.id}" >
    
    <label for="fname">Enter Name</label>
    <input type="text" id="fname" name="name" value="${items.name}" >
    
    <label for="fname">Enter Phone</label>
    <input type="text" id="fname" name="phone" value="${items.phone}">
    
    <label for="fname">Enter Email</label>
    <input type="text" id="fname" name="email"  value="${items.email}">

    <label for="password">Password</label>
    <input type="password" id="password" name="password" value="${items.password}">

    
  
    <input type="submit" value="Update">
  </form>
</div>
    </center>
                     </c:forEach>
    </body>
</html>
