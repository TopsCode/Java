<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style.css">

</head>
<body>

<form action="ActionController" method="post">
	<table>
		<tr>
			<td><label>First Name</label></td>
			<td><input type="text" name="fname" placeholder="First Name">
		
		</tr>
		
		<tr>
			<td><label style="color:yellow;">Last Name</label></td>
			<td><input type="text" name="lname" placeholder="Last Name">
		
		</tr>
		<tr>
			<td>Email</td>
			<td><input type="text" name="email" placeholder="Email">
		
		</tr>
		<tr>
			
			<td><input type="submit" name="action" value="Insert">
		
		</tr>
	</table>
</form>

0</body>
</html>