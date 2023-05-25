package org.comstudy.ch04homework;


class SingleTone {
   //private static SingleTone instance = new SingleTone();
   private static SingleTone instance;
   
   private SingleTone() {}
   
   public static SingleTone getInstance() {
      if(instance == null) {
         instance = new SingleTone();
      }
      return instance;
   }
   
   public void run(String message) {
      System.out.println("실행 ... " + message);
   }
}

public class SingleToneEx {
   // 인스턴스가 오직 1개뿐인 클래스 
   public static void main(String[] args) {
      //SingleTone st = new SingleTone();
      SingleTone st = SingleTone.getInstance(); // 클래스 이름으로 접근(static)
      st.run("s1");
      
      SingleTone st2 = SingleTone.getInstance();
      st.run("s2");
   }
}