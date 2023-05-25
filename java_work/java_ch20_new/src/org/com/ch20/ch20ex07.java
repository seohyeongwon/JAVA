package org.com.ch20;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ch20ex07 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<Member> memList = new ArrayList<Member>();
		memList.add(new Member("kim", "김길동", 12));
		memList.add(new Member("lee", "dl길동", 22));
		memList.add(new Member("park", "qkr길동", 32));
		memList.add(new Member("kang", "rkd길동", 42));

		File file = new File("D:\\object_list_io.data");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(memList);

		oos.close();
		fos.close();

		System.out.println("객체를 list 파일에 기록 완료!");

	}

	public static void main2(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("D:\\object_io.data");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);

		Member readMem = (Member) ois.readObject();
		System.out.println(readMem);

		ois.close();
		fis.close();

	}

	public static void main1(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Member member = new Member("Hong", "Gildong", 23);

		File file = new File("D:\\object_io.data");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(member);

		oos.close();
		fos.close();

		System.out.println("객체를 파일에 기록 완료!");

	}

}
