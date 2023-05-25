package org.com.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.com.dbcp.JdbcUtil;

public class SaramDAO {
	  public static final String SELECT_ALL = "SELECT * FROM ONE";
	   public static final String SELECT_ONE = "SELECT * FROM ONE WHERE ID=?";
	   public static final String INSERT = "INSERT INTO ONE(ID, NAME, AGE) VALUES(?,?,?)";
	   public static final String UPDATE = "UPDATE ONE SET NAME=?, AGE=? WHERE ID=?";
	   public static final String DELETE = "DELETE FROM ONE WHERE ID=?";
	   
	   private Connection conn;
	   private PreparedStatement stmt;
	   private ResultSet rs;
	   
	   // CRUD 기능 구현
	   public List<SaramDTO> selectAll() {
	      List<SaramDTO> list = new ArrayList<SaramDTO>();
	      
	      conn = JdbcUtil.getConnection();
	      try {
	         stmt = conn.prepareStatement(SELECT_ALL);
	         rs = stmt.executeQuery();
	         while(rs.next()) {
	            String id = rs.getString("id");
	            String name = rs.getString("name");
	            int age = rs.getInt("age");
	            list.add(new SaramDTO(id, name, age));
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } finally {
	         JdbcUtil.close(conn, stmt, rs);
	      }
	      
	      return list;
	   }
	   
	   public SaramDTO selectOne(SaramDTO dto) {
	      SaramDTO one = null;
	      
	      conn = JdbcUtil.getConnection();
	      try {
	         stmt = conn.prepareStatement(SELECT_ONE);
	         stmt.setString(1, dto.getId());
	         rs = stmt.executeQuery();
	         if(rs.next()) {
	            String id = rs.getString("id");
	            String name = rs.getString("name");
	            int age = rs.getInt("age");
	            one = new SaramDTO(id, name, age);
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } finally {
	         JdbcUtil.close(conn, stmt, rs);
	      }
	      
	      return one;
	   }
	   
	   public void insert(SaramDTO dto) {
	      conn = JdbcUtil.getConnection();
	      try {
	         stmt = conn.prepareStatement(INSERT);
	         stmt.setString(1, dto.getId());
	         stmt.setString(2, dto.getName());
	         stmt.setInt(3, dto.getAge());
	         int cnt = stmt.executeUpdate();
	         if(cnt > 0) {
	            System.out.println("입력 성공!");
	         } else {
	            System.out.println("입력 실패!");            
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } finally {
	         JdbcUtil.close(conn, stmt, rs);
	      }
	   }
	   
	   public void update(SaramDTO dto) {
	      conn = JdbcUtil.getConnection();
	      try {
	         stmt = conn.prepareStatement(UPDATE);
	         stmt.setString(1, dto.getName());
	         stmt.setInt(2, dto.getAge());
	         stmt.setString(3, dto.getId());
	         int cnt = stmt.executeUpdate();
	         if(cnt > 0) {
	            System.out.println("수정 성공!");
	         } else {
	            System.out.println("수정 실패!");            
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } finally {
	         JdbcUtil.close(conn, stmt, rs);
	      }
	   }

	   public void delete(SaramDTO dto) {
	      conn = JdbcUtil.getConnection();
	      try {
	         stmt = conn.prepareStatement(DELETE);
	         stmt.setString(1, dto.getId());
	         int cnt = stmt.executeUpdate();
	         if(cnt > 0) {
	            System.out.println("삭제 성공!");
	         } else {
	            System.out.println("삭제 실패!");            
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } finally {
	         JdbcUtil.close(conn, stmt, rs);
	      }
	   }
	}