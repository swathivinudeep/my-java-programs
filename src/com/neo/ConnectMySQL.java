package com.neo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectMySQL {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		
		//TO CONNECT TO DATABASE IN COMMAND PROMPT mysql -u root -p
		//AFTER THAT ENTER PASSWORD vinu123
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium","root","vinu123");
		System.out.println("Connection established");
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery("select * from seleniumusers");
		while(rs.next())
		{
			String firstname = rs.getString("firstname");
			System.out.println(firstname);
			
		}
		con.close();
	}

}
