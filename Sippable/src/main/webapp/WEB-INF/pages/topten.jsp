<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<style>

body {   
   background-image: url("https://images8.alphacoders.com/413/413078.jpg");
   background-size: cover;
}

#header{
		color: white;
}

#list{
	margin-right:100px;
	margin-left:100px;
}

table.table tbody td {
    color: #3D3D3D;
    padding: 4px;
    background-color: #FFF;
    vertical-align: top;
}
table.table tbody tr.odd td {
    background-color:#F0F0F6;
}

table th { width:150px;
           border:1px outset gray;
           background-color:#3C78B5;
           color:White;
           
}
table td { width:150px; border:1px solid gray;}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Top Ten</title>
</head>
<body>

	<sql:setDataSource var="snapshot" driver="oracle.jdbc.driver.OracleDriver"
	url="jdbc:oracle:thin:@sippablerds.csooorxl70nv.us-east-1.rds.amazonaws.com:1521:ORCL"
	user="admin"
	password="adminadmin"/>
	
	<sql:query dataSource="${snapshot}" var="result">
	  SELECT *
  	  FROM  
	 (SELECT * 
      FROM DRINK
  	  ORDER BY RATING_AVG DESC ) 
 	  WHERE ROWNUM <= 10
	</sql:query>
	
	
	<h2 align="center" id="header">Top Ten Drinks</h2>
	<div id="list">
  <table class="table" align="center" border="1" style=width:100%>
  <thead class="thead-default">
    <tr bgcolor="#b3b3cc" align="center">
	<th style="text-align:center">BEER NAME</th>
	<th style="text-align:center">BREWER</th>
	<th style="text-align:center">BEER RATING</th>
	<th style="text-align:center">BEER TYPE</th>
	<th style="text-align:center">VIEW</th>
	</tr>
  </thead>
  <tbody>
  
  <c:forEach var="row" items="${result.rows}">
	 <tr bgcolor="#c2c2d6">
      
      <td align="center"><c:out value="${row.DRINK_NAME }"></c:out></td>
      <td align="center"><c:out value="${row.BREWER}"></c:out></td>
      <td align="center"><c:out value="${row.RATING_AVG}"></c:out></td>
      <td align="center"><c:if test="${row.DRINKTYPE == 1}" >
      					<c:out value="Ale"></c:out>
      					</c:if>
      					<c:if test="${row.DRINKTYPE == 2}">
      					<c:out value="IPA"></c:out>
      					</c:if>
      					<c:if test="${row.DRINKTYPE == 3}">
      					<c:out value="Lager"></c:out>
      					</c:if>
      					<c:if test="${row.DRINKTYPE == 4}">
      					<c:out value="Wheat"></c:out>
      					</c:if>
      
      </td>
      <td align="center"><form action="beer/${row.DRINK_ID}"><input type="submit" name="" value="view" id="${row.DRINK_ID}"></form></td>
    </tr>
	</c:forEach>
   
  </tbody>
</table>	
</div>


</body>
</html>