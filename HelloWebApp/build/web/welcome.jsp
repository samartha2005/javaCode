<%-- 
    Document   : welcome.jsp
    Created on : Jul 22, 2025, 9:59:04 AM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Welcome Page</title>
    </head>
    <body>
        <h2>Welcome to Your First Java Web Application!</h2>
        <form action="HelloServlet" method="Post">
            Enter Your Name: <input type="text" name="username"/>
            <input type="submit"/>
        </form>
    </body>
</html>