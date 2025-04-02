package madang.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionProvider {

	
	//고객명을 입력받아 고객이 구매한 도서목록을 출력하라.
	
		public static String drive = "oracle.jdbc.driver.OracleDriver";
		public static String url = "jdbc:oracle:thin:@localhost:XE";
		public static String user = "c##madang";
		public static String pw = "madang";
		
		
		public static Connection getConnection() {
			
			
			Connection conn = null;
			try {
				
				Class.forName(drive);
				conn =  DriverManager.getConnection(url,user,pw);
				

			} catch (Exception e) {
				
				System.out.println("예외발생 : " + e.getMessage());
			}
			
			return conn;
			
		}
		
		public static void close(Connection conn, Statement stmt, ResultSet rs) {
			try {
				if(rs != null) {
					rs.close();
				}
				if(conn != null) {
					conn.close();
				}
				if(stmt != null) {
					stmt.close();
				}
				
			} catch (Exception e) {
				System.out.println("예외발생 : " + e.getMessage());
			}
		}
		
		public static void close(Connection conn, Statement stmt) {
			try {

				if(conn != null) {
					conn.close();
				}
				if(stmt != null) {
					stmt.close();
				}
			} catch (Exception e) {
				System.out.println("예외발생 : " + e.getMessage());
			}
		}
		
		
		
}
