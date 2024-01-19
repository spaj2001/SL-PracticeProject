<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>
<style>
body {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	text-align: center;
	background-color: #f2f2f2;
}

.panel {
	width: 500px;
	padding: 40px;
	background-color: #ffffff;
	border-radius: 5px;
	box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
}

.panel label {
	display: block;
	margin-bottom: 10px;
	text-align: left;
}

.panel input[type="text"], .panel input[type="password"] {
	width: 100%;
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 4px;
}

.panel button[type="submit"] {
	width: 100%;
	padding: 10px;
	background-color: #4CAF50;
	color: white;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

.panel button[type="submit"]:hover {
	background-color: #45a049;
}

.panel .signup-link {
	display: block;
	margin-top: 20px;
}
</style>
</head>
<body>
	<div class="panel">
		<h2>Railway Crossing</h2>
		<h4>User Register</h4>
		<form action="register" method="post">
			<label for="name">Name:</label> <input type="text" id="name"
				name="name" required><br> <label for="email">Email:</label>
			<input type="text" id="email" name="email" required><br>
			<label for="password">Password:</label> <input type="password"
				id="password" name="password" required><br>
			<button type="submit">Register</button>
		</form>
		<div class="signup-link">
			<p>
				Already have an account? <a href="userLogin.jsp">Sign in</a>
			</p>
		</div>
	</div>
</body>
</html>