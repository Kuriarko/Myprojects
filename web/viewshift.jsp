<%-- 
    Document   : viewshift
    Created on : Jul 12, 2020, 9:46:26 PM
    Author     : DEBANJAN KURI
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>view shift</title>
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
         <h1 align="center" class="heading">Current Shifts List</h1>
        <table border="1" cellpadding="15%" align="center">
            <tr bgcolor="orange">
              <th>ID</th>
               <th>TRAINER</th>
                <th>SHIFT</th>
                <th>DAYS</th>
                <th>ACTIONS</th>  

               
            </tr>
        <c:forEach var="items" items="${shift}">
            <tr bgcolor="white">
            <td>${items.id} </td>
            <td> ${items.trainer} </td>
            <td>  ${items.shift} </td>
            <td>  ${items.days} </td>
             
              <td>  <a href='Deleteshift?id=${items.id}'>Delete</a>||<a href='Updateshift?id=${items.id}'>Update</a> </td>
              </tr>
        </c:forEach>
             </table>
         
          <div class="container" align="center">
            <form action="add_shift.jsp">
                <input type="submit" value="add_shift">
            </form>
        </div>
         
           <div class="container" align="center">
            <form action="success.jsp">
                <input type="submit" value="Back to homepage">
            </form>
        </div>
    </body>
</html>
