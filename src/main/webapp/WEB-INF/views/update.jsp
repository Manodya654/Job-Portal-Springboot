<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>update</title>
</head>
<body>
<h2>Update user details  </h2>
		<p><strong>Update Here | <a href="admin">Click for Read</a></strong></p>
		<form action="../update" method ="post"  >
			<pre>
				<c:forEach var="user1" items="${listuser}">
Id: <input type="text" name="dispId" value="${user1.id}" disabled="disabled"/>  
		<input type="hidden" name="id" value="${user1.id}"/>			

First Name: <input type="text" name="firstname" value="${user1.firstname}" />

Last Name: <input type="text" name="lastname" value="${user1.lastname}" />

Country:	<input type="text" name="country" value="${user1.country}" />

City: 	<input type="text" name="city" value="${user1.city}" />

Company:	<input type="text" name="company" value="${user1.company}" />

Address: <input type="text" name="address" value="${user1.address}" />
	    
phone:	<input type="text" name="phone" value="${user1.phone}" />

Email: 	<input type="email" name="email" value="${user1.email}" />

Password:  	<input type="text" name="password" value="${user1.password}" />

User role:	<input type="text" name="user_role" value="${user1.user_role}" />
					    
			        <input type="submit" value="update" />	
				</c:forEach>	
			</pre>
		</form>
		${msg}	
	</body>
</html>