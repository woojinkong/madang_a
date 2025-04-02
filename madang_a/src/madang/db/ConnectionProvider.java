package madang.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionProvider {

	
	//고객명을 입력받아 고객이 구매한 도서목록을 출력하라.

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
