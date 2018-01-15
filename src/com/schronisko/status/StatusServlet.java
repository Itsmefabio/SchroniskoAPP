package com.schronisko.status;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StatusServlet
 */
@WebServlet("/StatusServlet")
public class StatusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public StatusServlet() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
        	Class.forName("com.mysql.jdbc.Driver");
			Connection connection2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/schronisko","root","kolor1234");


		System.out.println("ok");
		
		
		    List<Zwierze> list=new ArrayList<Zwierze>();  
		    String stmt=("Select * from zwierzeta");
		    PreparedStatement pst3=connection2.prepareStatement(stmt);
		        ResultSet rs3=pst3.executeQuery();  
		        while(rs3.next()){  
		            Zwierze z=new Zwierze();  
		            z.setId(rs3.getInt("id"));  
		            z.setImie(rs3.getString("imie"));  
		            z.setPlec(rs3.getString("plec"));  
		            z.setWiek(rs3.getInt("wiek"));  
		            z.setWaga(rs3.getInt("waga"));  
		            z.setOpiekun(rs3.getString("opiekun"));  
		            list.add(z);  
		        } } 
		    catch(Exception e){System.out.println(e);} }}
		     