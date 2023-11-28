package persistencia;

import java.sql.*;

public class Conn {
	Connection c;
	Statement s;
	
	public Conn () {
		try {
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Dianome", "postgres", "6490");
			s = c.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		
		}
	}
}
