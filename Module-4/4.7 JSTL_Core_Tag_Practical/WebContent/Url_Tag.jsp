/*

url tag will be used to create url 

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
<!-- url and param tag -->
<c:url value="index1.jsp" var="completeURL" >
<c:param name="trackingid" value="98745"></c:param>
<c:param name="user" value="321"></c:param>
</c:url>
${completeURL}



</body>
</html>