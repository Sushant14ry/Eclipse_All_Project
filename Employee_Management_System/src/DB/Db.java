package DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class Db {
	public static Connection getDB() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/ems","root","");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
