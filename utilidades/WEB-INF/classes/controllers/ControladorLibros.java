package controllers;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;
import modelo.daos.*;
import modelo.obxetosBase.*;

@WebServlet("/xestionLibros")
public class ControladorLibros extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		LibroDao d = new LibroDao();
		int n = 0;
		for(Libro l : d.selectAll()){
			req.setAttribute("user"+n, l.toString());
			n++;
		}

		req.getRequestDispatcher("inicio.jsp").forward(req,res);
	}


}


