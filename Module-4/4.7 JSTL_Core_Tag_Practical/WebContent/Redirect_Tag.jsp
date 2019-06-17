/*

redirect tag will be used to redirect control to given url 

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
<!-- redirect tag -->
<c:set var="url" value="1"/>
<c:if test="${url>0}">
<c:redirect url="http://www.javatpoint.in"/>
</c:if>

 
</body>
</html>