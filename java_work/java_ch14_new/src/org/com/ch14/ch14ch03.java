package org.com.ch14;

public class ch14ch03 implements Runnable {
	   boolean flag = false;
	   @Override
	   public void run() {
	      for(int i=0; i<100; i++) {         
	         System.out.println("러너블 쓰레드");
	         try {
	            Thread.sleep(100);
	            
	            synchronized (this) {
	               if(flag) {
	                  this.wait();
	               }
	            }
	         } catch (InterruptedException e) {}
	      }
	      // wait / notifyAll
	      // 스레드 동기화 : synchronized 블럭 활용
	   }
	   
	   void pause() {
	      System.out.println("러너블의 pause() 호출");
	      flag = true;
	   }
	   
	   void restart() {
	      flag = false;
	      synchronized (this) {
	         this.notifyAll();
	      }
	   }
	   

	public static void main(String[] args) {
		ch14ch03 target = new ch14ch03();
	      Thread thread = new Thread(target);
	      thread.start();
	      
	      for(int i=0; i<100; i++) {   
	         System.out.println("main 쓰레드");
	         // i가 30정도 되었을때 run을 중지한다.
	         // i가 50정도 되었을때 run을 재 시작
	         try {
	            if(i == 30) {
	               synchronized (thread) {
	                  target.pause();
	               }
	            }
	            if(i == 50) {
	               synchronized (thread) {
	                  target.restart();
	               }
	            }
	            Thread.sleep(100);
	         } catch (InterruptedException e) {}
	      }
	   }

}
