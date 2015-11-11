<%@ page import="java.util.*" %>
<%! 
 int v = 2;
%>

<%= v %>
<%//esto vai dentro do metodo service do httpservlet
	Enumeration<String> s =request.getParameterNames();
%>
		<h1>datos recividos</h1>
	<table style="border:1px solid black">
<%	
	while(s.hasMoreElements()){
		out.println("<tr><td style='border: 1px solid black'>"+request.getParameter(s.nextElement())+"</td></tr>");
	}


%>
	</table>

