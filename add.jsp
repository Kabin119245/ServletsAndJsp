<%-- 
    Document   : add
    Created on : Apr 27, 2024, 1:41:09 AM
    Author     : Kabin Giri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor = "grey">
        <h1>Hello World!</h1>
        <%
            int i = Integer.parseInt(request.getParameter("num1"));
            int j = Integer.parseInt(request.getParameter("num2"));
            
            int k = i + j;
            
            out.println("Sum is: " + k);

        %>
    </body>
</html>
