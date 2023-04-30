package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conect {
	public static Connection getdbconect() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		return	DriverManager.getConnection("jdbc:mysql://localhost:3306/swinghome","root","");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;	
	}
}
