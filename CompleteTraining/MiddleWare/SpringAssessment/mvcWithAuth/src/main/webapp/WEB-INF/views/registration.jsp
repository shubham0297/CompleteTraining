<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Portal</title>
</head>
<body>
<form:form action="registerUser" method="post">

<label>UserName</label>
<form:input path="userName"/>
<br><br>
<label>Password</label>
<form:input type="password" path="password"/>
<br><br>
<label>Email</label>
<form:input type="email" path="email"/>
<br><br>
<input type="submit" value="Add">

</form:form>
</body>
</html>
