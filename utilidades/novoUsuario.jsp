<!DOCTYPE html>
<html>
	<link rel="stylesheet" type="text/css" href="estilos.css"/>
<head>

</head>
	<body>
		<form action="creaUsuario" method="post">
			DNI: <input pattern="[0-9]{8}[a-zA-Z]" type="text" name="txtDni">
			nome: <input type="text" name="txtNome" required />
			correo: <input type="text" name="txtCorreo" required />
			<input type="submit" value="enviar"/>
		</form> 
	</body>
</html>
