<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
           <%@ taglib prefix="sql" 
           uri="http://java.sun.com/jsp/jstl/sql" %>
           
           <!-- Latest compiled and minified CSS -->
           <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style>
body {
   background-color: #3377ff;
   background-image: url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQwq6cvb3-BfaWBxoWsF1PUzIACHfjl2GlBrkvOAS9qY1I2BFf4QR4nPak");
   background-size: cover;
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Drink List</title>
</head>
<body>
	<h2 align="center">Search for Drinks</h2>	
	
	
	<!-- Multiple Checkboxes (inline) -->
<div class="form-group" align="center">
  <label class="col-md-4 control-label" for="checkboxes"></label>
  <div class="col-md-4">
    <label class="checkbox-inline" for="checkboxes-0">
      <input name="checkboxes" id="checkboxes-0" value="1" type="checkbox">
      Ale
    </label>
    <label class="checkbox-inline" for="checkboxes-1">
      <input name="checkboxes" id="checkboxes-1" value="2" type="checkbox">
      IPA
    </label>
    <label class="checkbox-inline" for="checkboxes-2">
      <input name="checkboxes" id="checkboxes-2" value="3" type="checkbox">
      Lager
    </label>
    <label class="checkbox-inline" for="checkboxes-3">
      <input name="checkboxes" id="checkboxes-3" value="4" type="checkbox">
      Wheat
    </label>
  </div>
</div>

<br>
<div align="center" id="list">

</div> 

<%-- 
	<sql:setDataSource var="snapshot" driver="oracle.jdbc.driver.OracleDriver"
	url="jdbc:oracle:thin:@sippablerds.csooorxl70nv.us-east-1.rds.amazonaws.com:1521:ORCL"
	user="admin"
	password="adminadmin"/>
	
	<sql:query dataSource="${snapshot}" var="result">
	SELECT * FROM DRINK 
	ORDER BY RATING_AVG DESC
	</sql:query>
	
	
	
  <table class="table" align="center" border="1">
  <thead class="thead-default">
    <tr bgcolor="#b3b3cc" align="center">
	<th style="text-align:center">BEER NAME</th>
	<th style="text-align:center">BREWER</th>
	<th style="text-align:center">BEER RATING</th>
	<th style="text-align:center">VIEW</th>
	</tr>
  </thead>
  <tbody>
  
  <c:forEach var="row" items="${result.rows}">
	 <tr bgcolor="#c2c2d6">
      
      <td align="center"><c:out value="${row.DRINK_NAME }"></c:out></td>
      <td align="center"><c:out value="${row.BREWER}"></c:out></td>
      <td align="center"><c:out value="${row.RATING_AVG}"></c:out></td>
      <td align="center"><form action="beer/${row.DRINK_ID}"><input type="submit" name="" value="view" id="${row.DRINK_ID}"></form></td>
    </tr>
	</c:forEach>
   
  </tbody>
</table>	--%>

<script>
$( document ).ready(function() {
	
	function getTable(){
		// /search/drink  
		var ale = 0;
		if(document.getElementById('checkboxes-0').checked){
			var ale = '1';
		}
		
		var ipa = 0;
		if(document.getElementById('checkboxes-1').checked){
			var ipa = '1';
		}
		
		var lager = 0;
		if(document.getElementById('checkboxes-2').checked){
			var lager = '1';
		}
		
		var wheat = 0;
		if(document.getElementById('checkboxes-3').checked){
			var wheat = '1';
		}
		var str = "http://localhost:8085/Sippable/search/drink/" + ale + "/" + ipa + "/" + lager + "/" + wheat;
		$.get(str, function(data, status){		
				//console.log(data)
				$("#list").html(data);			
			});	
		
	}
	
	
	//get all the drinks
	var str = "http://localhost:8085/Sippable/search/drink/0/0/0/0"
		$.get(str, function(data, status){		
				//console.log(data)
				$("#list").html(data);			
			});	
	
	$('#checkboxes-0').change(getTable);
	$('#checkboxes-1').change(getTable);
	$('#checkboxes-2').change(getTable);
	$('#checkboxes-3').change(getTable);
	  
	
});

	
</script>
</body>
</html>