package frame;

import java.awt.event.*;
import javax.swing.*;
import teacher.*;
import student.*;
public  class Body{
	
	JFrame f;
	JLabel l1, l2;
	JButton b1, b2;
	

		public Body(){
			f = new JFrame("Assignment  Management    System");
			f.setSize(500,500);
			f.setResizable(false);

			
			
			l1 = new JLabel("WELCOME TO ASSIGNMENT MANAGEMENT SYSTEM");
			l1.setBounds(80, 20, 500, 30);
			f.add(l1);
			
			
			l2 = new JLabel("Login As:");
			l2.setBounds(100,150,80,30);
			f.add(l2);
			
			b1 = new JButton("Student");
			b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					 if(e.getSource()==b1) {
							                 new StudentLogin();
							                  f.dispose();   
					 						}
					 }});
			b1.setBounds(200,150,100,30);
			f.add(b1);
			
			b2= new JButton("Teacher");
			b2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					 if(e.getSource()==b2) {
		                 new TeacherLogin();
		                 f.dispose();
					 }
				}});
			b2.setBounds(200,200,100,30);
			f.add(b2);
			
			
			f.setLayout(null);
			f.setVisible(true);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}

	}



