/*

forEach tag will be used to repetativ task

*/
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- forEach tag -->
<c:forEach var="i" begin="1" end="5"><br>
<c:out value=" Itemes : ${i}"></c:out><p>
</c:forEach>


</body>
</html>