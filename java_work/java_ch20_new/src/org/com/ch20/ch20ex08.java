package org.com.ch20;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ch20ex08 {
	   public static void main(String[] args) throws IOException, ClassNotFoundException {
		      File file = new File("D:\\object_list_io.data");
		      FileInputStream fis = new FileInputStream(file);
		      ObjectInputStream ois = new ObjectInputStream(fis);
		      
		      ArrayList<Member> memList = (ArrayList<Member>) ois.readObject();
		      System.out.println(memList);
		      
		      ois.close();
		      fis.close();
		   }

	public static void  test(String[] args) throws IOException {
		// TODO Auto-generated method stub
	      // 객체가 담긴 List를 파일에 저장하고
	      // 다시 불러와서 List에 객체를 담아서 사용하기.
	      ArrayList<Member> memList = new ArrayList<Member>();
	      memList.add(new Member("KIM", "김길동", 12));
	      memList.add(new Member("LEE", "이길동", 22));
	      memList.add(new Member("PARK", "박길동", 32));
	      memList.add(new Member("KANG", "강길동", 42));

	      File file = new File("D:\\object_list_io.data");
	      FileOutputStream fos = new FileOutputStream(file);
	      ObjectOutputStream oos = new ObjectOutputStream(fos);
	      oos.writeObject(memList);
	      
	      oos.close();
	      fos.close();
	      
	      System.out.println("객체 리스트를 파일에 기록 완료!");

	}

}
