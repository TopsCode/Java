/*
catch tag will be used to manage exception 
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
<!-- catch tag -->
<c:catch var="exception">
<% int x=5/0; %>
</c:catch>

<c:if test="${exception!=null}">
<p> The Type Of  Type is = ${exception.message}<br>
	The Exception is = ${exception}
</p>
</c:if>

</body>
</html>