package com.app.demo5;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Preparedstatement {
	
	public static void main(String args[]) throws SQLException, ClassNotFoundException {
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/dummy";
		String username = "root";
		String password = "Tset@5555";
		String query = "INSERT INTO students VALUES (?,?,?,?,?)";
//Load driver class
		Class.forName(driverClassName);
// obtain a connection
		Connection con = DriverManager.getConnection(url, username, password);
// Obtain a Statement
		CallableStatement cs = con.prepareCall("{call createAccount(?,?,?,?,?,?)}");
//Execute the Query
		cs.setInt(1,203);
		cs.setInt(2,9);
		cs.setString(3,"rrrt");
		cs.setString(4,"iyysy");
		cs.setString(5,"pooa kks a ");
		cs.setString(6,"pooa kks a ");
		 cs.execute();
		
		//cs.executeUpdate();
		
		cs.setInt(1,203);
		cs.setInt(2,9);
		cs.setString(3,"rrrt");
		cs.setString(4,"iyysy");
		cs.setString(5,"pooa kks a ");
		cs.setString(6,"pooa kks a ");
		 cs.execute();
		
	//	cs.executeUpdate();
		
		cs.setInt(1,203);
		cs.setInt(2,9);
		cs.setString(3,"rrrt");
		cs.setString(4,"iyysy");
		cs.setString(5,"pooa kks a ");
		cs.setString(6,"pooa kks a ");
		 cs.execute();
		//cs.executeUpdate();
		
		cs.setInt(1,203);
		cs.setInt(2,9);
		cs.setString(3,"rrrt");
		cs.setString(4,"iyysy");
		cs.setString(5,"pooa kks a ");
		cs.setString(6,"pooa kks a ");
		
	  cs.execute();
				
	  System.out.println("Accounts created !!!1 "); 
		
		// closing the connection as our
																				
		// requirement with connection is
//completed
		con.close();
	}

}
