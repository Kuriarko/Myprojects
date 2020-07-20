<%-- 
    Document   : success1
    Created on : Jun 11, 2020, 2:42:37 PM
    Author     : DEBANJAN KURI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Member Added successfully</title>
    </head>
    <body>
          <%
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
            if(session.getAttribute("username")==null)
            {
                response.sendRedirect("register.jsp");
            }
        %>
        <h1>WELCOME ADMIN</h1>
        <h2>Member Addition successful</h2>
           <div class="container">
            <form action="add_member.jsp">
                <input type="submit" value="add_member">
            </form>
        </div>
         <div class="container">
            <form action="add_trainer.jsp">
                <input type="submit" value="add_trainer">
            </form>
        </div>
         <div class="container">
            <form action="viewmemberController" method="post">
                <input type="submit" value="view_members">
            </form>
        </div>
         <div class="container">
            <form action="viewtrainerController" method="post">
                <input type="submit" value="view_trainers">
            </form>
        </div>
        
        <form action="logout" method="post">
            <input type="submit" value="logout">
        </form>
        
    </body>
</html>
