

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MEMBER LOGIN</title>
       
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
        <h1 align="center" class="header">MEMBER LOGIN</h1> 
      <div>
  <form action="membercontroller" method="post" >
    <label for="fname"> Name</label>
    <input type="text" id="fname" name="name" placeholder="Your name..">

    <label for="password">Password</label>
    <input type="password" id="password" name="password" placeholder="Your password..">

    
  
    <input type="submit" value="login">
  </form>
</div>

    </body>
</html>
