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
								out.println("<tr><td>"+request.getAttribute(aux)+"</td><td><button onClick='window.location=\"borraLibro?id="+((Libro)request.getAttribute(aux)).getId()+"\"'>borrar</button></td><td><button onClick='window.location=\"editaLibro.jsp?id="+((Libro)request.getAttribute(aux)).getId()+"\"'>editar</button></td></tr>");
							}else if(request.getAttribute(aux) instanceof Usuario){
								if(num <1 ) out.println("<button onClick='window.location=\"novoUsuario.jsp\"'>novo</button>");
								out.println("<tr><td>"+request.getAttribute(aux)+"</td><td><button onClick='window.location=\"borraUsuario?id="+((Usuario)request.getAttribute(aux)).getId()+"\"'>borrar</button></td><td><button onClick='window.location=\"editaUsuario.jsp?id="+((Usuario)request.getAttribute(aux)).getId()+"\"'>editar</button></td></tr>");

							}else if(request.getAttribute(aux) instanceof Prestamo){
								if(num <1 ) out.println("<button onClick='window.location=\"novoPrestamo.jsp\"'>novo</button>");

								out.println("<tr><td>"+request.getAttribute(aux)+"</td><td><button onClick='window.location=\"borraPrestamo?id="+((Prestamo)request.getAttribute(aux)).getIdPrestamo()+"\"'>borrar</button></td></tr>");
							}
							num++;
						}
 
				%>
				</table>
			</section>
		</div>
	</body>
<html>
