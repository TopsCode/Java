package com.swing;

import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EventWithAnonymusClass {
	
	JLabel lbl;
	
	public EventWithAnonymusClass() {
		JFrame frm = new JFrame("MyFrame");
		frm.setVisible(true);
		frm.setSize(500, 500);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(new FlowLayout());
		
		 lbl = new JLabel("Your Text ");
		frm.add(lbl);
		
		JTextField tf = new JTextField(10);
		tf.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				String str= new Character(e.getKeyChar()).toString();
				lbl.setText(str);
			}
			
		});
		frm.add(tf);
	}
	
	public static void main(String[] args) {
		EventWithAnonymusClass e = new EventWithAnonymusClass();
	}
}
