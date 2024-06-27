package com.app.demo5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample1 {
	public static void main(String args[]) throws SQLException, ClassNotFoundException {
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/dummy";
		String username = "root";
		String password = "Tset@5555";
		String query = "INSERT INTO students VALUES (101,'sahu','shasta','1o3 opp lokseav ','Amdjbka')";
//Load driver class
		Class.forName(driverClassName);
// obtain a connection
		Connection con = DriverManager.getConnection(url, username, password);
// Obtain a Statement
		Statement st = con.createStatement();
//Execute the Query
		int count = st.executeUpdate(query);
		System.out.println("Number of rows effected by this query = " + count); 
		
		// closing the connection as our
																				
		// requirement with connection is
//completed
		con.close();
	}
}
