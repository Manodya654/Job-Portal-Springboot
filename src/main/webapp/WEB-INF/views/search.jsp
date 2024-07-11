<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<jsp:attribute name="pageTitle"><c:out value="Search"/></jsp:attribute>
<jsp:attribute name="currentMenuName"><c:out value="Search"/></jsp:attribute>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>User detail </h2>
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
            <th>Email</th>
        
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
            <td>${user.getEmail()}</td>
            <td><a href="prof"><button type="button" class="btn btn-success">View Profile</button></a></td>
        </tr>
    </c:forEach>
    </tbody>
	</table>
	


 <div class="row">
      <div>
         ${listuser}
     </div>
</div>

</body>
</html>