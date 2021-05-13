<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="">
		<table>
			<tr>
				<td>username: <input type="text" name="uname"></td>
			</tr>
			<tr>
				<td>password: <input type="password" name="pwd"></td>
			</tr>
			<tr>
				<td>confirmpassword: <input type="password" name="cpwd"></td>
			</tr>
			<tr>
				<td>email: <input type="email" name="mail"></td>
			</tr>
			<tr>
				<td>phoneno: <input type="number" name="phn"></td>
			</tr>
			<tr>
				<td>country: <input type="text" name="loc"></td>
			</tr>
			<tr>
				<td>state: <input type="text" name="state"></td>
			</tr>
			<tr>
				<td>gender: <input type="radio" value="Male"></td>
			</tr>
			<tr>
				<td><input type="radio" value="Female"></td>
			</tr>
			<tr>
				<td><input type="radio" value="Trans"></td>
			</tr>

			<input type="submit">
			<input type="submit" value="reset">
		</table>
	</form>
</body>
</html>