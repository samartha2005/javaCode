<%-- 
    Document   : feedback
    Created on : Jul 17, 2025, 8:45:46 AM
    Author     : lenovo
--%>

<%@page contentType="text/html" import = "java.sql.*" pageEncoding="UTF-8"%>
<%
    String name, message, country, em;
    name = request.getParameter("t1");
    message = request.getParameter("t2");
    country = request.getParameter("t3");
    em = request.getParameter("t4");
    
try
{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
    Statement st = con.createStatement();
    int i = st.executeUpdate("insert into student values('"+name+"', '"+message+"', '"+country+"', '"+em+"')");
}
catch(Exception e)
        {
            out.println("Error is: "+e);
        }
%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
