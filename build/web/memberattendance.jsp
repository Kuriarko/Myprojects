<%-- 
    Document   : memberattendance
    Created on : Jul 13, 2020, 3:17:05 PM
    Author     : DEBANJAN KURI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MEMBER ATTENDANCE</title>
       
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
select {
  width: 100%;
  padding: 16px 20px;
  border: none;
  border-radius: 4px;
  background-color: #f1f1f1;
}
        </style>
    </head>
    <body>
        <h1 align="center" class="header">MEMBER ATTENDANCE</h1> 
      <div>
  <form action="Memberattendance" method="post" >
    <label for="fname">Member Name</label>
    <input type="text" id="fname" name="name" placeholder="Member name..">

    <label for="password">Attendance</label>
    <select id="attendance" name="attendance">
  <option value="choose one">choose one</option>
  <option value="Present">Present</option>
  <option value="Absent">Absent</option>
  </select>
    
     
    
  
    <input type="submit" value="Mark">
  </form>
</div>

    </body>
</html>
