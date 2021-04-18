<%--
  Created by IntelliJ IDEA.
  User: 10782
  Date: 2021-04-18
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>

<h1>Login</h1>
<%
    if (!(request.setAttribute("message")==null)){
        out.println(request.setAttribute("message"));
    }
%>
<form method="post" action="/login">
    Username:<input type="text" name="username" ><br/>
    Password:<input type="password" name="password" ><br/>
    <input type="submit" value="Login"/>
</form>


<%@include file="footer.jsp"%>
