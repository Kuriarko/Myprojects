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
        <title>update shift</title>
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
}
.header{
  background-color: cyan;
}
</style>
    </head>
    <body>
         <h1 class="header">Make necessary changes to shift</h1>
      
         <c:forEach var="items" items="${shift}">
         <div>
  <form action="Editshift" method="post">
      <label for="fname">Id</label>
    <input type="hidden" id="fname" name="id" value="${items.id}" >
    
    <label for="fname">Enter Trainer Name</label>
    <input type="text" id="fname" name="name" value="${items.trainer}" >
    
    <label for="fname">Enter Shift</label>
    <input type="text" id="fname" name="shift" value="${items.shift}">
    
    <label for="fname">Enter Days</label>
    <input type="text" id="fname" name="days" value="${items.days}">
    
    
    
  
    <input type="submit" value="Update">
  </form>
</div>
                     </c:forEach>
    </body>
</html>
