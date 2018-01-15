package com.schronisko.status;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBConnectionManager {

	public static List<Zwierze> wypisz() {
		List<Zwierze> list=new ArrayList<Zwierze>();
	try {
    	Class.forName("com.mysql.jdbc.Driver");
		Connection connection2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/schronisko","root","kolor1234");


	System.out.println("ok");
	
	
	      
	    String stmt=("Select * from zwierzeta");
	    PreparedStatement pst2=connection2.prepareStatement(stmt);
	        ResultSet rs=pst2.executeQuery();  
	        while(rs.next()){  
	            Zwierze z=new Zwierze();  
	            z.setId(rs.getInt("id"));  
	            z.setImie(rs.getString("imie"));  
	            z.setPlec(rs.getString("plec"));  
	            z.setWiek(rs.getInt("wiek"));  
	            z.setWaga(rs.getInt("waga"));  
	            z.setOpiekun(rs.getString("opiekun"));  
	            list.add(z);  
	        } 
	    
	}catch(Exception e){System.out.println(e);}
	return list; }
public static int countRows() {
	int count=0;
try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection connection2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/schronisko","root","kolor1234");


System.out.println("ok");


    
    String stmt=("Select * from zwierzeta");
    PreparedStatement pst5=connection2.prepareStatement(stmt);
        ResultSet rs5=pst5.executeQuery();  
        while(rs5.next()){  
         count++;
        } 
    
}catch(Exception e){System.out.println(e);}
return count; }}
