package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class db {
	public static Connection getdb() {
		
		try {
				   Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel","root","");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;	
	}
}
