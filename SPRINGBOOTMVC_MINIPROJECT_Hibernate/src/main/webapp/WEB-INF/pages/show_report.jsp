<%@ page import="java.util.*" %>
<%@ page import="com.itp.vo.ActorVo" %>

<h1 style="color:red;text-align:center">Report Page</h1>

<%
    List<ActorVo> listVo = (List<ActorVo>) request.getAttribute("listVo");

    if (listVo != null && listVo.size() > 0) {
%>

<table border="1" bgcolor="yellow" align="center">
    <tr bgcolor="cyan">
        <th>aid</th>
        <th>aname</th>
        <th>addrs</th>
        <th>category</th>
        <th>fee</th>
        <th>operations</th>
    </tr>

<%
    for (ActorVo vo : listVo) {
%>

    <tr>
        <td><%= vo.getAid() %></td>
        <td><%= vo.getAname() %></td>
        <td><%= vo.getAddrs() %></td>
        <td><%= vo.getCat() %></td>
        <td><%= vo.getFees() %></td>
        <td>
            <a href="edit?no=<%= vo.getAid() %>">
                <img src="Images/edit.jpg" width="30" height="30">
            </a>
            &nbsp;&nbsp;&nbsp;
            <a href="remove?no=<%= vo.getAid() %>" 
               onclick="return confirm('Are you sure?')">
                <img src="Images/delete.jpg" width="30" height="30">
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

<h1 style="color:red;text-align:center">Records not found</h1>

<%
    }
%>

<h1 style="text-align:center">
    <a href="register">
        <img src="Images/add.jpg" width="60" height="60"> Add Actor
    </a>
</h1>
<br></br>
<h1 style="text-align:center">
    <a href="./">
        <img src="Images/home.jpg">
    </a>
</h1>
<%
    String msg = (String) request.getAttribute("resultMsg");
    if (msg != null) {
%>
    <h3 style="color:green;text-align:center"><%= msg %></h3>
<%
    }
%>