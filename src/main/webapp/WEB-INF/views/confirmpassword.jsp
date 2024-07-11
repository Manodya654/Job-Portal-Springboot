<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Confirm password</title>
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css"/>
   <style type="text/css">
   		<%@ include file="/WEB-INF/resources/css/login.css" %>
   </style>
</head>
<body>

<div class="main_div">
    <div class="title">Confirm password</div><br><br>
    <h4 align="center">Please enter new password and confirm it</h4><br>
    
    <form:form modelAttribute="confirmpassword" action="confirmpassword" method="POST">
      <div class="input_box">
       <span class="details">Password</span>
          <input type="password" name = "password" placeholder="Enter new password" required>
        <div class="icon"><i class="fas fa-user"></i></div>
      </div>
      <div class="input_box">
       <span class="details">Confirm Password</span>
        <input type="password" name = "password" placeholder="Confirm Password" required>
        <div class="icon"><i class="fas fa-lock"></i></div>
      </div>
      
  
      <div style="color:red;">
      		${errormessage}
      </div>
      
      <div class="input_box button">
        <input type="submit" value="Reset password">
      </div>
      <br>
      <div class="sign_up">
          Already have an account? <a href="register">Register here</a>   
   </div>
   
  
    </form:form>
  </div>

</body>
</html>