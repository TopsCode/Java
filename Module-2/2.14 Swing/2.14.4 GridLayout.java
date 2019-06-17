package com.swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayout {
	public static void main(String[] args) {
		JFrame frm = new JFrame("MyFrame");
		frm.setVisible(true);
		frm.setSize(500, 500);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(new java.awt.GridLayout(3,2));
		
		JButton btn1 = new JButton("Buutton - 1");
		frm.add(btn1);
		
		JButton btn2 = new JButton("Buutton - 2");
		frm.add(btn2);
		
		JButton btn3 = new JButton("Buutton - 3");
		frm.add(btn3);
		
		JButton btn4 = new JButton("Buutton - 4");
		frm.add(btn4);
		
		JButton btn5 = new JButton("Buutton - 5");
		frm.add(btn5);

	}
}
