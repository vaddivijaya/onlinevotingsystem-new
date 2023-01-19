<%-- 
    Document   : adminLogout
    Created on : 17 Jan, 2023, 8:35:06 AM
    Author     : vijaya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout</title>
</head>
<body>
<%
          HttpSession session1 = request.getSession();
          session1.removeAttribute("adminname");
          response.sendRedirect("index.jsp");
%>
</body>
</html>
