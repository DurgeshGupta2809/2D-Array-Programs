package TwoDarray;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConnectionPool {

	private static String url="jdbc:postgresql://localhost:5432/student";
	private static String user="postgres";
	private static String password="root";
	private static String driver="org.postgresql.Driver";
	
	private static ArrayList<Connection> conPool=new ArrayList<Connection>();
	
	private static final int poolsize=5;
	
	static {
		
		try {
			Class.forName(driver);
			
			Connection con=null;
			
			for(int i=1; i<=poolsize; i++) {
				con=DriverManager.getConnection(url,user,password);
				conPool.add(con);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		Public static Connection getConnection() {
			
			if(!C)
		}
	}
	
}
