

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="post">
            Enter your age:<input type="number" name="age" value=""><br>
            <input type="submit" value="Age next birthday">
            <p>${allAge}</p>
            <p>${error}</p>
            <a href = "/WEB-INF/arithmeticcalculator.jsp">Arithmetic Calculator</a>
        </form>
    </body>
</html>
