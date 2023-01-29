<%-- 
    Document   : arithmeticcalculator
    Created on : 24-Jan-2023, 6:42:36 PM
    Author     : nuket
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="number" name="first" value="${first}"><br>
            Second: <input type="number" name="second" value="${second}"><br>
            <input type="submit" value="+" name="arth">
            <input type="submit" value="-" name="arth">
            <input type="submit" value="*" name="arth">
            <input type="submit" value="%" name="arth"><br>
            <br>
            Result: ${result}
        </form>
        <a href="age">Age Calculator</a>
    </body>
</html>
