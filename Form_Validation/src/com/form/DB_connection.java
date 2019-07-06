package com.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class DB_connection {
	
	private static Connection connection;
	
	static {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle","swagata","password");
			
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	
}

	public static Connection myConnection() {
		
		return connection;
	}
}
