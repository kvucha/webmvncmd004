<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Add Servlets!" %>
</h1>
<br/>
<form action="hello-servlet" method="get">
    Enter 1st Number : <input type="text" name="num1"><br>
    Enter 2nd Number : <input type="text" name="num2"><br>
    <input type="submit" value="addNumbers">
</form>

</body>
</html>