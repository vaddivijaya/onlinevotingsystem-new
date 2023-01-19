<%-- 
    Document   : userWelcome
    Created on : 17 Jan, 2023, 8:42:58 AM
    Author     : vijaya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome User !</title>
<link rel="stylesheet" type="text/css" href="style.css"> 
</head>
<%@ include file="navbar.jsp"%> 
<body>
<div class="form-container">
<form action="Vote" method="post" >

<label for="voterNumber" class="form-elements form-label"><b>Enter your voter card number</b></label>
<br>
<input id="voterNumber" name="voterNumber" class="form-elements form-input" type="text"/>
<br>

<label for="party" class="form-elements form-label"><b>Choose your party</b></label>
<br>
<input type="radio" id="tdp" name="party" value="telugu desham Party">
<label for="tdp"><img class="party_img" alt="tdp" src="images/tdp.jpg">TDP</label><br>
<input type="radio" id="bjp" name="party" value="BJP">
<label for="bjp"><img class="party_img" alt="bjp" src="images/bjp.jpg">BJP</label><br>
<input type="radio" id="ycp" name="party" value="YCP">
<label for="ycp"><img class="party_img" alt="ycp" src="images/ycp.jpg">YCP</label><br>
<input type="radio" id="congress" name="party" value="Congress">
<label for="congress"><img class="party_img" alt="congress" src="images/congress.png">Congress</label><br>
<input type="radio" id="cpi" name="party" value="CPI">
<label for="cpi"><img class="party_img" alt="cpi" src="images/CPI-banner.jpeg">CPI</label><br>
<br>

<button type="Submit" class="form-elements form-button">Submit</button>

</form>
</div>


</body>
</html>