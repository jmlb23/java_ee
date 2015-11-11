package controllers;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;
import modelo.obxetosBase.*;
import modelo.daos.*;

@WebServlet("/editaLibro")
public class ControladorEditaLibro extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		LibroDao d = new LibroDao();
		d.updateOne(new Libro(Integer.parseInt(req.getParameter("txtId")),req.getParameter("txtIsbn"),req.getParameter("txtTitulo"),req.getParameter("txtAutores").split(","),Integer.parseInt(req.getParameter("txtAno"))));
		req.setAttribute("exito","true");
		req.getRequestDispatcher("editaLibro.jsp").forward(req,res);
		
	}

}


