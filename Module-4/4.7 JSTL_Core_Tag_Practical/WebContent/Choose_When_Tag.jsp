/*

choose and when tag is similar like if else ladder in core java

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
<!-- choose and when tag -->
<c:set var="data" value="${4000*4 }" />
<c:choose>
	<c:when test="${data<12000 }">
		Your Income is Good
	</c:when>
	<c:when test="${data<1000 }">
		Your Income is Better
	</c:when>
	<c:otherwise>
		Your Income is Best
	</c:otherwise>
</c:choose>

</body>
</html>