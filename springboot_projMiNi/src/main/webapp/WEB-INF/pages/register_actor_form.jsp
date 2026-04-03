<%@ page isELIgnored="false"%>

<html>
<head>
<title>Actor Registration</title>
</head>
<body>

	<h1 style="color: red; text-align: center;">Actor Registration
		Page</h1>

	<form action="register" method="post">
		<table border="1" bgcolor="cyan" align="center" cellpadding="10">

			<tr>
				<td>Actor Name:</td>
				<td><input type="text" name="aname" /></td>
			</tr>

			<tr>
				<td>Actor Address:</td>
				<td><input type="text" name="addrs" /></td>
			</tr>

			<tr>
				<td>Actor Category:</td>
				<td><input type="number" name="acategory" /></td>
			</tr>

			<tr>
				<td>Actor Fees:</td>
				<td><input type="number" name="afees" /></td>
			</tr>

			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Register" /> <input type="reset" value="Reset" /></td>
			</tr>
		</table>
	</form>

</body>
</html>