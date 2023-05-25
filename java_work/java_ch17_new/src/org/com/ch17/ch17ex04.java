package org.com.ch17;

import java.awt.GridLayout;
import java.awt.Button;

public class ch17ex04 extends MyFrame {
	   private GridLayout grid = new GridLayout(3, 4, 5, 10);
	   
	   private static Button[] btns = new Button[12]; 
	   
	   static {
	      for(int i=0;i<btns.length; i++) {
	         btns[i] = new Button("Button" + i);
	      }
	   }
	   
	   public ch17ex04(String title, int w, int h) {
	      super(title, w, h);
	      
	      setLayout(grid);
	      for(int i =0; i<btns.length; i++) {
	         add(btns[i]);
	      }
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch17ex04("grid ex",640,480);
	}

}
