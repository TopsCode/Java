package com.swing;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EventWithAnonymusInterface {
	
	JLabel lbl;
	
	public EventWithAnonymusInterface() {
		JFrame frm = new JFrame("MyFrame");
		frm.setVisible(true);
		frm.setSize(500, 500);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(new FlowLayout());
		
		 lbl = new JLabel("Your Text ");
		frm.add(lbl);
		
		JTextField tf = new JTextField(10);
		tf.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				String str= new Character(e.getKeyChar()).toString();
				lbl.setText(str);
			}
		});
		frm.add(tf);

	}
	
	public static void main(String[] args) {
		EventWithAnonymusInterface e = new EventWithAnonymusInterface();
		
	}
}
