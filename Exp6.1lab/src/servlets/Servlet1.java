package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String value = request.getParameter("link1");
		
		if(value.equals("object")) {
			//out.println("addition operation by servlet 1");
			response.sendRedirect("https://www.javatpoint.com/object-and-class-in-java");
		}
		else if(value.equals("class")) {
			//response.sendRedirect("Servlet2");
			response.sendRedirect("https://www.tutorialspoint.com/java/java_object_classes.htm");
		}
		else if(value.equals("servlet")) {
			//response.sendRedirect("Servlet2");
			response.sendRedirect("https://www.geeksforgeeks.org/introduction-java-servlets/");
		}
		else if(value.equals("constructor")) {
			//response.sendRedirect("Servlet2");
			response.sendRedirect("https://www.javatpoint.com/java-constructor");
		}
		else if(value.equals("method")) {
			//response.sendRedirect("Servlet2");
			response.sendRedirect("https://www.tutorialspoint.com/java/java_methods.htm");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
