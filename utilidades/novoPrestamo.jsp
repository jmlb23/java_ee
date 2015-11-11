<!DOCTYPE html>
<html>
	<link rel="stylesheet" type="text/css" href="estilos.css"/>
<head>

</head>
	<body>
		<h1>crea usuario</h1>
		<form action="creaUsuario" method="get">
			DNI: <input pattern="[0-9]{8}[a-zA-Z]" type="text" name="txtDni">
			nome: <input type="text" name="txtNome" required />
			correo: <input type="text" name="txtCorreo" required />
			<input type="submit" value="enviar"/>
		</form> 
		<%
			if(request.getAttribute("exito")!=null && request.getAttribute("exito").equals("true")){
				out.println("<h1>exito creando o usuario<h1>");
			}
		%>
	</body>
</html>
