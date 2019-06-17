/*

if tag will be used to take some dession 

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
<!-- if tag -->
<c:set var="data" value="${4000*4}"/>
<c:if test="${data>7000}">
<c:out value="${data }"></c:out>
</c:if>

</body>
</html>