package org.comstudy.ch05ch;

abstract class TV{
	public abstract void powerOn();
}

class SamsungTV extends TV{
	public void powerOn() {
		System.out.println(" tv on");
	}
}

class LgTV extends TV {
	public void turnOn() {
		System.out.println("lg tv on");
	}

	@Override
	public void powerOn() {
		turnOn();
	}
	
}

public class ch05ch06 {
public static void TvRunner(TV tv) {
	tv.powerOn();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TvRunner(new SamsungTV());
		TvRunner(new LgTV());

	}

}
