<%@ page import="java.util.*" %>
<%
	Enumeration<String> s =request.getParameterNames();
	while(s.hasMoreElements()){
		out.println(request.getParameter(s.nextElement()));
	}
%>

