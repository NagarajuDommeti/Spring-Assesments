<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	h3>User Registration
	</h3>

	<form action="login" method="post" modelAttribute="user">
		<pre>
         <strong>Login Here | <a href="Registration.jsp">Click here to Register</a></strong>
        
        User Id: <input type="text" name="userId" />
    
        Password: <input type="password" name="password" />
 
        <input type="submit" value="Login" />
        
        </pre>
	</form>
</body>
</html>