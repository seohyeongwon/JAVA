package org.com.ch14;

public class ch14ch04 implements Runnable {
	boolean flag = false;

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("run th");

			try {
				Thread.sleep(100);
				synchronized (this) {
					if (flag) {
						this.wait();
					}
				}
			} catch (InterruptedException e) {
			}
		}
	}

	void pause() {
		System.out.println("run asd");
		flag = true;
	}

	void restart() {
		flag = false;
		synchronized (this) {
			this.notifyAll();
		}
	}

	public static void main(String[] args) {
		
		ch14ch04 target = new ch14ch04();
		
		Thread thread = new Thread(target);

		thread.start();

		for (int i = 0; i < 100; i++) {
			System.out.println("main qwe");
			try {
				if (i == 30) {
					synchronized (thread) {
						target.pause();
					}
				}
				if (i == 50) {
					synchronized (thread) {
						target.restart();
					}
				}
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}
}
