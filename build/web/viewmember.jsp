<%-- 
    Document   : viewmember
    Created on : Jul 9, 2020, 8:54:25 PM
    Author     : DEBANJAN KURI
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>view members</title>
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
        <h1 align="center" class="heading" >Current Member List</h1>
        <table border="1" cellpadding="15%" align="center">
            <tr bgcolor="cyan">
              <th>ID</th>
               <th>NAME</th>
                <th>PHONE</th>
                 <th>EMAIL</th>  
                  <th>PASSWORD</th>  
                   <th>ACTIONS</th>  
            </tr>
        <c:forEach var="items" items="${member}">
            <tr bgcolor="white">
            <td>${items.id} </td>
            <td> ${items.name} </td>
            <td>  ${items.phone} </td>
              <td> ${items.email} </td>
              <td>  ${items.password} </td>
                <td>  <a href='Deletemember?id=${items.id}'>Delete</a>||<a href='Updatemember?id=${items.id}'>Update</a> </td>
              </tr>
        </c:forEach>
             </table>
        
         <div class="container" align="center">
            <form action="add_member.jsp">
                <input type="submit" value="add_member">
            </form>
        </div>
        
         <div class="container" align="center">
            <form action="success.jsp">
                <input type="submit" value="Back to homepage">
            </form>
        </div>
    </body>
</html>
