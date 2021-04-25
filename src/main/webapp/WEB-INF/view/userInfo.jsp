<%--
  Created by IntelliJ IDEA.
  User: 10782
  Date: 2021-04-18
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<h1>User Info</h1>
<%
    //read cookies
    Cookie [] allCookies =request.getCookies();
    for(Cookie c: allCookies){
        //get one by one
        out.println("<br/>"+c.getName()+" --- "+c.getValue());
    }
%>
<%
    User u =(User)session.getAttribute("user");
%>
<table>
    Username:<%=request.getAttribute("username")%>
    Password:<%=request.getAttribute("password")%>
    email:<%=request.getAttribute("email")%>
    Gender:<%=request.getAttribute("gender")%>
    Birth Date:<%=request.getAttribute("birthdate")%>
    </table>
<%@include file="footer.jsp"%>
