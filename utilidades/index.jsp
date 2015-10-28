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
				<%
					out.println(request.getAttribute("proba"));
					if(request.getAttribute("un")!=null)
					switch(request.getAttribute("un").toString()){

						case "un":
							out.println("un");
						break;
					}
				%>
			</section>
		</div>
	</body>
<html>
