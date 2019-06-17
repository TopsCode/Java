package com.swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayout {
	public static void main(String[] args) {
		JFrame frm = new JFrame("MyFrame");
		frm.setVisible(true);
		frm.setSize(500, 500);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(new java.awt.BorderLayout());
		
		JButton btn1 = new JButton("Buutton - EAST");
		frm.add(btn1,java.awt.BorderLayout.EAST);
		
		JButton btn2 = new JButton("Buutton - WEST");
		frm.add(btn2,java.awt.BorderLayout.WEST);
		
		JButton btn3 = new JButton("Buutton - SOUTH");
		frm.add(btn3,java.awt.BorderLayout.SOUTH);
		
		JButton btn4 = new JButton("Buutton - NORTH");
		frm.add(btn4,java.awt.BorderLayout.NORTH);

		JButton btn5 = new JButton("Buutton - CENTER");
		frm.add(btn5,java.awt.BorderLayout.CENTER);
	}
}
