package com.kh.app.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTemplate {

   public static Connection getConn() throws Exception {
      String driver = "oracle.jdbc.driver.OracleDriver";
      String url = "jdbc:oracle:thin:@//127.0.0.1:1521/xe";
      String user = "C##KH";
      String password = "1234";

      Class.forName(driver);
      Connection conn = DriverManager.getConnection(url, user, password);
      
      conn.setAutoCommit(false);
      
      return conn;
   }//method
   
   public static void commit(Connection conn) {
      try {
         if(conn != null && !conn.isClosed()) {
            conn.commit();
         }   
      }catch(Exception e) {
         e.printStackTrace();
      }
   }//method
   
   public static void rollback(Connection conn) {
      try {
         if(conn != null && !conn.isClosed()) {
            conn.rollback();
         }   
      }catch(Exception e) {
         e.printStackTrace();
      }
   }//method
   
   public static void close(Connection conn) {
      try {
         if(conn != null && !conn.isClosed()) {
            conn.close();
         }   
      }catch(Exception e) {
         e.printStackTrace();
      }
   }//method
   
   public static void close(Statement stmt) {
      try {
         if(stmt != null && !stmt.isClosed()) {
            stmt.close();
         }   
      }catch(Exception e) {
         e.printStackTrace();
      }
   }//method
   
   public static void close(ResultSet rs) {
      try {
         if(rs != null && !rs.isClosed()) {
            rs.close();
         }   
      }catch(Exception e) {
         e.printStackTrace();
      }
   }//method
   
}//class





















