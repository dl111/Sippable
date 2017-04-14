<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<html>
<head>
<title>Sippable</title>
<link href="static/css/bootstraphome.css" rel="stylesheet"
	type="text/css" media="all">
<link href="static/css/stylehome.css" rel="stylesheet" type="text/css"
	media="all" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Sippable" />
<script type="application/x-javascript">
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 

</script>
<link
	href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900'
	rel='stylesheet' type='text/css'>
<link
	href='http://fonts.googleapis.com/css?family=Libre+Baskerville:400,700'
	rel='stylesheet' type='text/css'>
<script src="static/js/jquery.min.js"></script>
<script src="static/js/responsiveslides.min.js"></script>
<script>
	$(function() {
		$("#slider").responsiveSlides({
			auto : true,
			nav : true,
			speed : 500,
			namespace : "callbacks",
			pager : true,
		});
	});
</script>

</head>
<body>
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



			<div class="clearfix"></div>
		</div>
	</div>
	<!-- header -->
	<div class="container">
		<div class="col-md-9 bann-right">
			<!-- banner -->
			<div class="banner">
				<div class="header-slider">
					<div class="slider">
						<div class="callbacks_container">
							<ul class="rslides" id="slider">
								<li><img id="img1" src="static/img/1.jpg"
									class="img-responsive" alt="">
									<div class="caption">
										<h3>Check out our featured beer!</h3>
										<p>Blue Moon Belgian White is brewed with oats for
											creaminess and spiced with the perfect combination of orange
											peel and coriander. An unfiltered wheat ale spiced in the
											Belgian tradition for an uncommonly smooth taste.</p>
									</div></li>
								<li><img id="img2" src="static/img/4.jpg"
									class="img-responsive" alt="">
									<div class="caption">
										<h3>Our latest article: Books N' Beer</h3>
										<p>What happens when you read a book sipping on beer? What
											kind of books pair well with beer? All your questions
											answered here!</p>
									</div></li>
								<li><img id="img3" src="static/img/5.jpg"
									class="img-responsive" alt="">
									<div class="caption">
										<h3>Discover your next favorite beer!</h3>
										<p>Find our what bold new taste awaits you. Select from
											our hand picked top 10 best beers of the year!</p>
									</div></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
			<!-- banner -->
			<!-- nam-matis -->
			<div class="nam-matis">
				<div class="nam-matis-top">
					<div class="col-md-6 nam-matis-1">
						<a href="single.html"><img src="static/img/1.jpg"
							class="img-responsive" alt=""></a>
						<h3>
							<a href="single.html">Blue Moon</a>
						</h3>
						<p>Blue Moon Belgian White is brewed with oats for
											creaminess and spiced with the perfect combination of orange
											peel and coriander. An unfiltered wheat ale spiced in the
											Belgian tradition for an uncommonly smooth taste.</p>
					</div>
					<div class="col-md-6 nam-matis-1">
						<a href="single.html"><img src="static/img/4.jpg"
							class="img-responsive" alt=""></a>
						<h3>
							<a href="single.html">Books N' Beer</a>
						</h3>
						<p>What happens when you read a book sipping on beer? What
											kind of books pair well with beer? All your questions
											answered here!</p>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>

			<div class="clearfix"></div>
			<div class="copyright">
				<p>
					Copyrights © 2017 Sippable All rights reserved | We worked really
					hard on this.</a>
				</p>
			</div>
		</div>
	</div>
</body>
</html>