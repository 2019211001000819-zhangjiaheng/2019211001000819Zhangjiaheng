<%--
  Created by IntelliJ IDEA.
  User: 10782
  Date: 2021-04-11
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
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

