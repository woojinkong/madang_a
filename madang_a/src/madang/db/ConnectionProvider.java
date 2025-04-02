package madang.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {


		public static String drive = "oracle.jdbc.driver.OracleDriver";
		public static String url = "jdbc:oracle:thin:@localhost:XE";
		public static String user = "c##madang";
		public static String pw = "madang";
		
		public static Connection getConnection() {
			
			Connection conn = null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn =  DriverManager.getConnection("jdbc:oracle:thin:@172.30.1.80:1521:XE","c##madang","madang");
			} catch (Exception e) {
				System.out.println("예외발생 : " + e.getMessage());
			}
			
			return conn;
			
		}
	
}
