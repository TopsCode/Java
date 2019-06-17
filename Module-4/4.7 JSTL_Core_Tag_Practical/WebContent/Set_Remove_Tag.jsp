/*

remove tag will be used to remove data which is already set to a variable 

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
<!-- set tag -->
<c:set var="income" value="${4500*4}"/>
<p> Before Remove , Income is = <c:out value="${income}" />
</p>

<!-- remove tag -->
<c:remove var="income"/>
<p> After Remove , Income is = <c:out value="${income}" />
</p>

</body>
</html>