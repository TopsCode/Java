
<%@page import="com.Dao.StudentDao"%>
<%@page import="com.Bean.StudentBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	List<StudentBean> list=StudentDao.getAllStudent();
%>
<table border="1" width="100%" cellpadding=5 cellspacing=5>
	<tr>
		<th>ID</th>
		<th>FNAME</th>
		<th>LNAME</th>
		<th>EMAIL</th>
		<th>EDIT</th>
		<th>DELETE</th>
	</tr>
	<%
		for(StudentBean s:list)
		{
	%>
	<tr>
		<td><%=s.getId() %></td>
		<td><%=s.getFname() %></td>
		<td><%=s.getLname() %></td>
		<td><%=s.getEmail() %></td>
		<td>
			<form name="edit" method="post" action="ActionController">
				<input type="hidden" name="id" value="<%=s.getId()%>">
				<input type="submit" name="action" value="Edit">
			</form>
		</td>
		<td>
			<form name="delete" method="post" action="ActionController">
				<input type="hidden" name="id" value="<%=s.getId()%>">
				<input type="submit" name="action" value="Delete">
			</form>
		</td>
	</tr>
	<%		
		}
	%>
</table>
</body>
</html>