
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
   color : white;		
   background-image: url("https://images8.alphacoders.com/413/413078.jpg");
   background-size: cover;
}

#header{
		color : white;
}

#searchField{	
	color: black;
	width:200px;
	margin:auto;
}

.table{
	color : black;
	border-spacing:0; 
	border:1px solid gray;
	
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

#searchButton{
	color : black;
}

#list{
	margin-right:100px;
	margin-left:100px;
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Drink List</title>
<link href="static/css/bootstraphome.css" rel="stylesheet"
	type="text/css" media="all">
<link href="static/css/stylehome.css" rel="stylesheet" type="text/css"
	media="all" />
	
	<link rel="stylesheet" href="static/css/style.css">
	
	
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Sippable" />
<!-- <script type="application/x-javascript">
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 

</script> -->



</head>

<body>

	<!-- header -->
	<div class="header">
		<div class="container">
			<div class="logo">
				<a href="welcome"><img src="static/img/logo.png"
					class="img-responsive" alt=""></a>
			</div>

			<div class="head-nav aleft">
				<span class="menu"> </span>
				<ul class="cl-effect-1">
					<li class="active"><a href="welcome">Home</a></li>
					<li><a href="allbeers">Find a Beer</a></li>
					<li><a href="topten">Our top 10</a></li>
					<li><a href="blog.html">Latest articles</a></li>
					<li><a href="404.html">Your Profile</a></li>
					<div class="clearfix"></div>
				</ul>
			</div>
			<!-- script-for-nav -->
			<script>
				$("span.menu").click(function() {
					$(".head-nav ul").slideToggle(300, function() {
						// Animation complete.
					});
				});
			</script>
			<!-- script-for-nav -->

</div>
</div>
	<h2 align="center" id="header">Search for Drinks</h2>	
	
	
	<!-- Multiple Checkboxes (inline) -->
<div class="form-group" align="center" style="color:white;">
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
<div id="textDiv" align="center">
<span>
<input type="text" id="searchField">
<button id="searchButton">search</button>
</span>

</div>

<br>
<div id="list" >

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

		//ADD HERE!!!
		var searchField = 'a' + $("#searchField").val();
		var str = "search/drink/" + ale + "/" + ipa + "/" + lager + "/" + wheat + "/" + searchField;

		$.get(str, function(data, status){		
				//console.log(data)
				$("#list").html(data);			
			});	
		
	}

	//ADD THIS TO THE FRONT OF THE TWO VAR STRINGS TO MAKE IT WORK ON YOUR MACHINE!!!!
	//var str = "http://localhost:PORTNUM/Sippable/"
	//DELETE IT TO MAKE IT WORK WHEN YOU PUSH TO STAGING

	
	//get all the drinks
	//ADD HERE!!!http://localhost:8085/Sippable/search/drink/
	var str = "search/drink/0/0/0/0/a";
		$.get(str, function(data, status){		
				//console.log(data)
				$("#list").html(data);			
			});	
		
	//$("#searchField").blur(getTable);
	//$('#checkboxes-0').change(getTable);
	//$('#checkboxes-1').change(getTable);
	//$('#checkboxes-2').change(getTable);
	//$('#checkboxes-3').change(getTable);
	$('#searchButton').click(getTable);
	  
	
});

	
</script>
</body>

</html>