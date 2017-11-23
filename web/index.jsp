<%-- 
    Document   : index
    Created on : 21 nov. 2017, 15:15:49
    Author     : user
--%>
<% String s = "Hello World !!!"; %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%= s %></h1>
    </body>
    <script>
        alert("<%= s %>");
    </script>
</html>
