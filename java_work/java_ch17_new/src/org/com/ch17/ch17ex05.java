package org.com.ch17;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class ch17ex05 extends MyFrame {

	   private Panel centerPanel = new Panel(new GridBagLayout());
	   private Panel southPanel = new Panel(new GridLayout(1,4));

	   private Button btn1 = new Button("<<");
	   private Button btn2 = new Button("<");
	   private Button btn3 = new Button(">>");
	   private Button btn4 = new Button("[]");
	   private Label lbl = new Label("Hello java swing world");

	   public ch17ex05(String title, int w, int h) {
	      super(title, w, h);
	      
	      centerPanel.add(lbl);
	      southPanel.add(btn1);
	      southPanel.add(btn2);
	      southPanel.add(btn3);
	      southPanel.add(btn4);
	      
	      add(centerPanel);
	      add(BorderLayout.SOUTH, southPanel);
	      setVisible(true);
	   }
	   
	   public static void main(String[] args) {
	      new ch17ex05("Panel", 640, 480);
	   }

}
