<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">
<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<style>
body {
	background-color: #3377ff;
	background-image:
		url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQwq6cvb3-BfaWBxoWsF1PUzIACHfjl2GlBrkvOAS9qY1I2BFf4QR4nPak");
	background-size: cover;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Drink List</title>
</head>
<body>
	<h2 align="center">This is the beer landing page</h2>

	<sql:setDataSource var="snapshot"
		driver="oracle.jdbc.driver.OracleDriver"
		url="jdbc:oracle:thin:@sippablerds.csooorxl70nv.us-east-1.rds.amazonaws.com:1521:ORCL"
		user="admin" password="adminadmin" />

	<sql:query dataSource="${snapshot}" var="result">
    SELECT * FROM DRINK 
    ORDER BY RATING_AVG DESC
    </sql:query>



	<table class="table" align="center" border="1">
		<thead class="thead-default">
			<tr bgcolor="#b3b3cc" align="center">
				<th style="text-align: center">BEER NAME</th>
				<th style="text-align: center">BREWER</th>
				<th style="text-align: center">BEER RATING</th>
				<th style="text-align: center">VIEW</th>
			</tr>
		</thead>
		<tbody>

			<c:forEach var="row" items="${result.rows}">
				<tr bgcolor="#c2c2d6">

					<td align="center"><c:out value="${row.DRINK_NAME }"></c:out></td>
					<td align="center"><c:out value="${row.BREWER}"></c:out></td>
					<td align="center"><c:out value="${row.RATING_AVG}"></c:out></td>
					<td align="center"><form action="beer/${row.DRINK_ID}" method = "GET">
							<input type="submit"
								id="${row.DRINK_ID}">
						</form></td>
				</tr>
			</c:forEach>

		</tbody>
	</table>

</body>
</html>