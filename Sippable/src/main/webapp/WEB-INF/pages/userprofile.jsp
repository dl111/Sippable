<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Sippable</title>

<link href="static/css/stylehome.css" rel="stylesheet" type="text/css"
	media="all" />

<meta name="viewport" content="width=device-width, initial-scale=1" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Sippable" />

<script src="https://code.angularjs.org/1.6.0-rc.2/angular.min.js"></script>

<script src="https://code.jquery.com/jquery-3.2.1.min.js"
	integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
	crossorigin="anonymous"></script>
	
<script src = "static/js/profileangular.js"></script>

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

</head>
<body ng-app="app" ng-controller = "initValCtrl">
	<!-- header -->
	<div class="header">
		<div class="container">
			<div class="logo">
				<a href="welcome"><img src="static/img/logo.png"
					class="img-responsive" alt=""></a>
			</div>
			<div class="head-nav">
				<span class="menu"> </span>
				<ul class="cl-effect-1">
					<li class="active"><a href="welcome">Home</a></li>
					<li><a href="allbeers">Find a Beer</a></li>
					<li><a href="topten">Our top 10</a></li>
					<li><a href="profile">Your Profile</a></li>
					<li><a href="http://34.200.225.32/Sippable/">Log Out</a></li>
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
			<div class="clearfix"></div>
		</div>
	</div>
	<!-- header -->

	<!--  display users info  -->
	<div class="well well-lg">
		<div class="list-group">
			<h2 class="list-group-item ">User Profile</h2>
			<p class="list-group-item"">
				First Name:{{user.firstName}} <a class="changeinfo" href="#"><span
					class="glyphicon glyphicon-cog" aria-hidden="true"
					data-toggle="modal" data-target="#changefname"></span></a>
			</p>
			<p class="list-group-item">
				Last Name: {{user.lastName}} <a class="changeinfo" href="#"><span
					class="glyphicon glyphicon-cog" aria-hidden="true"
					data-toggle="modal" data-target="#changelname"></span></a></span>
			</p>
			<p class="list-group-item">Username: {{user.username}}</p>
			<p class="list-group-item">
				Email: {{user.email}} <a class="changeinfo" href="#"><span
					class="glyphicon glyphicon-cog" aria-hidden="true"
					data-toggle="modal" data-target="#changeemail"></span></a>
			</p>
			<button href="#" class="list-group-item" name="changepassword"
				data-toggle="modal" data-target="#changepassword">Change
				Password</button>
		</div>
	</div>


	<!-- MODALS -->

	<!--  EMAIL MODAL -->
	<div id="changeemail" class="modal fade bs-example-modal-sm"
		tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
		<div class="modal-dialog modal-md" role="document">


			<div class="modal-content">

				<form class="form-group-horizontal" method="POST">

					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h3 class="modal-title" id="myModalLabel">
							<strong>Change Email</strong>
						</h3>
					</div>

					<div class="modal-body">

						<div class="form-group">
							<label class="col-md-4 control-label" for="newemail">New
								Email</label>
								<br><br>
							<div class="col-md-4">
								<input id="newemail" name="newemail" type="email"
									placeholder="example@sippable.com"
									class="form-control input-md" ng-model="user.newemail">
							</div>
							<br><br>
						</div>

						<div class="modal-footer">
							<button type="submit" class="btn btn-primary main-color-bg" ng-click="onSubmitEmail()" data-dismiss="modal">Change</button>
						</div>
					</div>

				</form>

			</div>

		</div>
	</div>
	<!-- end email modal -->

	<!-- CHANGE FIRST NAME MODAL -->
	<div id="changefname" class="modal fade bs-example-modal-sm"
		tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
		<div class="modal-dialog modal-md" role="document">


			<div class="modal-content">

				<form class="form-group-horizontal">

					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h3 class="modal-title" id="myModalLabel">
							<strong>Change First Name</strong>
						</h3>
					</div>

					<div class="modal-body">

						<div class="form-group">
							<label class="col-md-4 control-label" for="newfname">First
								Name</label>
								<br><br>
							<div class="col-md-4">
								<input id="newfname" name="newfname" type="text"
									placeholder="First Name" class="form-control input-md"
									ng-model="user.newfname">
							</div>
							<br><br>
						</div>

						<div class="modal-footer">
							<button class="btn btn-primary main-color-bg" data-dismiss="modal"
								ng-click="onSubmitFname()">Change</button>
						</div>
					</div>

				</form>

			</div>

		</div>
	</div>
	<!-- end last modal -->

	<!-- CHANGE last NAME MODAL -->
	<div id="changelname" class="modal fade bs-example-modal-sm"
		tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
		<div class="modal-dialog modal-md" role="document">


			<div class="modal-content">

				<form class="form-group-horizontal" method="POST">

					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h3 class="modal-title" id="myModalLabel">
							<strong>Change Last Name</strong>
						</h3>
					</div>

					<div class="modal-body">

						<div class="form-group">
							<label class="col-md-4 control-label" for="newlname">Last
								Name</label>
								<br><br>
							<div class="col-md-4">
								<input id="newlname" name="newlname" type="text"
									placeholder="Last Name" class="form-control input-md"
									ng-model ="user.newlname">
							</div>
							<br><br>
						</div>

						<div class="modal-footer">
							<button type="submit" class="btn btn-primary main-color-bg" ng-click="onSubmitLname()" data-dismiss="modal">Change</button>
						</div>
					</div>

				</form>

			</div>

		</div>
	</div>
	<!-- end lname modal -->

	<!-- CHANGE PASSWORD MODAL -->
	<div id="changepassword" class="modal fade bs-example-modal-sm"
		tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
		<div class="modal-dialog modal-md" role="document">


			<div class="modal-content">

				<form class="form-group-horizontal" method="POST">

					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h3 class="modal-title" id="myModalLabel">
							<strong>Change Password</strong>
						</h3>
					</div>

					<div class="modal-body">

						<div class="form-group">
							<label class="col-md-4 control-label" for="newlname">Old
								Password</label>
								<br><br>
							<div class="col-md-4">
								<input id="oldpw" name="newlname" type="password" placeholder=""
									class="form-control input-md">
							</div>
							<br><br>
						</div>
						<div class="form-group">
							<label class="col-md-4 control-label" for="newlname">New
								Password</label>
								<br><br>
							<div class="col-md-4">
								<input id="newpw" name="newlname" type="password" placeholder=""
									class="form-control input-md" ng-model = "user.newpw">
							</div>
							<br><br>
						</div>
						<div class="form-group">
							<label class="col-md-4 control-label" for="newlname">Re-Enter
								New Password</label>
								<br><br>
							<div class="col-md-4">
								<input id="newpwcheck" name="newlname" type="password"
									placeholder="" class="form-control input-md">
							</div>
							<br><br>
						</div>

						<div class="modal-footer">
							<button type="submit" class="btn btn-primary main-color-bg" ng-click="onSubmitPw()" data-dismiss="modal">Change</button>
						</div>
					</div>

				</form>

			</div>

		</div>
	</div>
	<!-- end password modal -->

</body>
</html>
