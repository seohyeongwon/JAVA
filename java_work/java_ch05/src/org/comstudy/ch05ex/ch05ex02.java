package org.comstudy.ch05ex;

class TV3{
	private int size;
	public TV3(int size) {
		this.size = size;
	}
	protected int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}

class ctv extends TV3{
	int nco;
	ctv(int size, int nco) {
		super(size);
		this.nco = nco;
	}
	protected int getnco() {
		return nco;
	}
	public void pP() {
		System.out.println(getSize()+" inch "+nco+" color ");
	}
}

public class ch05ex02 extends ctv {
	String ip;
	
	public ch05ex02(String ip, int size, int nco) {
		super(size, nco);
		this.ip = ip;
	}
	
	public void pP() {
		System.out.println(ip+" adds");
		super.pP();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ch05ex02 myTV = new ch05ex02(32, 1024);
		ch05ex02 iptv = new ch05ex02("192.3.2.1", 32, 1024);
		//myTV.pP();
		iptv.pP();
	}
}
