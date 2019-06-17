package com.swing;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RegistrationForm {
	
	JLabel lbl;
	JTextField tf;
	JPasswordField pass;
	JRadioButton male,female;
	JComboBox<String> cities;
	JList<String> hobbies;
	
	public RegistrationForm() {
		JFrame frm = new JFrame("MyFrame");
		frm.setVisible(true);
		frm.setSize(500, 500);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(null);
		
		lbl = new JLabel("Name : - ");
		lbl.setBounds(80, 50, 200, 30);
		frm.add(lbl);
		
		tf=new JTextField();
		tf.setBounds(170, 50, 200, 30);
		frm.add(tf);
		
		lbl = new JLabel("Email : - ");
		lbl.setBounds(80, 100, 200, 30);
		frm.add(lbl);
		
		tf=new JTextField();
		tf.setBounds(170, 100, 200, 30);
		frm.add(tf);
		
		lbl = new JLabel("Password : - ");
		lbl.setBounds(80, 150, 200, 30);
		frm.add(lbl);
		
		pass=new JPasswordField();
		pass.setBounds(170, 150, 200, 30);
		frm.add(pass);
		
		lbl = new JLabel("Gendrer : - ");
		lbl.setBounds(80, 200, 200, 30);
		frm.add(lbl);
		
		male= new JRadioButton("Male");
		male.setBounds(170, 200, 100, 30);
		frm.add(male);

		female= new JRadioButton("Female");
		female.setBounds(280, 200, 200, 30);
		frm.add(female);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(male);
		bg.add(female);
		
		lbl = new JLabel("City : - ");
		lbl.setBounds(80, 250, 200, 30);
		frm.add(lbl);
		
		String data[]= {"Select City","Puna","Delhi","Ahmedabad","RAjkot"};
		cities = new JComboBox<>(data);
		cities.setBounds(170, 250, 200, 30);
		frm.add(cities);
		
		lbl = new JLabel("Hobbies : - ");
		lbl.setBounds(80, 300, 200, 30);
		frm.add(lbl);
		
		String hobby[]= {"Reading","Movie","Music","Sports"};
		hobbies = new JList<>(hobby);
		hobbies.setBounds(170, 300, 200, 100);
		frm.add(hobbies);
		
		JButton btn = new JButton("Submit");
		btn.setBounds(120, 420,200,30);
		frm.add(btn);
		
	}
	
	public static void main(String[] args) {
		
		RegistrationForm rf = new RegistrationForm();
		
	}
}
