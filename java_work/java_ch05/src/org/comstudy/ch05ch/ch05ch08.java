package org.comstudy.ch05ch;

interface PHI{
	final int to = 100;
	void SC();
	void RC();
	default void PL() {
		System.out.println(" %%ph%% ");
	}
}

interface MPI extends PHI{
	void SS();
	void RS();
}

interface MP3{
	public void play();
	public void stop();
}

class PDA{
	public int cal(int x, int y) {
		return x+y;
	}
}

class SP extends PDA implements MPI,MP3{
	@Override
	public void SC() {
		System.out.println("~~~~");
	}
	@Override
	public void RC() {
		System.out.println("PH CALL");
	}
	@Override
	public void SS() {
		System.out.println("ME COME");
	}
	@Override
	public void RS() {
		System.out.println("ME GO");
	}
	@Override
	public void play() {
		System.out.println("music");
	}
	@Override
	public void stop() {
		System.out.println("stop");
	}

	public void sch() {
		System.out.println("sch~~");
	}}

public class ch05ch08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SP ph = new SP();
		ph.PL();
		ph.SC();
		ph.SS();
		ph.RC();
		ph.play();
		ph.stop();
		System.out.println("3 + 5 = "+ ph.cal(3, 5));
		ph.sch();

	}

}
