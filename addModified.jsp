<%--
  Created by IntelliJ IDEA.
  User: Kabin Giri
  Date: 4/27/2024
  Time: 10:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--for importing package , directive--%>
<%@page import =" java.util.Date"    %>

<%!  int value = 0;
//this is the decleration part
%>
<%--scriplet--%>
    <%
        int i = Integer.parseInt(request.getParameter("num1"));
        int j = Integer.parseInt(request.getParameter("num2"));

        int k = i + j;

        out.println("Sum is: " + k);
        out.println("Testing ");

    %>

<%--expression--%>
<%= "I am Kabin"%>
</body>
</html>
