package org.comstudy.ch05ex;

class TV{
	private int size;
	public TV(int size) {
		this.size = size;
	}
	protected int getSize() {
		return size;
	}
}

public class ch05ex01 extends TV {
	private int nco;
	public ch05ex01(int size, int nco) {
		super(size);
		this.nco = nco;
	}
	
	public void pP() {
		System.out.println(getSize()+" inch "+nco+" color ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ch05ex01 myTV = new ch05ex01(32, 1024);
		myTV.pP();
	}

}
