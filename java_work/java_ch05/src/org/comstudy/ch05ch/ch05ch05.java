package org.comstudy.ch05ch;

//추상 클래스는 객체 생성 불가능하다.
abstract class sla {
	public abstract void stu();
}

class fam extends sla {
	@Override
	public void stu() {
		System.out.println("노비 아들이 공부한다.");
	}
}

public class ch05ch05 {

	public static void main(String[] args) {
		// TODO Auto-generated method
		sla qwe = new fam();
		qwe.stu();
	}

}
