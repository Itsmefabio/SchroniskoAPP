package com.schronisko.status;

import java.sql.Connection;
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
return count; }
public static void remove(int id) {

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
} catch (ClassNotFoundException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}}

	



public static boolean LoginValidation(String user, String pass) {
boolean test = false;
	try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/schronisko","root","kolor1234");


System.out.println("ok");
String stmt=("select count(*)as valid from users where user=? and password=? ");
PreparedStatement pst=connection.prepareStatement(stmt);
pst.setString(1,user);
pst.setString(2,pass);
ResultSet rs1=pst.executeQuery();
rs1.next();
if( rs1.getInt("valid")==1) {
	pst.close();
	test=true;
}
else {
	
	test=false;

}
pst.close();
connection.close();
}
catch (ClassNotFoundException e) {

	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
return test;
}}