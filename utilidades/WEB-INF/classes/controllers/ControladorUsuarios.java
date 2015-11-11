package controllers;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;
import modelo.obxetosBase.*;
import modelo.daos.*;

@WebServlet("/xestionUsuarios")
public class ControladorUsuarios extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		UsuarioDao d = new UsuarioDao();
		int n = 0;
		for(Usuario u : d.selectAll()){
			req.setAttribute("user"+n, u.toString());
			n++;
		}
  
                 req.getRequestDispatcher("inicio.jsp").forward(req,res);	
		
	}

}


