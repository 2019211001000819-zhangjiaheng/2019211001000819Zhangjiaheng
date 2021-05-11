<%@page import="com.zhangjiaheng.model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<%
    User user = (User)session.getAttribute("user");
%>
<h1>User Info</h1>

<table border="1">
    <tr>
        <th>Username</th>
        <th>Password</th>
        <th>Email</th>
        <th>Gender</th>
        <th>Birth Date</th>
    </tr>
    <tr>
        <td><%=user.getUsername()%></td>
        <td><%=user.getPassword()%></td>
        <td><%=user.getEmail()%></td>
        <td><%=user.getGender()%></td>
        <td><%=user.getBirthday()%></td>
    </tr>

</table>
<a href="updateUser">Update User</a>
<%@include file="footer.jsp"%>
