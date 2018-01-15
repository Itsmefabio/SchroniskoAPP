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

import com.schronisko.status.DBConnectionManager;
import com.schronisko.status.Zwierze;


@WebServlet("/RemoveFromDBServlet")
public class RemoveFromDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        int id=Integer.valueOf(request.getParameter("id"));
         ;
        try {
        	Class.forName("com.mysql.jdbc.Driver");
			Connection connection2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/schronisko","root","kolor1234");


		System.out.println("ok");
		String stmt=("delete from zwierzeta where id=? ");
		PreparedStatement pst4=connection2.prepareStatement(stmt);
		pst4.setInt(1,id);
		pst4.executeUpdate();
		pst4.close();
		connection2.close();
	
		System.out.println("wpis usuniety z bazy");
		PrintWriter pw2= response.getWriter();
			pw2.println("wpis usuniety z bazy.");
			RequestDispatcher view = request.getRequestDispatcher("/usun.jsp");      
	        view.include(request, response);
		
        } catch (ClassNotFoundException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}


	}


