package com.swing;

import javax.swing.JFrame;

public class MyFrame {
	public static void main(String[] args) {
		JFrame frm = new JFrame("MyFrame");
		frm.setVisible(true);
		frm.setSize(500, 500);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
