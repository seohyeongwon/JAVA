package org.com.ch17;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MyFrame extends Frame {
	   
	   public MyFrame() {
	      this("no-title", 320, 240);
	   }
	   
	   public MyFrame(int w, int h) {
	      this("no-title", w, h);
	   }
	   
	   public MyFrame(String title, int w, int h) {
	      setTitle(title);
	      setSize(w, h);
	      setVisible(true);
	      
	      addWindowListener(new WindowAdapter() {
	         @Override
	         public void windowClosing(WindowEvent e) {
	            System.exit(0);
	         }
	      });
	   }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      new MyFrame();
	      new MyFrame(640,480);
	      new MyFrame("테트리스 게임", 800,600);

	}

}
