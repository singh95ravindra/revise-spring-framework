<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admission Success</title>
</head>
<body>
	<h2>Please fill in your details</h2>
	<form action="submit-admission-form2" method="POST">
		<label for="studentName">Student Name</label>
		<input type="text" name="studentName"/>
		<label for="standard">Standard</label>
		<input type="text" name="standard"/>
		<input type="submit" value="Submit">
	</form>
</body>
</html>