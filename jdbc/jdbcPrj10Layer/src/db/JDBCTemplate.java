package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCTemplate {
	public static Connection getConn() throws Exception {
	      String driver = "oracle.jdbc.driver.OracleDriver";
	      String url = "jdbc:oracle:thin:@//127.0.0.1:1521/xe";
	      String user = "C##KH";
	      String password = "1234";
	      
	      Class.forName(driver);
	      Connection conn = DriverManager.getConnection(url , user , password);
	      return conn;
	   }
}
