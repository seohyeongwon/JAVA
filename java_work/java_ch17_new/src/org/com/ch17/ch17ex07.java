package org.com.ch17;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ch17ex07 extends JFrame {
	   private JPanel centerPane = new JPanel(new GridBagLayout());
	   private JPanel southPane = new JPanel(new GridLayout(1, 3));
	   private JPanel sPane = new JPanel(new GridLayout(2, 1));
	   private JLabel lbl = new JLabel("Hello java SWING project");
	   private JButton btn1 = new JButton("<");
	   private JButton btn2 = new JButton("[]");
	   private JButton btn3 = new JButton("<<");
	   private JButton btn4 = new JButton(">>");
	   
	   private Container content;
	   

	public ch17ex07() {
		// TODO Auto-generated constructor stub
	      setDefaultCloseOperation(EXIT_ON_CLOSE);
	      content = getContentPane();
	      
	      centerPane.add(lbl);
	      southPane.add(btn1);
	      southPane.add(btn2);
	      southPane.add(sPane);
	      sPane.add(btn3);
	      sPane.add(btn4);
	      
	      content.setLayout(new BorderLayout());
	      content.add(centerPane);
	      content.add(BorderLayout.SOUTH, southPane);
	      
	      setSize(640, 480);

		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch17ex07().setVisible(true);
		
		System.out.println(frame instanceof ch18ex02);
		System.out.println(frame instanceof JFrame);
		System.out.println(frame instanceof ActionListener);
	}

}
