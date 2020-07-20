<%-- 
    Document   : viewtrainer
    Created on : Jul 9, 2020, 10:51:37 PM
    Author     : DEBANJAN KURI
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>view trainers</title>
         <style>
              body{ 
         background-image: url("https://source.unsplash.com/1600x900/?dumbell,gym");
         }
            .heading{
             background-color: yellow;
         }
        </style>
    </head>
    <body>
    <h1 align="center" class="heading">Current Trainer List</h1>
        <table border="1" cellpadding="15%" align="center">
            <tr bgcolor="blue">
              <th>ID</th>
               <th>NAME</th>
                <th>PHONE</th>
                 <th>EMAIL</th>  
                  <th>PASSWORD</th>  
                  <th>ACTIONS</th>  
            </tr>
        <c:forEach var="items" items="${trainer}">
            <tr bgcolor="white">
            <td>${items.id} </td>
            <td> ${items.name} </td>
            <td>  ${items.phone} </td>
              <td> ${items.email} </td>
              <td>  ${items.password} </td>
              <td>  <a href='Deletetrainer?id=${items.id}'>Delete</a>||<a href='Updatetrainer?id=${items.id}'>Update</a> </td>
              </tr>
        </c:forEach>
             </table>
    
      <div class="container" align="center">
            <form action="add_trainer.jsp">
                <input type="submit" value="add_trainer">
            </form>
        </div>
    
     <div class="container" align="center">
            <form action="success.jsp">
                <input type="submit" value="Back to homepage">
            </form>
        </div>
    </body>
</html>
