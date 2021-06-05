<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!--  <base href="/"/>
	 <link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css"/>
    <script type="text/javascript" src="/webjars/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/webjars/font-awesome/css/font-awesome.min.css"></link> -->
    <link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous">
</head>
</head>
<body>

	<!-- <h4>Welcome,${Header}</h4>
	<p>PetPeers,${Description}</p>
	 -->
	
	<!-- Navigation Bar -->
	<div class="container mt-5 con">
		<nav class="navbar navbar-dark bg-dark">
			<div class="container">
				<a class="navbar-brand" href="homePage"> <i class="fas fa-store-alt">PetShop</i></a> <a
					class="navbar-brand" href="loginPage"> login </a>
			</div>
		</nav>
		<form action="saveUser" method="post">
			<!-- Heading -->
			<h3 class="text-center mt-5">Registration Form</h3>
			<!-- UserName -->
			<div class="mb-3">
				<label for="userName" class="form-label">UserName:</label> <input
					type="text" class="form-control" id="userName"
					aria-describedby="emailHelp" placeholder="Enter Here" name="userName">
			</div>

			<!-- Password -->
			<div class="mb-3">
				<label for="password" class="form-label">Password:</label> <input
					type="password" class="form-control" id="password"
					aria-describedby="emailHelp" placeholder="Enter Here" name="userPassword">
			</div>

			<!-- Confirm Password -->
			<div class="mb-3">
				<label for="confirmPassword" class="form-label">Confirm
					Password:</label> <input type="password" class="form-control"
					id="confirmPassword" aria-describedby="emailHelp"
					placeholder="Enter Here" name="confirmPassword">
			</div>
			<!-- Register Button -->
			<button type="submit" class="btn btn-primary">Register</button>
		</form>

	</div>

<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
		crossorigin="anonymous"></script>


	

</body>
</html>