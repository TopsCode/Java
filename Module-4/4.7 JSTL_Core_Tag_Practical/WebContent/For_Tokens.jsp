/*

forTokens tag will be used to separate data from regex

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
<!-- forTokens tag-->
<c:forTokens items="HARSH-JANI-RAHUL" delims="-" var="name">
<c:out value="${name}"/><p>
</c:forTokens>

</body>
</html>