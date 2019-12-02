package pt.iade.carradio.models.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private static final String URL = "jdbc:mysql://localhost/carradio";
	private static final String PASS = "Ric14rod8_";
	private static final String USER = "root";
	
	private static Connection connection = null;
	
	private DBConnector () {}
	
	public static Connection getConnection() {
		try {
			if (connection == null || connection.isClosed()) 
				return DriverManager.getConnection(URL,USER,PASS);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	   }

   }




