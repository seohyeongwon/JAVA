package org.com.ch17;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;

public class ch17ex03 extends MyFrame {
	private Button btn01 = new Button("FirstButton");
	private static Button[] btns = new Button[100];
	static {
		for (int i = 0; i < btns.length; i++) {
			btns[i]=new Button("Button"+i);
		}
	}

	public ch17ex03 (int w, int h) {
		super("layout",w,h);
		setLayout(new FlowLayout());
		add(btn01);
		//add(btn01,BorderLayout.NORTH);
		
		for (int i = 0;  i< btns.length; i++) {
			add(btns[i]);
		}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch17ex03(640,480);
	}

}
