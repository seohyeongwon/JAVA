package org.com.controller;
import java.util.List;

import org.com.model.SaramDAO;
import org.com.model.SaramDTO;

public class SaramController {
	   static SaramDAO dao = new SaramDAO();
	   
	   public static void main(String[] args) {
	      SaramDTO dto = new SaramDTO("kim3", "김길동3", 30);
	      dao.insert(dto);
	      testSelectAll();
	   }
	   
	   public static void testSelectOne() {
	      SaramDTO dto = new SaramDTO("kim2", null, 0);
	      SaramDTO one = dao.selectOne(dto);
	      System.out.println(one);
	   }
	   
	   public static void testSelectAll() {
	      List<SaramDTO> list = dao.selectAll();
	      System.out.println(list);
	   }

}
