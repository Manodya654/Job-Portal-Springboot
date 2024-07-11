<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css"/>
   <style type="text/css">
   		<%@ include file="/WEB-INF/resources/css/profile.css" %>
   </style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
	<h2>Profile</h2>
	<div class="row">
  <div class="col-sm-6">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">User Profile</h5>
        <h5 class="card-title">${firstname }</h5>
        <p class="card-text">${country}</p>
        <p class="card-text">${email}</p>
        <a href="profile" class="btn btn-primary">Update Profile</a>
        <form action="../update" method ="post"  >
<pre>
<c:forEach var="user1" items="${listuser}">
<table>	
<tr>
	<td>First Name:</td>
	<td><input type="text" name="firstname" value="${user1.firstname}" /></td>
</tr>			
<tr>
				<td>Last Name:</td>
				<td><input type="text" name="lastname" value="${user1.lastname}" /></td>
</tr>
<tr>
				<td>Email:</td>
				<td><input type="text" name="email" value="${user1.email}" /></td>
</tr>
<tr>
				<td>Address:</td>
				<td><input type="text" name="address" value="${user1.address}" /></td>
</tr>
<tr>
				<td>phone:</td>
				<td><input type="text" name="phone" value="${user1.phone}" /></td>
</tr>
<tr>
				<td>Country:</td>
				<td><input type="text" name="country" value="${user1.country}" /></td>
</tr>
<tr>
				<td>Company:</td>
				<td><input type="text" name="company" value="${user1.company}" />
</td>
</tr>
<tr>
				<td>My Notes:</td>
				<td><input type="text"></td>
</tr>
<tr><td><input type="submit" value="Update"/>	</td></tr>

</table>	

My Updates:<input type="text">	<button id="save" name="save">Save</button>
</c:forEach>	
</pre>
</form>
      </div>
    </div>
  </div>
  <div class="col-sm-6">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Search for Jobs</h5>
        <p class="card-text">We search for new jobs daily from all leading
job boards to bring you<br>the best opportunities in your industry.</p><br><br><br>
        <a href="index.jsp" class="btn btn-primary">Go somewhere</a>
      </div>
    </div>
  </div>
</div>
<form action="../update" method ="post"  >
<pre>
<c:forEach var="user1" items="${listuser}">
<table>	
<tr>
	<td>First Name:</td>
	<td><input type="text" name="firstname" value="${user1.firstname}" /></td>
</tr>			
<tr>
				<td>Last Name:</td>
				<td><input type="text" name="lastname" value="${user1.lastname}" /></td>
</tr>
<tr>
				<td>Email:</td>
				<td><input type="text" name="email" value="${user1.email}" /></td>
</tr>
<tr>
				<td>Address:</td>
				<td><input type="text" name="address" value="${user1.address}" /></td>
</tr>
<tr>
				<td>phone:</td>
				<td><input type="text" name="phone" value="${user1.phone}" /></td>
</tr>
<tr>
				<td>Country:</td>
				<td><input type="text" name="country" value="${user1.country}" /></td>
</tr>
<tr>
				<td>Company:</td>
				<td><input type="text" name="company" value="${user1.company}" />
</td>
</tr>
<tr>
				<td>My Notes:</td>
				<td><input type="text"></td>
</tr>
<tr><td><input type="submit" value="Update"/>	</td></tr>

</table>	

My Updates:<input type="text">	<button id="save" name="save">Save</button>
</c:forEach>	
</pre>
</form>

</body>
</html>