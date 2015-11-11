<!DOCTYPE html>
<html>
	<link rel="stylesheet" type="text/css" href="estilos.css"/>
<head>

</head>
	<body>
		<h1>
                 crea Libro</h1>

		<form action="creaLibro" method="get">
			ISBN: <input pattern="[0-9]{8}[a-zA-Z]" type="text" name="txtIsbn" required>
			titulo: <input type="text" name="txtTitulo" required />
			autores: <input type="text" name="txtAutores" required />
			ano: <input type="number" name="txtAno" required />
			<input style="display:inline" type="submit" value="enviar"/>
			<button style="margin-top: 2%; dispaly:inline" onClick="window.location='inicio.jsp'">home</button>

		</form> 
		<%
			if(request.getAttribute("exito")!=null && request.getAttribute("exito").equals("true")){
				out.println("<h1>exito creando o libro<h1>");
			}
		%>
		
		</body>
</html>
