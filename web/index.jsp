<%-- 
    Document   : index
    Created on : 17 Jan, 2023, 8:32:54 AM
    Author     : vijaya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>Online Voting System</title>
</head>
<%@ include file="navbar.jsp"%> 
<body>
	<div class="form-container">
		<form action="voterLogin" method="post">
			<h3>Enter Your Voter Card Number</h3>
			<label for="voterNumber" class="form-elements form-label">
			<b>Voter ID</b>
			</label>
			<input name="voterNumber" id="voterNumber" class="form-elements form-input" type="text"/>
			<br>
			<button type="submit" class="form-elements form-button">Login</button>
			<br>
			<a href="adminlogin.jsp" class="index-a">Admin</a>
		</form>
	</div>
</body>


</html>