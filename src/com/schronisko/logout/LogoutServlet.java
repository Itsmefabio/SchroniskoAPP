package com.schronisko.logout;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public LogoutServlet() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("b3") != null) {
			response.setContentType("text/html;charset=UTF-8");	
       	  PrintWriter out=response.getWriter();  
       	HttpSession session=request.getSession();  
            session.invalidate(); 
            out.println("wylogowano");
            RequestDispatcher view = request.getRequestDispatcher("/login.jsp");      
		        view.include(request, response);
            
		}
       
	}

}
