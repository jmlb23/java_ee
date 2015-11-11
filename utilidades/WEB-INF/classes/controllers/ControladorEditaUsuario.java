package controllers;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;
import modelo.obxetosBase.*;
import modelo.daos.*;

@WebServlet("/editaUsuario")
public class ControladorEditaUsuario extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		UsuarioDao d = new UsuarioDao();
		d.updateOne(new Usuario(Integer.parseInt(req.getParameter("txtId")),req.getParameter("txtDni"),req.getParameter("txtNome"),req.getParameter("txtCorreo")));
		req.setAttribute("exito","true");
		req.getRequestDispatcher("editaUsuario.jsp").forward(req,res);
		
	}

}

