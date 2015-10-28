package controllers;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/xestionUsuarios")
public class ControladorUsuarios extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		req.setAttribute("proba","<ul><li><a href=\"?h=seleciona_un\">Inicio</a></li><li><a href=\"\">Xestion de Usuarios</a></li><li><a href=\"xestionLibros\">Xestion de Libros</a></li><li><a href=\"xestionPrestamos\">Xestion de Prestamos</a></li></ul>");
		switch(req.getParameter("h")){
			case "seleciona_un":
				req.setAttribute("un", "un");
			break;

		}
		req.getRequestDispatcher("index.jsp").forward(req,res);
		
	}

}


