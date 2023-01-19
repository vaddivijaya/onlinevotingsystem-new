<%-- 
    Document   : contact
    Created on : 17 Jan, 2023, 8:33:55 AM
    Author     : vijaya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact us</title>
<link rel="stylesheet" type="text/css" href="style.css"> 
</head>
<%@ include file="navbar.jsp"%> 
<body>
<div class="form-container" >
<form action="ContactUs" method="post">

<label for="name" class="form-elements"><b>Name :</b></label>
<br>
<input id="name" name="name" class="form-elements form-input" type="text"/>
<br>
<label for="number" class="form-elements"><b>Phone Number :</b></label>
<br>
<input id="number" name="number" class="form-elements form-input" type="number"/>
<br>
<label for="email" class="form-elements"><b>Email :</b></label>
<br>
<input id="email" name="email" class="form-elements form-input" type="email"/>
<br>
<label for="comment" class="form-elements"><b>Comments :</b></label>
<br>
<textarea id="comment" name="comment" class="form-elements form-input" ></textarea>
<br>
<button type="Submit" class="form-elements form-button">Submit</button>
</form>
</div>
</body>
</html>