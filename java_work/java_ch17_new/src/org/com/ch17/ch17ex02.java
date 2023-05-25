package org.com.ch17;

import java.awt.Button;

public class ch17ex02 extends MyFrame {

	public ch17ex02(String title, int w, int h) {
		super(title,w,h);
		
		setLayout(null);
		Button btn = new Button("ok btn");
		this.add(btn);
		btn.setBounds(100, 100, 100, 40);
	}
	
	public static void main(String[] args) {
		new ch17ex02("qwe",640, 480);

	}

}
