package com.proba;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@WebServlet("/hello")
public class ExampleServlet extends GenericServlet {

  public void service(ServletRequest req, ServletResponse res)
    throws IOException, ServletException
  {
    res.getWriter().println("Hello World!");
  }
}
