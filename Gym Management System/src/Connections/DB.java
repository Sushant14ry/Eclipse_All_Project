package Connections;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	public static Connection getDB() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return	DriverManager.getConnection("jdbc:mysql://localhost:3306/gms","root","");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
