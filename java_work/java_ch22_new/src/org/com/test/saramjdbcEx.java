package org.com.test;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.com.dbcp.JdbcUtil;

public class saramjdbcEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Connection conn = JdbcUtil.getConnection();
	      Statement stmt = null;
	      ResultSet rs = null;
	      String sql = "SELECT * FROM ONE";
	      try {
	         stmt = conn.createStatement();
	         rs = stmt.executeQuery(sql);
	         // rs는 Iterator와 비슷하게 사용한다.
	         while(rs.next()) {
	            String id = rs.getString("id");
	            String name = rs.getString("name");
	            int age = rs.getInt("age");
	            System.out.printf("%s %s %d\n", id, name, age);
	         }
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	   

	}

}
