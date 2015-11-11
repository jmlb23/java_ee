package controllers;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;
import modelo.obxetosBase.*;
import modelo.daos.*;

@WebServlet("/borraUsuario")
public class ControladorBorraUsuario extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		UsuarioDao d = new UsuarioDao();
		d.removeOne(Integer.parseInt(req.getParameter("id")));
		req.getRequestDispatcher("xestionUsuarios").forward(req,res);
		
	}

}


