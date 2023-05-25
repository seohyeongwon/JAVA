package org.com.ch14;

public class ch14ch01 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(Thread.currentThread()+"-");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new ch14ch01();
		thread.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread());
			Thread.sleep(500);
		}
		
	}

}
