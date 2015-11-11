package controllers;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;
import modelo.daos.*;
import modelo.obxetosBase.*;


@WebServlet("/xestionPrestamos")
public class ControladorPrestamos extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		PrestamoDao d = new PrestamoDao();
		int n = 0;
		for(Prestamo l : d.selectAll()){
		req.setAttribute("user"+n, l);
		n++;
		}
 
		 req.getRequestDispatcher("inicio.jsp").forward(req,res);

	}

}


