<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin</title>
<style type="text/css">
		<%@ include file="/WEB-INF/resources/css/admin.css" %>
</style>
</head>
<body>
	<%@ include file="/WEB-INF/views/header.jsp" %>
	<center>
	<h1>Users Lists</h1>
	
	<table class="styled-table">
    <thead>
        <tr>
        <td>User Id</td>
            <th>First Name</th>
           	<th>Last Name</th>
            <th>Country</th>
           	<th>City</th>
           	<th>Company</th>
           	<th>Address</th>
           	<th>Phone</th>
            <th>Email</th>
           	<th>Password</th>
           	<th>Edit</th>
           	<th>Delete</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach items="${UserLists}" var = "user">
        <tr>
           <td>${user.getId()}</td>
            <td>${user.getFirstname()}</td>
            <td>${user.getLastname()}</td>
            <td>${user.getCountry()}</td>
            <td>${user.getCity()}</td>
            <td>${user.getCompany()}</td>
            <td>${user.getAddress()}</td>
            <td>${user.getPhone()}</td>
            <td>${user.getEmail()}</td>
            <td>${user.getPassword()}</td>
        	<td><a href="update/<c:out value='${user.id}'/>">Update</a></td>
			<td><a href="delete/<c:out value='${user.id}'/>">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
	</table>
	</center>
</body>
</html>