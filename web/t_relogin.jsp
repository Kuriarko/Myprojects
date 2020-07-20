<%-- 
    Document   : m_relogin
    Created on : Jun 11, 2020, 11:02:58 PM
    Author     : DEBANJAN KURI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trainer Relogin</title>
    </head>
    <body>
  <h1>Incorrect username/password,login again!</h1>
         <form action="trainercontroller" method="post">
         Enter username:<input type="text" name="name" ><br>
         Enter Password:<input type="password" name="password" ><br>
         <input type="submit" value="login" >
     </form>    </body>
</html>
