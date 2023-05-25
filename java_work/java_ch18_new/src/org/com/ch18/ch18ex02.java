package org.com.ch18;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ch18ex02 extends JFrame implements ActionListener {

	private JPanel centerPane = new JPanel(new GridBagLayout());
	private JPanel southPane = new JPanel(new GridLayout(1, 3));
	private JPanel sPane = new JPanel(new GridLayout(2, 1));
	private JLabel lbl = new JLabel("Hello java SWING project");
	private JButton btn1 = new JButton("<");
	private JButton btn2 = new JButton("[]");
	private JButton btn3 = new JButton("<<");
	private JButton btn4 = new JButton(">>");

	private Container content;

	private JPanel contentPane = new JPanel(new BorderLayout());

//	private JLabel lbl = new JLabel("[결과]: 아무런 버튼도 눌리지 않았다.");
//	private JButton btn1 = new JButton("버튼1");
//	private JButton btn2 = new JButton("버튼2");
//	private JPanel centerPane = new JPanel();
//	private JPanel southPane = new JPanel();

	public ch18ex02() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(contentPane);

		contentPane.add(centerPane);
		contentPane.add(BorderLayout.SOUTH, southPane);
		centerPane.setBackground(Color.GREEN);
		
		centerPane.add(lbl);

		southPane.add(btn1);
		southPane.add(btn2);
		southPane.add(sPane);
		sPane.add(btn3);
		sPane.add(btn4);
		setSize(700, 800);
		setVisible(true);

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			JButton target = (JButton) e.getSource();
			System.out.println(target.getText() + "클릭했다.");
			JLabel newLabel = null;
			if (target.equals(btn1)) {
				newLabel = new JLabel("[결과] back 버튼 클릭!");
			} else if (target.equals(btn2)) {
				newLabel = new JLabel("[결과] stop 버튼 클릭!");
			}else if (target.equals(btn3)) {
				newLabel = new JLabel("[결과] fastback 버튼 클릭!");
			}else if (target.equals(btn4)) {
				newLabel = new JLabel("[결과] fastgo 버튼 클릭!");
			}
			if(newLabel != null) {
				centerPane.removeAll();
				centerPane.add(newLabel);
				centerPane.revalidate();
				centerPane.repaint();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ch18ex02 frame = new ch18ex02();

		System.out.println(frame instanceof ch18ex02);
		System.out.println(frame instanceof JFrame);
		System.out.println(frame instanceof ActionListener);
	}
}
