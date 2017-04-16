
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en" class="no-js">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'
	rel='stylesheet' type='text/css'>

<link rel="stylesheet" href="static/css/reset.css">
<!-- CSS reset -->
<link rel="stylesheet" href="static/css/style.css">
<!-- Gem style -->
<script src="static/js/modernizr.js"></script>
<!-- Modernizr -->

<title>Log In &amp; Sign Up Form</title>
</head>
<body>

	<script>
		window.fbAsyncInit = function() {
			FB.init({
				appId : '265099857284372',
				cookie : true,
				xfbml : true,
				version : 'v2.8'
			});
			FB.AppEvents.logPageView();
		};

		(function(d, s, id) {
			var js, fjs = d.getElementsByTagName(s)[0];
			if (d.getElementById(id)) {
				return;
			}
			js = d.createElement(s);
			js.id = id;
			js.src = "//connect.facebook.net/en_US/sdk.js";
			fjs.parentNode.insertBefore(js, fjs);
		}(document, 'script', 'facebook-jssdk'));
	</script>

	<header role="banner">
		<!-- 		<div id="cd-logo"><a href="#0"><img src="static/img/cd-logo.svg" alt="Logo"></a></div> -->

		<nav class="main-nav">
			<ul>

				<!-- inser more links here -->
				
				<li><a class="aleft" href=""><img src="static/img/logo.png" class="img-responsive" alt=""></a></li>
				<li class="aright"><a class="cd-signin" href="#0">Sign in</a></li>
				<li class="aright"><a class="cd-signup" href="#0">Sign up</a></li>
			</ul>
		</nav>
	</header>

	<div class="cd-user-modal">
		<!-- this is the entire modal form, including the background -->
		<div class="cd-user-modal-container">
			<!-- this is the container wrapper -->
			<ul class="cd-switcher">
				<li><a href="#0">Sign in</a></li>
				<li><a href="#0">New account</a></li>
			</ul>

			<div id="cd-login">
				<!-- log in form -->
				<form class="cd-form" method="POST" action="login">
					<p class="fieldset">
						<label class="image-replace cd-email" for="signin-email">E-mail</label>
						<input class="full-width has-padding has-border" id="signin-email"
							type="email" placeholder="E-mail" name="email" path="email" /> <span
							class="cd-error-message">Error message here!</span>
					</p>

					<p class="fieldset">
						<label class="image-replace cd-password" for="signin-password">Password</label>
						<input class="full-width has-padding has-border"
							id="signin-password" type="text" name="password"
							placeholder="Password"> <a href="#0"
							class="hide-password">Hide</a> <span class="cd-error-message">Error
							message here!</span>
					</p>

					<p class="fieldset">
						<input type="checkbox" id="remember-me" checked> <label
							for="remember-me">Remember me</label>
					</p>

					<p class="fieldset">
						<input class="full-width" type="submit" value="Login">
					</p>
					<p class="fieldset">
						<fb:login-button scope="public_profile,email"
							onlogin="checkLoginState();">
						</fb:login-button>
					</p>
				</form>

				<p class="cd-form-bottom-message">
					<a href="#0">Forgot your password?</a>
				</p>
				<!-- <a href="#0" class="cd-close-form">Close</a> -->
			</div>
			<!-- cd-login -->

			<div id="cd-signup">
				<!-- sign up form -->
				<form class="cd-form" method="POST" action="register">
					<p class="fieldset">
						<label class="image-replace cd-username" for="signup-firstname">First
							Name</label> <input class="full-width has-padding has-border"
							id="signup-firstname" type="text" name="firstname"
							placeholder="First Name"> <span class="cd-error-message">Error
							message here!</span>
					</p>
					<p class="fieldset">
						<label class="image-replace cd-username" for="signup-lastname">Last
							Name</label> <input class="full-width has-padding has-border"
							id="signup-lastname" type="text" name="lastname"
							placeholder="Last Name"> <span class="cd-error-message">Error
							message here!</span>
					</p>

					<p class="fieldset">
						<label class="image-replace cd-username" for="signup-username">Username</label>
						<input class="full-width has-padding has-border"
							id="signup-username" type="text" name="username"
							placeholder="Username"> <span class="cd-error-message">Error
							message here!</span>
					</p>

					<p class="fieldset">
						<label class="image-replace cd-email" for="signup-email">E-mail</label>
						<input class="full-width has-padding has-border" id="signup-email"
							type="email" name="email" placeholder="E-mail"> <span
							class="cd-error-message">Error message here!</span>
					</p>

					<p class="fieldset">
						<label class="image-replace cd-password" for="signup-password">Password</label>
						<input class="full-width has-padding has-border"
							id="signup-password" type="text" name="password"
							placeholder="Password"> <a href="#0"
							class="hide-password">Hide</a> <span class="cd-error-message">Error
							message here!</span>
					</p>

					<p class="fieldset">
						<input type="checkbox" id="accept-terms"> <label
							for="accept-terms">I agree to the <a href="#0">Terms</a></label>
					</p>

					<p class="fieldset">
						<input class="full-width has-padding" type="submit"
							value="Create account">
					</p>
				</form>

				<!-- <a href="#0" class="cd-close-form">Close</a> -->
			</div>
			<!-- cd-signup -->

			<div id="cd-reset-password">
				<!-- reset password form -->
				<p class="cd-form-message">Lost your password? Please enter your
					email address.</p>

				<form class="cd-form" action="forgotpassword" method="POST">
					<p class="fieldset">
						<label class="image-replace cd-email" for="reset-email">E-mail</label>
						<input class="full-width has-padding has-border" id="reset-email"
							type="email" placeholder="E-mail" name="email"> <span
							class="cd-error-message">Error message here!</span>
					</p>

					<p class="fieldset">
						<input class="full-width has-padding" type="submit"
							value="Reset password">
					</p>
				</form>

				<p class="cd-form-bottom-message">
					<a href="#0">Back to log-in</a>
				</p>
			</div>
			<!-- cd-reset-password -->
			<a href="#0" class="cd-close-form">Close</a>
		</div>
		<!-- cd-user-modal-container -->
	</div>
	<!-- cd-user-modal -->
	<script
		src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script src="static/js/main.js"></script>
	<!-- Gem jQuery -->
</body>

</html>
