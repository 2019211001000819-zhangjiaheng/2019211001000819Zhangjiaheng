<%--
  Created by IntelliJ IDEA.
  User: 10782
  Date: 2021-03-14
  Time: 18:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New User registration</title>
</head>
<body>
<from method="post">
    name:<input type="text" name="name"><br/>
    password:<input type="text" name="password"><br/>
    Email:<input type="text" name="Email"><br/>
    <input type="submit" value="Send data to server"/>
    Gander:
    <input type="checkbox" name="interest" value="male">
    <input type="checkbox" name="interest" value="female">
   Data of birth(yyy-mm-dd):<input type="text" name="Data of birth(yyy-mm-dd)"><br/>
    <input type ="submit" value="Register">
</from>
</body>
</html>
