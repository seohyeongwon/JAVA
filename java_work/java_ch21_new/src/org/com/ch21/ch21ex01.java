package org.com.ch21;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ch21ex01 extends JFrame implements ActionListener  {
	public static final JPanel contentPane;
	static {
		contentPane = new JPanel();
	}

	private JLabel lbl1 = new JLabel("이  름 : ");
	private JLabel lbl2 = new JLabel("아이디 : ");
	private JLabel lbl3 = new JLabel("패스워드 : ");
	private JLabel lbl4 = new JLabel("나  이 : ");

	private JTextField txt1 = new JTextField("", 20);
	private JTextField txt2 = new JTextField("", 20);
	private JTextField txt3 = new JTextField("", 20);
	private JTextField txt4 = new JTextField("", 20);

	private JButton btn1 = new JButton("가입하기");
	private JButton btn2 = new JButton("다시쓰기");

	private JPanel[] paner = new JPanel[5];
	{
		for (int i = 0; i < paner.length; i++) {
			paner[i] = new JPanel();
		}
	}

	public ch21ex01() {
		setContentPane(contentPane);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		layoutInit();

		btn1.addActionListener(this);
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
		         JOptionPane.showMessageDialog(null, "다시쓰셈");
			}
		});
		
		setSize(400, 300);
	}

	private void layoutInit() {
		paner[0].add(lbl1);
		paner[0].add(txt1);
		paner[1].add(lbl2);
		paner[1].add(txt2);
		paner[2].add(lbl3);
		paner[2].add(txt3);
		paner[3].add(lbl4);
		paner[3].add(txt4);
		paner[4].add(btn1);
		paner[4].add(btn2);

		JPanel centerPane = new JPanel(new GridLayout(5, 1));
		centerPane.add(paner[0]);
		centerPane.add(paner[1]);
		centerPane.add(paner[2]);
		centerPane.add(paner[3]);
		centerPane.add(paner[4]);

		contentPane.setLayout(new FlowLayout());
		contentPane.add(centerPane);
	}

	public static void main(String[] args) {
		new ch21ex01().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "가입이 성공적으로 완료 되었습니다.");
		//JOptionPane.showConfirmDialog(this, "다시쓰셈");
	
	}
	
}
