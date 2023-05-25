package org.com.proj;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MyAppTest01 extends JFrame {

	Container contentPane;
	JTable table;
	DefaultTableModel tableModel;
	JScrollPane scrollPane;

	Object[][] rowData;
	Object[] colNames;

	public MyAppTest01() {
		init();
		start();
	}

	private void init() {
		// 화면 레이아웃
		contentPane = getContentPane();
		contentPane.setBackground(Color.WHITE);
		setSize(640, 480);

		mkTbl();
	}

	private void mkTbl() {
		// 표 속성명 지정
		colNames = new Object[] { "idx", "name", "phone" };
		// 표 데이터 준비
		rowData = new Object[][] { 
			{ 1, "kim", "010-1111-1111" }, 
			{ 2, "lee", "010-2222-2222" },
			{ 3, "park", "010-3333-3333" } 
			};
		// 표 생성
		tableModel = new DefaultTableModel(rowData, colNames);
		table = new JTable(tableModel);
		scrollPane = new JScrollPane(table);
		contentPane.add(scrollPane);

		// 표 내용 수정
	}

	private void start() {
		// 이벤트 핸들러
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyAppTest01().setVisible(true);
	}

}
