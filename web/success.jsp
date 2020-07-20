<%-- 
    Document   : success
    Created on : Jun 9, 2020, 1:10:20 AM
    Author     : DEBANJAN KURI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WELCOME ADMIN</title>
        <link href="https://unpkg.com/tailwindcss@^1.0/dist/tailwind.min.css" rel="stylesheet">
     <style>
         .header1{
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
        
        <h1 class="header1" align="center">Welcome Admin</h1>
         
       <h2 class="header1" align="center"> Hi ${username}</h2>
        
      
       
        <section class="text-gray-700 body-font">
  <div class="container px-5 py-24 mx-auto">
    <div class="flex flex-wrap -mx-4 -mb-10 text-center">
      <div class="sm:w-1/2 mb-10 px-4">
        <div class="rounded-lg h-64 overflow-hidden">
          <img alt="content" class="object-cover object-center h-full w-full" src="https://source.unsplash.com/1600x900/?gym member,gym member">
        </div>
        <h2 class="title-font text-2xl font-medium text-gray-900 mt-6 mb-3">View Members</h2>
        <p class="leading-relaxed text-base">View all the current members of the gym.</p>
        <button class="flex mx-auto mt-6 text-white bg-indigo-500 border-0 py-2 px-5 focus:outline-none hover:bg-indigo-600 rounded"><form action="viewmemberController" method="post">
                <input type="submit" value="view_members" >
            </form></button>
      </div>
      <div class="sm:w-1/2 mb-10 px-4">
        <div class="rounded-lg h-64 overflow-hidden">
          <img alt="content" class="object-cover object-center h-full w-full" src="https://source.unsplash.com/1600x900/?gym trainer,gym trainer">
        </div>
        <h2 class="title-font text-2xl font-medium text-gray-900 mt-6 mb-3">View Trainers</h2>
        <p class="leading-relaxed text-base">View all the current trainers of the gym.</p>
        <button class="flex mx-auto mt-6 text-white bg-indigo-500 border-0 py-2 px-5 focus:outline-none hover:bg-indigo-600 rounded"><form action="viewtrainerController" method="post">
                <input type="submit" value="view_trainers">
            </form></button>
      </div>
    </div>
  </div>
</section>

         <section class="text-gray-700 body-font">
  <div class="container px-5 py-24 mx-auto">
    <div class="flex flex-wrap -mx-4 -mb-10 text-center">
      <div class="sm:w-1/2 mb-10 px-4">
        <div class="rounded-lg h-64 overflow-hidden">
          <img alt="content" class="object-cover object-center h-full w-full" src="https://source.unsplash.com/1600x900/?gym shift,gym shift">
        </div>
        <h2 class="title-font text-2xl font-medium text-gray-900 mt-6 mb-3">View Workout Shifts</h2>
        <p class="leading-relaxed text-base">View all the current workout shifts of the gym.</p>
        <button class="flex mx-auto mt-6 text-white bg-indigo-500 border-0 py-2 px-5 focus:outline-none hover:bg-indigo-600 rounded"><form action="viewshiftController" method="post">
                <input type="submit" value="view_shifts" >
            </form></button>
      </div>
      <div class="sm:w-1/2 mb-10 px-4">
        <div class="rounded-lg h-64 overflow-hidden">
          <img alt="content" class="object-cover object-center h-full w-full" src="https://source.unsplash.com/1600x900/?departure,goodbye">
        </div>
        <h2 class="title-font text-2xl font-medium text-gray-900 mt-6 mb-3">Logout</h2>
        <p class="leading-relaxed text-base">Logout Safely to the home page</p>
        <button class="flex mx-auto mt-6 text-white bg-indigo-500 border-0 py-2 px-5 focus:outline-none hover:bg-indigo-600 rounded"><form action="logout" method="post">
                <input type="submit" value="logout">
            </form></button>
      </div>
    </div>
  </div>
</section>

    </body>
</html>
