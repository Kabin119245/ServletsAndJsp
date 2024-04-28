<%@ page import="com.kabin.learning.model.Alien" %><%--
  Created by IntelliJ IDEA.
  User: Kabin Giri
  Date: 4/28/2024
  Time: 10:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Show alien is called

<%
    Alien a1 = (Alien)request.getAttribute("label");
    out.println(a1);
%>
</body>
</html>
