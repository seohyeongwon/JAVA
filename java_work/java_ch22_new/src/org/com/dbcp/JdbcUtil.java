package org.com.dbcp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcUtil {
	   // JdbcUtil.getConnection();
	public static Connection getConnection() {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mariadb://localhost:3306/won";
		String user = "root";
		String password = "1234";
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection conn= DriverManager.getConnection(url, user, password);
			return conn;
			//System.out.println(conn);
			//System.out.println("드라이버 검색 완료");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 검색 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("디비 접속 실패");
			e.printStackTrace();
		}
		return null;
	}
	
	   
	   public static void close(Connection conn) {
	      if(conn != null) {
	         try {
	            conn.close();
	         } catch (SQLException e) {
	            e.printStackTrace();
	         }
	      }
	   }

	
	   public static void close(PreparedStatement o) {
		      if(o != null) {
		         try {
		            o.close();
		         } catch (SQLException e) {
		            e.printStackTrace();
		         }
		      }
		   }
	   
	   public static void close(ResultSet o) {
			if(o != null) {
				try {
					o.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	
	public static void main(String[] args) {
		System.out.println(getConnection());
	}
	   public static void close(Connection conn, PreparedStatement stmt, ResultSet rs) {
		      close(conn);
		      close(stmt);
		      close(rs);
		   }



}
