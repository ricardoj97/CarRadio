package pt.iade.carradio.models.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private static final String URL = "jdbc:mysql://remotemysql.com:3306/rPHgdBiJQH?useSSL=false";
	private static final String PASS = "nR8UPayepw";
	private static final String USER = "rPHgdBiJQH";
	
	private static Connection connection = null;
	
	private DBConnector () {}
	
	public static Connection getConnection() {
		try {
			if (connection == null || connection.isClosed()) 
				connection = DriverManager.getConnection(URL,USER,PASS);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	   }

   }




