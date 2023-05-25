package org.com.ch18;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ch18ex01 extends JFrame implements ActionListener {
	   private JPanel contentPane = new JPanel(new BorderLayout());
	   
	   private JLabel lbl = new JLabel("[결과]: 아무런 버튼도 눌리지 않았다.");
	   private JButton btn1 = new JButton("버튼1");
	   private JButton btn2 = new JButton("버튼2");
	   private JPanel centerPane = new JPanel();
	   private JPanel southPane = new JPanel();
	   
	   public ch18ex01() {
	      setDefaultCloseOperation(EXIT_ON_CLOSE);
	      setContentPane(contentPane);
	      
	      contentPane.add(centerPane);
	      contentPane.add(BorderLayout.SOUTH, southPane);
	      
	      centerPane.add(lbl);
	      southPane.add(btn1);
	      southPane.add(btn2);
	      
	      setSize(300,100);
	      setVisible(true);
	      
	      btn1.addActionListener(this);
	      btn2.addActionListener(this);
	   }
	   
	   @Override
	   public void actionPerformed(ActionEvent e) {
	      if(e.getSource() instanceof JButton) {
	         JButton target  = (JButton)e.getSource();
	         //System.out.println(target.getText() + "클릭했다.");
	         
	         if(target.equals(btn1)) {
	            System.out.println("[결과] 첫번째 버튼 클릭!");
	         } else if(target.equals(btn2)) {
	            System.out.println("[결과] 두번째 버튼 클릭!");
	         }
	      }
	   }

	   


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ch18ex01 frame =new ch18ex01();
		
		System.out.println(frame instanceof ch18ex01);
		System.out.println(frame instanceof JFrame);
		System.out.println(frame instanceof ActionListener);
	}
	

}
