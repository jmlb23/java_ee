<%@ page import="modelo.daos.*,modelo.obxetosBase.* " %>
<!DOCTYPE html>
<html>
	<head>
		<title>CRUD</title>
	</head>
	<body>
		
		<%
			for(Prestamo p : new PrestamoDao().selectAll()){
				out.println(p);
			}
		%>

	</body>
</html>
