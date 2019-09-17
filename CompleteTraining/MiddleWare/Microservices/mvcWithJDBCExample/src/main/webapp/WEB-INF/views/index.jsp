<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Spring MVC Configured Successfully</h1>
<h3> This example shows how datasource allows us to create multiple connections to same DB unlike java connections. We are using DB-> "TEST" and different connections to different tables iof this DB</h3>
<h4> This is one method of Querying the datasing using only Model</h4>
<a href=payments>Show Payment by Method 1</a>
<br><br>
<h4> This is one method of Querying the datasing using Model and View </h4>
<a href=allPayments>Show Payment by Method 2</a>
<br><br>

<h3> This is a different table in the same databse - "TEST"</h3>
<a href=sports>Show sport items </a>

</body>
</html>