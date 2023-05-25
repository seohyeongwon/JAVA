package org.com.ch20;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Member implements Externalizable {
	private String id;
	private String name;
	private int age;

	public Member() {
		this("", "", 0);
	}

	public Member(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeObject(id);
		out.writeObject(name);
		out.writeObject(age);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		id = (String) in.readObject();
		name = (String) in.readObject();
		age = (int) in.readObject();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
