package com.schronisko.add;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.schronisko.jpa.DBActions;
import com.schronisko.status.DBConnectionManager;


@WebServlet("/AddToDBServlet")
public class AddToDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public AddToDBServlet() {
        super();
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String imie = request.getParameter("imie");
	        String plec = request.getParameter("plec");
	         int wiek=Integer.valueOf(request.getParameter("wiek"));
	         int waga=Integer.valueOf(request.getParameter("wiek"));
	         String opiekun=request.getParameter("opiekun");
	         PrintWriter pw1 = null;
	         DBActions dbactionCountRows= new	DBActions();
	         dbactionCountRows.setup();
	         dbactionCountRows.numberOfRows();
	         dbactionCountRows.exit();
	         if(dbactionCountRows.numberOfRows()==20) {
	        	 pw1= response.getWriter();
	        	 response.setContentType("text/html;charset=UTF-8");
			pw1.println("Schronisko jest pe³ne, nie mo¿esz dodaæ.");
			RequestDispatcher view = request.getRequestDispatcher("/dodaj.jsp");      
	        view.include(request, response);}
			else {
				
				 DBActions dbactionAdd=new	DBActions();
				 
				 dbactionAdd.setup();
				 dbactionAdd.create(imie, plec, waga, wiek, opiekun);
				 dbactionAdd.exit();
				 pw1= response.getWriter();
				 response.setContentType("text/html;charset=UTF-8");
	pw1.println("wpis dodany do bazy");
				RequestDispatcher view = request.getRequestDispatcher("/dodaj.jsp");      
		        view.include(request, response); 

	}
	         }}
