package Othello;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//JFrame을 상속 받는다
public class start extends JFrame {

	public start() {
		
		//panel 생성
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID : ");
		//비밀번호 입력 안내 텍스트 생성
		JLabel password = new JLabel("PassWord : ");
		//ID를 입력할 TextField 생성, 10글자 작성 가능
		JTextField txtID = new JTextField(10);
		//암호처럼 textField에 쳤을 때 우리 눈에 암호화되어서 보이는 textField
		//textField지만 암호화됨
		//비밀번호는 10자리 까지만 입력할 수 있음
		JPasswordField txtPass = new JPasswordField(10);
		//버튼 추가
		JButton logbtn = new JButton("LogIn");

		//panel에 ID 텍스트인 label 추가
		panel.add(label);
		//panel에 아이디를 입력받을 txtID 추가
		panel.add(txtID);
		//panel에 PassWord 텍스트인 label 추가
		panel.add(password);
		//panel에 비밀번호를 입력받을 txtPass 추가
		panel.add(txtPass);
		//panel 맨 마지막에 LogIn 버튼 추가
		panel.add(logbtn);
		
		//logbtn에 기능 추가
		logbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//원하는 아이디
				String ID = "won";
				//원하는 비밀번호
				String pass = "1444";
				
				//만약 입력한 아이디가 원하는 아이디와 같고
				//입력한 비밀번호가 원하는 비밀번호(txtPass)와 같다면
				if ( ID.equals(txtID.getText()) && pass.equals(txtPass.getText())) {
					//아래의 메시지를 보여준다
					JOptionPane.showMessageDialog(null, "성공!");
					
					dispose();
					try {
						Othello oth = new Othello();
						javax.swing.SwingUtilities.invokeLater(new Runnable() {
							public void run() {
								try {
									Othello.createAndShowGUI();
								} catch (IOException e) {
									e.printStackTrace();
								}
							}
						});
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
				
				}
				//만약 틀렸을 경우
				else {
					JOptionPane.showMessageDialog(null, "실패!");
				}
			}
		});
		
		//JFrame에 이 모든 것들을 담은 panel을 추가하기
		add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,150);
		setLocationRelativeTo(null);
		setResizable(false);
		
	}
	
	public static void main(String args[]) {
		//main메서드에서 LogIn이 자동으로 실행되도록
		new start();
	}
}
