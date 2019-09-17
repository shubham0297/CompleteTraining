<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Succesfull</title>
</head>
<body>
<h1>User Registration Successfully</h1>
<form:form action="login" method="post" >

<label>UserName</label>
<form:input path="userName"/>
<form:errors path="userName"></form:errors>
<br><br>

<label>Password</label>
<form:input type="password" path="password"/>
<br><br>
<input type="submit" value="Submit">
</form:form>
</body>
</html>