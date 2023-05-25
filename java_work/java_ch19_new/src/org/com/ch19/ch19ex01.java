package org.com.ch19;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

public class ch19ex01 extends JFrame{
	Container contentPane;
	
	public ch19ex01() {
		contentPane = getContentPane();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setSize(new Dimension(800,600));
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		String str ="hello java gui";
		int x=100,y=100;
		
		g.setColor(Color.GREEN);
		Font font = new Font("궁서",Font.BOLD,36);
		g.setFont(font);
		
		g.drawRect(100, 100, 200,200);
		g.drawString("hello world", x, y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch19ex01();
	}

}
