<%-- 
    Document   : agecalculator
    Created on : 24-Jan-2023, 6:20:54 PM
    Author     : Juniper Grunow
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age" value="${age}">
            Enter Your Age: <input type="number" name="age"><br>
            <input type="submit" value="Age next birthday">
        </form>
        <p>${message}</p>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
