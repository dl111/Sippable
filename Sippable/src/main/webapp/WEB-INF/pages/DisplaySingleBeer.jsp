<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<!DOCTYPE html>
<html>

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

<style>
* {
	box-sizing: content-box;
	alignment-baseline:
}

.header {
	padding: 15px;
	color: #67655D;
}

.image {
	width: 25%;
	float: left;
	padding: 15px;
	margin-left: 8cm;
}

.main {
	width: 25%;
	float: left;
	padding: 15px;
}

.main2 {
	width: 50%;
	float: left;
	padding: 15px;
	margin-left: 8cm;
}

.accordianthing {
	width: 15%;
	float: left;
	padding: 15px;
}

body {
 	background-image:url("https://images8.alphacoders.com/413/413078.jpg");
	background-repeat: no-repeat;
	background-size: cover;
	media-align:center;
}

.mrpoopants{
background-color: cyan;
background-size: cover;


}

</style>
<body>


<div class="header">
	<div class="page-header">
		<h1><c:out value = "${drink.drinkName}"/></h1>
	</div>
</div>

<div class = "mrpoopants">
	<div class="image">

		<img
			src="https://tse4.mm.bing.net/th?id=OIP.94Ls5N7SrpT6ohv7YXe4ggEsDH&w=289&h=192&c=7&qlt=90&o=4&dpr=1.25&pid=1.7"
			alt="..." class="img-thumbnail" align="center" border="5" width="">


	</div>

	<div class="main">
		<ul class="list-group">
			<li class="list-group-item"><span class="badge"> <c:out
						value="${drink.ibu}" />
			</span> ibu</li>
		</ul>
		<ul class="list-group">
			<li class="list-group-item"><span class="badge"><c:out
						value="${drink.aroma}" /></span> aroma</li>
		</ul>
		<ul class="list-group">
			<li class="list-group-item"><span class="badge"><c:out value = "${drink.color}"/></span>
				appearance</li>
		</ul>
		<ul class="list-group">
			<li class="list-group-item"><span class="badge"><c:out value = "${drink.alcholContent}"/></span> alcohol
				content</li>
		</ul>
		<ul class="list-group">
			<li class="list-group-item"><span class="badge"><c:out value = "${drink.brewer}"/></span>
				brewer</li>
		</ul>
		<ul class="list-group">
			<li class="list-group-item"><span class="badge"><c:out value = "${drink.bevType}"/></span> Type of beer</li>
		</ul>
			<ul class="list-group">
			<li class="list-group-item"><span class="badge"><c:out value = "${drink.ratingAvg}"/></span>
				Rating</li>
		</ul>
	</div>
	<div class="main2">
		<div class="list-group">
			<a href="#" class="list-group-item active">
				<h4 class="list-group-item-heading">Description:</h4>
				<p class="list-group-item-text"><c:out value = "${drink.description}"/></p>
			</a>
		</div>
	</div>
	<div class="accordianthing"></div>
</div>
</body>
</html>
