<%-- 
    Document   : helloWorldForm
    Created on : Jan 25, 2021, 3:06:10 PM
    Author     : 828200
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form method="post" action="hello">
            first Name: <input type="text" name="firstName" value="${firstName}">
            last Name: <input type="text" name="lastName" value="${lastName}">
            <input type="submit" value="submit">
        </form>
    </body>
</html>
