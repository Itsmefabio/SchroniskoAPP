package com.schronisko.login;

 
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.schronisko.status.DBConnectionManager;
 
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
 
 
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd;
	

        String username = request.getParameter("username");
        String password = request.getParameter("password");
       if(DBConnectionManager.LoginValidation(username, password)==true) {
       response.setContentType("text/html;charset=UTF-8");	
        	 HttpSession session=request.getSession();  
        session.setAttribute(username,username);  
       request.getRequestDispatcher("index.jsp").include(request, response); 
        }
         else {
        	 response.setContentType("text/html;charset=UTF-8");
        	 PrintWriter pw4= response.getWriter();
			pw4.println("b³êdne dane logowania.");				
			RequestDispatcher view = request.getRequestDispatcher("/login.jsp");      
			view.include(request, response);
		
			System.out.println("is not valid");} 
         }
	

	
	}