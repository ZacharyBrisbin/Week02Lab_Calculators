<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            First:<input type="number" name="first_num" value="${firstnum}"><br>
            Second:<input type="number" name="second_num" value="${secondnum}"><br>
            <input type="submit" name="arithmetic" value="+">
            <input type="submit" name="arithmetic" value="-">
            <input type="submit" name="arithmetic" value="*">
            <input type="submit" name="arithmetic" value="%">
        </form>
            
        <p>Result:${result}</p>
        <a href = "/Week2Lab_Calculators/age">Age Calculator</a>
    </body>
</html>
