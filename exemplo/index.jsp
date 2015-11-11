<!DOCTYPE html>
<%@ page import="java.sql.*" %>
<html>
	<head>
		<title>lista</title>
		<meta charset="UTF-8"/>
	</head>

	<body>

		<%
	
			Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost/test","jesus","abc123.");
		%>
		<%=	cnn.getMetaData().getDriverVersion() %>

	</body>
<html>
