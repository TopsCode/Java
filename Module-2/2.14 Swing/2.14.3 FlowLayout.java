package com.swing;

import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayout {
	public static void main(String[] args) {
		JFrame frm = new JFrame("MyFrame");
		frm.setVisible(true);
		frm.setSize(500, 500);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(new java.awt.FlowLayout());
		
		JButton btn1 = new JButton("Buutton - 1");
		frm.add(btn1);
		
		JButton btn2 = new JButton("Buutton - 1");
		frm.add(btn2);
		
		JButton btn3 = new JButton("Buutton - 1");
		frm.add(btn3);
		
		JButton btn4 = new JButton("Buutton - 1");
		frm.add(btn4);
	}
}
