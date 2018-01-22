package com.schronisko.status;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import com.schronisko.jpa.DBActions;

public class DBConnectionManager {

public static List<Zwierze> wypisz() {

		DBActions statusdisp= new DBActions();
		statusdisp.setup();
		return statusdisp.wypisz2();
	}

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