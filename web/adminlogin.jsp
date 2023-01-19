<%-- 
    Document   : adminlogin
    Created on : 17 Jan, 2023, 8:38:09 AM
    Author     : vijaya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin login</title>
<link rel="stylesheet" type="text/css" href="style.css"> 
</head>
<%@ include file="navbar.jsp"%> 
<body>
<div class="form-container" >

<form action="adminLogin" method="post">
<h3>Admin LogIn</h3>

<label for="name" class="form-elements form-label"><b>Name </b></label>
<br>
<input id="name" name="adminName" class="form-elements form-input" type="text"/>
<br>
<label for="password" class="form-elements form-label"><b>Password </b></label>
<br>
<input id="password" name="password" class="form-elements form-input" type="password"/>
<br>
<button type="Submit" class="form-elements form-button">Login</button>
<br>
</form>

</div>
</body>
</html>