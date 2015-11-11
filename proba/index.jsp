<%@ page import="java.util.*" %> <!-- podemos poñer unha directiva por cada import ou nunha separar todo por comas-->
<jsp:directive.page import="java.util.ArrayList" /> <!-- temos formato xml ou etiqueta jsp -->

<!DOCTYPE hmtl>
<html>

	<head>
		<title>primeiro jsp</title>
		<meta charset="utf-8" />
	</head>

	<body>
	<h1>podemos meter codigo html e jsp</h1>
		<!-- so no tag inicial o tipo -->
		
		<%! //esto é unha etiquete de declaracion
			int v = 55;
		%>

		<jsp:declaration>
			int h = 55;
		</jsp:declaration>
		
		<% //esto é un scriptlet
			//como en php os \n cosideraos espazos
			out.println("hola mundo "+v+"<br />");
			
		%>
		<jsp:scriptlet>
			//esto é equivalente coas tags xml a un scriptlet
			out.println("proba escriplet xml "+h);
		</jsp:scriptlet>

		<!-- temos as expresions que son como as echo tags de php -->
		<!-- cada unha destas expresions é como un println() -->
		<!-- non poñer nada pegado o tag porque como en php pode petar -->
		<%=  "<br/>todo o que este dentro &eacute; impreso <br/>"+v %>
		
		<jsp:expression> 
			"hola dende un jsp:expresion"
		</jsp:expression>


		<!-- temos que diferenciar ben dos comentarios de html -->
		<%--
			 dos comentarios dos jsp
			 uns ignoraos tomcat como se foran comentarios en codigo java
			 e outros ignoraos o navegador 

		--%>

		<%-- 

			temos as directivas de jsp 

			<%@ page %> define os atributos dependentes da paxina
			<%@ include %> inclue un arquivo durante a fase de traducion
			<%@ taglib %> declara unha libreria
		--%>

		<%--

			//obxetos!!!!! declarados implicitamente nos jsp's

			//request, response, out, session, application, config, pageContext, page, Exception

			//request do tipo HttpServletRequest 
			//response do tipo HttpServletResponse 
			//out do tipo PrintWriter
			//session do tipo HttpSession
			//application do tipo ServletContext
			//config do tipo ServletConfig
			//pageContext encapsula cousas da paxina
			//page que o coma un this
			

		--%>

		<%-- podemos intercalar codigo jsp con html --%>

		

		<%

			if(v==55){
		%>

				<p>&eacute; 55</p>

		<%
			}else{
				//como en php podemos facer que amose o html en funcion das estrucuturas de control
		%>

				<p>non é 55</p>

		<%
			}
			int h = 0;
		%>


		<table style="border:1px solid black">
			<% for(int i = 0; i<5; i++){ 
			%>
				<tr>

				<% for(int j = 0; j<5; j++){ 
					
				h++;
				%>
					
					<td style="border:1px solid black"><%= h %></td>
				<% } %>
				</tr>

			<% } %>
		</table>
	</body>

</html>
