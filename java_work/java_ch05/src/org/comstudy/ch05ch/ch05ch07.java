package org.comstudy.ch05ch;

interface Iph{
	final int TO= 10000;
	void sC();
	void rC();
	default void pL() {
		System.out.println(" **ph** ");
	}
}

class SSph implements Iph{
	@Override
	public void sC() {
		System.out.println("~~~~");
	}
	@Override
	public void rC() {
		System.out.println("ph call~");
	}
	public void fla() {
		System.out.println("ph light~");
	}
}

public class ch05ch07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SSph ph = new SSph();
		ph.pL();
		ph.sC();
		ph.rC();
		ph.fla();

	}

}
