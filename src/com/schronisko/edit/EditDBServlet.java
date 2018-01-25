 package com.schronisko.edit;
 import java.io.IOException;
import java.io.PrintWriter;
 import javax.servlet.RequestDispatcher;
 import javax.servlet.ServletException;
 import javax.servlet.annotation.WebServlet;
 import javax.servlet.http.HttpServlet;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;

 import com.schronisko.jpa.DBActions;



 @WebServlet("/EditDBServlet")
 public class EditDBServlet extends HttpServlet {
 	private static final long serialVersionUID = 1L;
        
   
     public EditDBServlet() {
         super();
      
     }

 	
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 	
 	}


 	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		 String imie = request.getParameter("imie");
 		int id=Integer.valueOf(request.getParameter("id"));
 	        String plec = request.getParameter("plec");
 	         int wiek=Integer.valueOf(request.getParameter("wiek"));
 	         int waga=Integer.valueOf(request.getParameter("wiek"));
 	         String opiekun=request.getParameter("opiekun");
 	         PrintWriter pw1 = null;
 	     
 				 DBActions dbactionupdt=new	DBActions();
 				 
 				 dbactionupdt.setup();
 				 dbactionupdt.update(id,imie, plec, waga, wiek, opiekun);
 				 dbactionupdt.exit();
 				 pw1= response.getWriter();
 				 response.setContentType("text/html;charset=UTF-8");
 	pw1.println("wpis zmieniony");
 				RequestDispatcher view = request.getRequestDispatcher("/edycja.jsp");      
 		        view.include(request, response); 

 	}
 	         }
