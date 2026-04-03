<%@ page isELIgnored="false" %>

<h1 style="color":red;text-align :center">Actor Registration Page</h1>
<form action="register" method="post">
   <table  border="1" bgcolor="cyan" align="center">
    <tr>
    <td>Actor Name:</td>
    <td><input type="text" name="aname"/></td>
    </tr>
    
     <tr>
            <td>Actor Address:</td>
            <td><input type="text" name="addrs"/></td>
        </tr>
     <tr>
            <td>Category:</td>
            <td>
                <select name="cat">
                    <option value="hero">Hero</option>
                    <option value="heroine">Heroine</option>
                    <option value="comedian">Comedian</option>
                    <option value="villain">Villain</option>
                </select>
            </td>
        </tr>
   <tr>
            <td>Fees:</td>
            <td><input type="text" name="fees"/></td>
        </tr>

        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="Register"/>
                <input type="reset" value="Cancel"/>
            </td>
        </tr>

    </table>

</form>

<br><br>

<center>
    <a href="./">
        <img src="Images/home.jpg" width="50" height="50"/>
    </a>
</center>