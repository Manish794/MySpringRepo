<!DOCTYPE html>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC</title>
</head>
<body>
	<f:form action="verifyUser" method='post' modelAttribute="myUser">
		<table>
			<tr>
				<td colspan="3" align="center">Login Here</td>
			</tr>
			<tr>
				<td colspan="3" align="center"><f:errors /></td>
			</tr>
			<tr>
				<td>Username</td>
				<td><f:input path='username' /></td>
				<td><f:errors path='username' /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><f:input path='password' type='password' /></td>
				<td><f:errors path='password' /></td>
			</tr>
			<tr>
				<td colspan="3" align="center"><input type='submit'
					value='Login' /></td>
			</tr>
		</table>
	</f:form>
</body>
</html>
