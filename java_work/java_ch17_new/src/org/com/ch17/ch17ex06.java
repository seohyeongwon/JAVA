package org.com.ch17;

import java.awt.Button;
import java.awt.Container;

import javax.swing.JFrame;

public class ch17ex06 extends JFrame {
	
	private Container content = null;

	public ch17ex06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		content = this.getContentPane();
		content.add(new Button("Button"));
		setSize(640, 480);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch17ex06().setVisible(true);
	}

}
