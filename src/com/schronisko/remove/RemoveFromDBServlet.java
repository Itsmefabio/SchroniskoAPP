package com.schronisko.remove;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.schronisko.jpa.DBActions;
import com.schronisko.status.DBConnectionManager;
import com.schronisko.status.Zwierze;


@WebServlet("/RemoveFromDBServlet")
public class RemoveFromDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        int id2=Integer.valueOf(request.getParameter("id"));
         
       DBActions dbActionRemove= new DBActions();
       dbActionRemove.setup();
       dbActionRemove.delete(id2);
       dbActionRemove.exit();
        System.out.println("wpis usuniety z bazy");
        response.setContentType("text/html;charset=UTF-8");	
		PrintWriter pw2= response.getWriter();
			pw2.println("wpis usuniêty z bazy.");
			RequestDispatcher view = request.getRequestDispatcher("/usun.jsp");      
      view.include(request, response);
		

}


	}


