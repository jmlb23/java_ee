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
				margin-left: 25%;
			}
		</style>
	</head>
	<body>
		<%!


		%>
		<h1>Listar</h1>
		<%
			try(
			Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost/test","jesus","abc123.");
			Statement st = cnn.createStatement();
			ResultSet rs = st.executeQuery("select * from alumno");){

	
				out.println("<table style=\"border: 1px solid black\">");
	
			
				while(rs.next()){
					out.println("<tr><td>"+rs.getString("DNI")+"</td>");
					out.println("<td>"+rs.getString("nome")+"</td>");
					out.println("<td>"+rs.getString("apelidos")+"</td>");
					out.println("<td>"+rs.getInt("idade")+"</td></tr>");
				}
				out.println("</table>");
			}catch(SQLException e){
				e.printStackTrace();
			}
		%>
	</body>
</html>
