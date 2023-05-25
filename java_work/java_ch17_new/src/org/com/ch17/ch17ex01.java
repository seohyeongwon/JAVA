package org.com.ch17;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ch17ex01 {
public static void main(String[] args) {
	Frame frame = new Frame();
	new Frame().setVisible(true);
	frame.setSize(640,480);
	frame.addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	});
}
}
