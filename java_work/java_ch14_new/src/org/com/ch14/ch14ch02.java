package org.com.ch14;

public class ch14ch02 implements Runnable {

	@Override
	public void run() {
		System.out.println("Runnable : "+ Thread.currentThread());
		
	}
	
	public static void main(String[] args) {
		//1. Runnable 객체 생성
		Runnable r = new ch14ch02();
		//2. Thread 객체로 변환
		Thread thread = new Thread(r);
		thread.start();
	}

}
