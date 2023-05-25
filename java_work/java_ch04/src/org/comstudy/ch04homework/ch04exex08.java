package org.comstudy.ch04homework;

class Power {
	private int kick;
	private int punch;
	public Power() {}
	public Power(int kick) {
		this.kick = kick;
	}
	public Power(int kick, int punch) {
		this.kick= kick;
		this.punch=punch;
		
	}
	public int getKick() {
		return kick;
	}
	public void setKick(int kick) {
		this.kick = kick;
		System.out.println(kick + "~~~~");
	}
	public int getPunch() {
		return punch;
	}
	public void setPunch(int punch) {
		this.punch = punch;
		System.out.println( "~~~~"+ punch);
	}
	@Override
	public String toString() {
		return "Power [ kick=" + kick + ", punch=" + punch + " ]";
	}
	

	// 생성자
	// getters, setters 추가
	// toString 추가
//	public void akick(int kick) {
//		this.kick = kick;
//		System.out.println("kick ~" + kick);
//
//	}
//
//	public void apunch(int punch) {
//		this.punch = punch;
//		System.out.println("punch ~" + punch);
//	}
}

public class ch04exex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Power robot = new Power();
		robot.setKick(30);
		robot.setPunch(50);
		System.out.println(robot);
	}





}
