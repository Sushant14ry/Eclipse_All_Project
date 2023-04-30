package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Db {
	public static Connection getDb() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/library_ms","root","");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 

		}
		
		return null;
		
	}
}
