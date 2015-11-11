<%@ page import="java.util.*, modelo.obxetosBase.*" %>
<!DOCTYPE html>
<html lang="es">
	<head>
		<title>index</title>
		<meta charset="UTF-8" />
		<link rel="stylesheet" type="text/css" href="estilos.css" />
	</head>
	<body>
		<div>
			<header>
				<h1>Elixe a accion a realizar<h1>
			</header>
			<nav>
				<ul>
					
					<li><a href="index.jsp">Inicio</a></li>
					<li><a href="xestionUsuarios">Xestion de Usuarios</a></li>
					<li><a href="xestionLibros">Xestion de Libros</a></li>
					<li><a href="xestionPrestamos">Xestion de Prestamos</a></li>
				</ul>
			</nav>
			<section>
				<table>
					
				<%
					String aux = null;
					int num = 0;
					Enumeration<String> e = request.getAttributeNames();
						while(e.hasMoreElements())
						{
							
						
							aux =e.nextElement();
							if(aux.contains("javax")) continue;
							if(request.getAttribute(aux) instanceof Libro){
								if(num <1 ) out.println("<button onClick='window.location=\"novoLibro.jsp\"'>novo</button>");
								out.println("<tr><td>"+request.getAttribute(aux)+"</td><td><button onClick='window.location=\"inicio.jsp?id=\"'>editar</button></td><td><button onClick='window.location=\"inicio.jsp?id=\"'>borrar</button></td></tr>");
							}else if(request.getAttribute(aux) instanceof Usuario){
								if(num <1 ) out.println("<button onClick='window.location=\"novoUsuario.jsp\"'>novo</button>");

								out.println("<tr><td>"+request.getAttribute(aux)+"</td><td><button onClick='window.location=\"inicio.jsp?id=\"'>editar</button></td><td><button onClick='window.location=\"inicio.jsp?id=\"'>borrar</button></td></tr>");
							}else if(request.getAttribute(aux) instanceof Prestamo){
								if(num <1 ) out.println("<button onClick='window.location=\"novoPrestamo.jsp\"'>novo</button>");

								out.println("<tr><td>"+request.getAttribute(aux)+"</td><td><button onClick='window.location=\"inicio.jsp?id=\"'>editar</button></td><td><button onClick='window.location=\"inicio.jsp?id=\"'>borrar</button></td></tr>");
							}
							num++;
						}
 
				%>
				</table>
			</section>
		</div>
	</body>
<html>
