package controllers;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;
import modelo.obxetosBase.*;
import modelo.daos.*;

@WebServlet("/creaUsuario")
public class ControladorCreaUsuario extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		UsuarioDao d = new UsuarioDao();
		d.createOne(new Usuario(req.getParameter("txtDni"),req.getParameter("txtNome"),req.getParameter("txtCorreo")));
		req.setAttribute("exito","true");
		req.getRequestDispatcher("novoUsuario.jsp").forward(req,res);
		
	}

}


