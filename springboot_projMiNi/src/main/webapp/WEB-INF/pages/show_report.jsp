<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.List" %>
<%@ page import="com.example.demo.vo.ActorVO" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Report</title>
</head>
<body>

<%
List<ActorVO> listVO = (List<ActorVO>) request.getAttribute("listVO");

if(listVO != null && listVO.size() > 0) {
%>

<table border="1" bgcolor="orange" align="center">
    <tr>
        <th>actorID</th>
        <th>actorName</th>
        <th>actorAddr</th>
        <th>actorCategory</th>
        <th>actorFees</th>
        <th>operations</th>
    </tr>

<%
for(ActorVO vo : listVO){
%>
<tr>
    <td><%= vo.getActorID() %></td>
    <td><%= vo.getActorName() %></td>
    <td><%= vo.getActorAddr() %></td>
    <td><%= vo.getActorCategory() %></td>
    <td><%= vo.getActorFees() %></td>
    <td>
        <a href="edit?no=<%= vo.getActorID() %>">
            <img src="Images/edit.png" width="36">
        </a>
        &nbsp;&nbsp;
        <a href="remove?no=<%= vo.getActorID() %>"
           onclick="return confirm('Are you sure?')">
            <img src="Images/delete_16597070.png" width="30">
        </a>
    </td>
</tr>
<%
}
%>

</table>

<%
} else {
%>

<h3 style="text-align:center; color:red;">
    No Actor Records Found
</h3>

<%
}
%>

</body>
</html>