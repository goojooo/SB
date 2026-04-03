<%@ page isELIgnored="false" %>

<h1 style="color:red;text-align:center">Edit Actor Page</h1>

<form action="edit" method="post">

<table border="1" bgcolor="cyan" align="center">

    <tr>
        <td>Actor ID:</td>
        <td>
            <input type="text" name="aid" value="${actor.aid}" readonly/>
        </td>
    </tr>

    <tr>
        <td>Actor Name:</td>
        <td>
            <input type="text" name="aname" value="${actor.aname}"/>
        </td>
    </tr>

    <tr>
        <td>Actor Address:</td>
        <td>
            <input type="text" name="addrs" value="${actor.addrs}"/>
        </td>
    </tr>

    <tr>
        <td>Category:</td>
        <td>
            <select name="cat">
                <option value="hero" ${actor.cat=='hero'?'selected':''}>Hero</option>
                <option value="heroine" ${actor.cat=='heroine'?'selected':''}>Heroine</option>
                <option value="comedian" ${actor.cat=='comedian'?'selected':''}>Comedian</option>
                <option value="villain" ${actor.cat=='villain'?'selected':''}>Villain</option>
            </select>
        </td>
    </tr>

    <tr>
        <td>Fees:</td>
        <td>
            <input type="text" name="fees" value="${actor.fees}"/>
        </td>
    </tr>

    <tr>
        <td colspan="2" align="center">
            <input type="submit" value="Update"/>
            <input type="reset" value="Cancel"/>
        </td>
    </tr>

</table>

</form>

<br><br>

<center>
    <a href="report">
        <img src="Images/home.jpg" width="50" height="50"/>
    </a>
</center>