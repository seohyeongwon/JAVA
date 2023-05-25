package org.com.ch14game;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Bullet extends JPanel implements Runnable{
	   JLabel bullet = new JLabel("총알");
	   int x=400, y=500, w=60, h=50;
	   boolean fire = false;
	   
	   public Bullet() {
	      //setBackground(Color.yellow);
	      setLayout(null);
	      this.add(bullet);
	      bullet.setBounds(x, y, w, h);
	      
	      new Thread(this).start();
	   }

	
	   @Override
	   public void run() {
	      while (true) {
	         try {
	            Thread.sleep(1000/60);
	            if(fire) {
	               y -= 20;
	               if(y <= 0) {
	                  y = 550;
	                  fire = false;
	               }
	               bullet.setBounds(x,y,w,h);
	            }
	         } catch (InterruptedException e) {
	            e.printStackTrace();
	         }
	      }
	   }

	
}

public class JAVAgame extends JFrame implements Runnable, ActionListener {
	   Container contentPane;
	   int x=50, y=50, w=60, h=50;
	   JLabel bird = new JLabel("참새");
	   Bullet bullet = new Bullet();
	   JButton fireBtn = new JButton("Fire");
	   
	   public JAVAgame() {
	      setDefaultCloseOperation(EXIT_ON_CLOSE);
	      contentPane = getContentPane();
	      contentPane.setLayout(null);
	      
	      contentPane.add(bird);
	      bird.setBounds(x,y,w,h);
	      
	      contentPane.add(bullet);
	      bullet.setBounds(0, 0, 800, 600);
	      
	      new Thread(this).start();
	      
	      contentPane.add(fireBtn);
	      fireBtn.setBounds(600, 400, 100, 100);
	      
	      fireBtn.addActionListener(this);
	      
	      setSize(800, 600);
	      setVisible(true);
	   }
	   
	   @Override
	   public void run() {
	      while (true) {
	         try {
	            Thread.sleep(1000/30);
	            x += 10;
	            if(x >= 750) {
	               x = 50;
	            }
	            bird.setBounds(x,y,w,h);
	         } catch (InterruptedException e) {
	            e.printStackTrace();
	         }
	      }
	   }


	public static void main(String[] args) {
		
		new JAVAgame();
	}
		   @Override
		   public void actionPerformed(ActionEvent e) {
		      bullet.fire = true;
		   
		   }
	}
