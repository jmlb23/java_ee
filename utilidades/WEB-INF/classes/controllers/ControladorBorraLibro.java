package controllers;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;
import modelo.obxetosBase.*;
import modelo.daos.*;

@WebServlet("/borraLibro")
public class ControladorBorraLibro extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		LibroDao d = new LibroDao();
		d.removeOne(Integer.parseInt(req.getParameter("id")));
		req.getRequestDispatcher("xestionLibros").forward(req,res);
		
	}

}


