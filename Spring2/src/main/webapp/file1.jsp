<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Welcome to the Spring MVC</p>
	<form action="Index.jsp">
		<table>
			<tr>
				<td>Name:</td>
				<td><input type="text" id="name" name="name" size="10" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" id="pass" name="pass" size="20"
					required="required" /></td>
			</tr>
			<tr colspan=2>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>