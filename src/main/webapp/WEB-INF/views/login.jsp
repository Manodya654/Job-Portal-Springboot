<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!-- Created By CodingLab - www.codinglabweb.com -->
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
   <!---- <title> Login Form | CodingLab </title>--->
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css"/>
   <style type="text/css">
   		<%@ include file="/WEB-INF/resources/css/login.css" %>
   </style>
   </head>
<body>

  <div class="main_div">
    <div class="title">Login </div>
    <form:form modelAttribute="login" action="loginProcess" method="POST">
      <div class="input_box">
       <span class="details">Email</span><br>
    <input type="email" name = "email" placeholder="Email or Phone" required>
        <div class="icon"><i class="fas fa-user"></i></div>
      </div><br>
      <div class="input_box">
       <span class="details">Password</span>
        <input type="password" name = "password" placeholder="Password" required>
        <div class="icon"><i class="fas fa-lock"></i></div>
      </div>
      
      <div style="color:red;">
      		${errormessage}
      </div><br><br>
      <div class="option_div">
        <div class="check_box">
          <input type="checkbox">
          <span>Remember me</span>
        </div>
        <div class="forget_div">
          <a href="forgotpassword">Forgot password?</a>
        </div>
      </div>
      <div class="input_box button">
        <input type="submit" value="Login">
      </div>
   
      <div class="sign_up">
        Not a member? <a href="register">Signup now</a>
      </div>
    </form:form>
  </div>
  
</body>
</html>

