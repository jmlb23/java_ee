package exemplo;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Proba extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
		PrintWriter out = response.getWriter();
		out.println("sfsdfsfsdfdfsdfsdf");
	}

	
}
