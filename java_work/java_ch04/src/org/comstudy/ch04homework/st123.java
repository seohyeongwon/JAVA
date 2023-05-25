package org.comstudy.ch04homework;

class St {
	private static St ins;

	private St() {
	}

	public static St gi() {
		if (ins == null) {
			ins = new St();
		}
		return ins;
	}

	public void past(String mess) {
		System.out.println("play ... " + mess);
	}
}

public class st123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		St st = St.gi();
		st.past("sss1");

		St st2 = St.gi();
		st.past("sss2");

	}

}
