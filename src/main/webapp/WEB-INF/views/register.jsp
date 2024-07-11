<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!-- Created By CodingLab - www.codinglabweb.com -->
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <!---<title> Responsive Registration Form | CodingLab </title>--->
    <link rel="stylesheet" href="style.css">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style type="text/css">
    	<%@ include file = "/WEB-INF/resources/css/register.css"%>
    </style>
   </head>
<body>



  <div class="container">
    <div class="title">Registration</div>
    <div class="content">
      <form:form modelAttribute="user" action="registerProcess" method="post">
        <div class="user-details">
          <div class="input-box">
            <span class="details">First Name</span>
            <input type="text" name = "firstname" placeholder="Enter your first name" required>
          </div>
          <div class="input-box">
            <span class="details">Last Name</span>
            <input type="text" name = "lastname" placeholder="Enter your last name" required>
          </div>
          <div class="input-box">
            <span class="details">Country</span>
            <input type="text" name = "country" placeholder="Enter your country" required>
          </div>
          <div class="input-box">
            <span class="details">city</span>
            <input type="text" name = "city" placeholder="Enter your city" required>
          </div>
          <div class="input-box">
            <span class="details">Company</span>
            <input type="text" name = "company" placeholder="Enter your company" required>
          </div>
          <div class="input-box">
            <span class="details">Address</span>
            <input type="text" name = "address" placeholder="Enter your address" required>
          </div>
          <div class="input-box">
            <span class="details">Telephone</span>
            <input type="tel" name = "phone" placeholder="Enter your telephone" required>
          </div>
           <div class="input-box">
            <span class="details">Email</span>
            <input type="email" name = "email" placeholder="Enter your email" required>
          </div>
          <div class="input-box">
            <span class="details">Password</span>
            <input type="password" name = "password" placeholder="Enter your password" required>
          </div>
           <div class="input-box">
            <span class="details">User Role</span>
            <input type="text" name = "user_role" placeholder="Enter user role" required>
          </div>
        </div>
        

        <div class="button">
          <input type="submit" value="Register">
        </div>
      </form:form>
    </div>
  </div>

</body>

</html>
