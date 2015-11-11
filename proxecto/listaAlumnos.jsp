<%@ page import="java.sql.*" %>
<%@ page import="operacions.*" %>
<!DOCTYPE html>
<html>
	<head>
		<title>listar usuarios</title>
		<meta charset="UTF-8" />
		<style>
			td{
				border: 1px solid black;
			}
			body{
				text-align: center;
			}
			table{
				margin-rigth: 25%;
				margin-left: 42.5%;
			}
		</style>
	</head>
	<body>
		<%!


		%>
		<h1>Listar</h1>
		<%
			OperacionsBD o = new OperacionsBD("com.mysql.jdbc.Driver","jdbc:mysql://localhost/test","jesus","abc123.");
			o.abrirConexion();
			System.out.println();
		%>
			<table style="border: 1px solid black">
		<%
			for(Alumno a : o.listaAlumnos()){
				out.println("<tr><td>"+a+"</td></tr>");	
			}
		%>
			</table>
	</body>
</html>
