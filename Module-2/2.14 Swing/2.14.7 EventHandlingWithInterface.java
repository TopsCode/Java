package com.swing;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EventHandlingWithInterface implements KeyListener {
	
	JLabel lbl;
	
	public EventHandlingWithInterface() {

		JFrame frm = new JFrame("MyFrame");
		frm.setVisible(true);
		frm.setSize(500, 500);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(new FlowLayout());
		
		 lbl = new JLabel("Your Text ");
		frm.add(lbl);
		
		JTextField tf = new JTextField(10);
		tf.addKeyListener(this);
		frm.add(tf);

	}
	
	public static void main(String[] args) {
		EventHandlingWithInterface e = new EventHandlingWithInterface();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		String str= new Character(e.getKeyChar()).toString();
		lbl.setText(str);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
}
