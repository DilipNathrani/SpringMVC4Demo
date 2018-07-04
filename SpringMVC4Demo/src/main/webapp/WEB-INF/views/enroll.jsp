<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
	<form:form method="post" modelAttribute="student">


		<table>
			<tr>
				<td><label>Name</label></td>
				<td><form:input path="firstName" type="text"
						placeholder="Firstname" /></td>
				<td><form:input path="LastName" placeholder="Lastname"
						type="text" />
						<form:errors path="firstName"></form:errors>
						</td>
			</tr>
			<tr>
				<td><label>Sex</label>
				<td><form:radiobutton path="sex" value="m" />Male <form:radiobutton
						path="sex" value="f" />Female
			</tr>
			<tr>
				<td><label>Email</label></td>
				<td><form:input path="email" type="text" placeholder="Email" /></td>
			</tr>
			<tr>
				<td><label>Country</label></td>
				<td><form:select path="country">
						<form:option value="">Select Country</form:option>
						<form:options items="${countries}" />
					</form:select></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register" /></td>
			</tr>
		</table>





	</form:form>
</body>
</html>