package org.com.pro_1;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Cal_interface extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Font font = new Font("Bold", Font.BOLD, 35);

	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton zeroButton;
	JButton emptyButton1;
	JButton emptyButton2;
	JButton resetButton;
	JButton convertSignButton;
	JButton decimalButton;
	JButton plusButton;
	JButton minusButton;
	JButton divButton;
	JButton mulButton;
	JButton equalButton;
	JTextArea display;

	StringBuilder sb = new StringBuilder();

	ArrayList<String> postfix = new ArrayList<>();
	Stack<String> opStack = new Stack<>(); // 연산자
	Stack<Float> numStack = new Stack<>();

	float result = 0; // 중간값의 연산을 위해 calculate()함수에서 사용

	public Cal_interface() {

		super("계산기");
		JPanel gui = new JPanel(new BorderLayout(5, 5));

		gui.setBorder(new EmptyBorder(4, 4, 4, 4));

		display = new JTextArea();
		display.setText("");
		display.setFont(font);

		gui.add(display, BorderLayout.NORTH);

		JPanel panelButtons = new JPanel(new GridLayout(5, 4, 5, 5));

		emptyButton1 = new JButton("");
		panelButtons.add(emptyButton1);

		emptyButton2 = new JButton("");
		panelButtons.add(emptyButton2);

		resetButton = new JButton("C");
		resetButton.setFont(font);
		panelButtons.add(resetButton);

		divButton = new JButton("/");
		divButton.setFont(font);
		panelButtons.add(divButton);

		sevenButton = new JButton("7");
		sevenButton.setFont(font);
		panelButtons.add(sevenButton);

		eightButton = new JButton("8");
		eightButton.setFont(font);
		panelButtons.add(eightButton);

		nineButton = new JButton("9");
		nineButton.setFont(font);
		panelButtons.add(nineButton);

		mulButton = new JButton("*");
		mulButton.setFont(font);
		panelButtons.add(mulButton);

		fourButton = new JButton("4");
		fourButton.setFont(font);
		panelButtons.add(fourButton);

		fiveButton = new JButton("5");
		fiveButton.setFont(font);
		panelButtons.add(fiveButton);

		sixButton = new JButton("6");
		sixButton.setFont(font);
		panelButtons.add(sixButton);

		minusButton = new JButton("-");
		minusButton.setFont(font);
		panelButtons.add(minusButton);

		oneButton = new JButton("1");
		oneButton.setFont(font);
		panelButtons.add(oneButton);

		twoButton = new JButton("2");
		twoButton.setFont(font);
		panelButtons.add(twoButton);

		threeButton = new JButton("3");
		threeButton.setFont(font);
		panelButtons.add(threeButton);

		plusButton = new JButton("+");
		plusButton.setFont(font);
		panelButtons.add(plusButton);

		convertSignButton = new JButton("Negative");
		panelButtons.add(convertSignButton);

		zeroButton = new JButton("0");
		zeroButton.setFont(font);
		panelButtons.add(zeroButton);

		decimalButton = new JButton(".");
		decimalButton.setFont(font);
		panelButtons.add(decimalButton);

		equalButton = new JButton("=");
		equalButton.setFont(font);
		panelButtons.add(equalButton);

		oneButton.addActionListener(this);
		twoButton.addActionListener(this);
		threeButton.addActionListener(this);
		fourButton.addActionListener(this);
		fiveButton.addActionListener(this);
		sixButton.addActionListener(this);
		sevenButton.addActionListener(this);
		eightButton.addActionListener(this);
		nineButton.addActionListener(this);
		zeroButton.addActionListener(this);
		decimalButton.addActionListener(this);
		mulButton.addActionListener(this);
		divButton.addActionListener(this);
		minusButton.addActionListener(this);
		plusButton.addActionListener(this);
		equalButton.addActionListener(this);
		resetButton.addActionListener(this);
		convertSignButton.addActionListener(this);

		gui.add(panelButtons, BorderLayout.CENTER);

		setBounds(50, 50, 500, 700);
		setContentPane(gui);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	// 이벤트 리스너 메소드
	public void actionPerformed(ActionEvent e) {

		if (e.getSource().equals(oneButton)) {
			sb.append("1");
			display.append("1");
		}

		else if (e.getSource().equals(twoButton)) {
			sb.append("2");
			display.append("2");
		} else if (e.getSource().equals(threeButton)) {
			sb.append("3");
			display.append("3");
		} else if (e.getSource().equals(fourButton)) {
			sb.append("4");
			display.append("4");
		} else if (e.getSource().equals(fiveButton)) {
			sb.append("5");
			display.append("5");
		} else if (e.getSource().equals(sixButton)) {
			sb.append("6");
			display.append("6");
		} else if (e.getSource().equals(sevenButton)) {
			sb.append("7");
			display.append("7");
		} else if (e.getSource().equals(eightButton)) {
			sb.append("8");
			display.append("8");
		} else if (e.getSource().equals(nineButton)) {
			sb.append("9");
			display.append("9");
		} else if (e.getSource().equals(zeroButton)) {
			sb.append("0");
			display.append("0");
		}

		else if (e.getSource().equals(resetButton)) {
			sb.setLength(0);
			postfix.clear();
			opStack.removeAllElements();
			numStack.clear();
			display.setText("");
		}

		// +++++++++++++++++++++++++++++++++
		else if (e.getSource().equals(plusButton)) { // -<<<

			addNumToPostfix();
			handleOperator("+");
			display.append("+");

		} // plus

		else if (e.getSource().equals(minusButton)) {

			addNumToPostfix();
			handleOperator("-");
			display.append("-");

		} // minusMethod

		else if (e.getSource().equals(mulButton)) {

			addNumToPostfix();
			handleOperator("*");
			display.append("*");
		} // mulMeThod

		else if (e.getSource().equals(divButton)) {

			addNumToPostfix();
			handleOperator("/");
			display.append("/");
		} // divMeThod

		else if (e.getSource().equals(convertSignButton)) {
			sb.append("-");
			display.append("-");
		}

		else if (e.getSource().equals(equalButton)) {

			postfix.add(sb.toString());
			sb.setLength(0);

			while (!opStack.empty()) {
				postfix.add(opStack.pop());
			}

			display.setText(Float.toString(calculate()));

		}

		else if (e.getSource().equals(decimalButton)) {
			sb.append(".");
			display.append(".");

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal_interface ci = new Cal_interface();

	}

	public int priorityCheck(String op) {

		switch (op) {

		case ("+"):
			return 1;

		case ("-"):
			return 1;

		case ("*"):
			return 2;

		case ("/"):
			return 2;

		default:
			return -1;
		}
	}// priorityCheck

	public float calculate() {

		float num1, num2;

		for (int i = 0; i < postfix.size(); i++) {

			if (postfix.get(i) == "+") {

				System.out.println(numStack.size() + "사이즈" + numStack.peek());
				num2 = numStack.pop();
				num1 = numStack.pop();

				result = num1 + num2;
				numStack.push(result);

			} else if (postfix.get(i) == "*") {
				num2 = numStack.pop();
				num1 = numStack.pop();

				result = num1 * num2;
				numStack.push(result);

			} else if (postfix.get(i) == "-") {
				num2 = numStack.pop();
				num1 = numStack.pop();

				result = num1 - num2;
				numStack.push(result);
			} else if (postfix.get(i) == "/") {
				num2 = numStack.pop();
				num1 = numStack.pop();

				result = num1 / num2;
				numStack.push(result);
			}

			else {
				numStack.push(Float.parseFloat(postfix.get(i)));
			}

		}

		postfix.clear();
		return numStack.peek();

	}// calculateMethod

	public void addNumToPostfix() {
		if (sb.length() != 0) {
			postfix.add(sb.toString());
			sb.setLength(0);
		}
	}// addNumtoPostFix Method

	public void handleOperator(String op) {
		if (opStack.empty()) {
			opStack.add(op);
		} else {
			if (priorityCheck(opStack.peek()) < priorityCheck(op)) {
				opStack.add(op);
			} else {
				postfix.add(opStack.pop());
				opStack.add(op);
			}
		}

	}

}