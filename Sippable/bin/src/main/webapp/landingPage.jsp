<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
           <%@ taglib prefix="sql" 
           uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>This is the beer landing page</h2>	
	
	<sql:setDataSource var="snapshot" driver="oracle.jdbc.driver.OracleDriver"
	url="jdbc:oracle:thin:@sippablerds.csooorx170nv.us-est-1.rds.amazonaws.com:1521:ORCL"
	user="admin"
	password="adminadmin"/>
	
	<sql:query dataSource="${snapshot}" var="result">
	SELECT * FROM DRINK
	</sql:query>
	<table border="1" width="50%" align="center">
	<tr>
	<th>Beer ID</th>
	<th>View Beer</th>
	</tr>
	
	<!-- 
	<c:forEach var="row" items="${beers}">
	<tr>
	<td><c:out value="${row.getDrinkId()}"></c:out></td>
	<td><form action="beer/${row.getDrinkId()}"><input type="submit" name="" value="${row.getDrinkId()}" id="${row.getDrinkId()}"></form></td>
	</tr>
	</c:forEach>
	</table>
	-->
	<c:forEach var="row" items="${result.rows}">
	<tr>
	<td><c:out value="${row.getDrinkId()}"></c:out></td>
	<td><form action="beer/${row.getDrinkId()}"><input type="submit" name="" value="${row.getDrinkId()}" id="${row.getDrinkId()}"></form></td>
	</tr>
	</c:forEach>
	</table>
	
	
</body>
</html>