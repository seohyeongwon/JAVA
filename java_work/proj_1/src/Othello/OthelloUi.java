package Othello;

import java.awt.BorderLayout; 
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

public class OthelloUi extends JPanel {
	
	private static final long serialVersionUID = 1L;
	JLayeredPane layeredPane;
	JPanel board;
	JPanel controlPanel;
	JToolBar tool;
	JPanel gui;
	
	JButton restartButton;
	JButton endButton;
	JButton giveUpButton;
	JButton skipTurnButton;
	
	JLabel imgLabel;
	
	JPanelSquare[][] squarePanel = new JPanelSquare[8][8];
	
	public OthelloUi() throws IOException {	

		Dimension guiSize = new Dimension(600,600);
		Dimension size = new Dimension(600,600);
		
		gui = new JPanel(new BorderLayout());
		gui.setSize(guiSize);

		//Toolbar 달기
		tool = new JToolBar();
		
		restartButton = new JButton("Game ReStart");
		endButton = new JButton("Game End");
		giveUpButton = new JButton("Game GiveUp");
		skipTurnButton = new JButton("Skip turn");	
		
		tool.add(restartButton);
		tool.addSeparator();
		tool.add(endButton);
		tool.addSeparator();
		tool.add(giveUpButton);
		tool.addSeparator();
		tool.add(skipTurnButton);

		
		gui.add(tool, BorderLayout.NORTH);

		//JFrame에 LayeredPane 넣기
		layeredPane = new JLayeredPane();
		layeredPane.setPreferredSize(size);
		gui.add(layeredPane);
		
		//LayeredPane에 board 넣기
		board = new JPanel();
		board.setLayout(new GridLayout(8,8));
		board.setPreferredSize(size);
		board.setBounds(0, 0, size.width, size.height);
		layeredPane.add(board,JLayeredPane.DEFAULT_LAYER);
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				squarePanel[i][j] = new JPanelSquare(i, j, "Empty");
				squarePanel[i][j].setLayout(new BorderLayout());
				squarePanel[i][j].setBackground((i + j) % 2 == 0 ? Color.lightGray : Color.white);
				ImageIcon icon = new ImageIcon(new BufferedImage(64, 64, BufferedImage.TYPE_INT_ARGB));
				imgLabel = new JLabel(icon, SwingConstants.CENTER);

				squarePanel[i][j].add(imgLabel);
				board.add(squarePanel[i][j]);
			}
		} // for
	}
	
	public Dimension setPreferredSize() {
		return new Dimension(700,600);
	}
	
	
	private static void createAndShowGUI() throws IOException {
		// Create and set up the window.
		
		JFrame frame = new JFrame();
		OthelloUi othelloUi = new OthelloUi();
		frame.add(othelloUi.gui);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("오델로 게임");
		frame.setResizable(false);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	private class JPanelSquare extends JPanel{
		
		private static final long serialVersionUID = 1L;
		int column;
		int row;
		String state;
		JLabel piece = null;
			
		public JPanelSquare(int row, int column, String state) {
			this.column = column;
			this.row = row;
			this.state = state;
		}	
		
		public int getColumn() {
			return column;
		}
		
		public int getRow() {
			return row;
		}
		
		@Override
		public Component add(Component c) {
			piece = (JLabel) c;
			return super.add(c);
		}
		
	    @Override
	    public void remove(Component comp) {
	        piece = null;
	        super.remove(comp);
	    }

		public JLabel getPiece() {
			return piece;
		}
		
		public void setPiece() {
			
		}
		
		public void setState(String state) {
			this.state = state;
		}
		
		public String getState() {
			return state;
		}
			
	} //JPanelSquare Class
	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					createAndShowGUI();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
}

