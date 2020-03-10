package student;

import java.awt.event.*;
import javax.swing.*;

import database.StudentDetails;
import frame.*;
//import database.*;
//import java.sql.*;


public class StudentLogin implements ActionListener{
	JFrame f;
	JPanel p1;
	JLabel l1 , l2, l3;
	public JTextField t1, t2;
	JButton b1, b2, b3,b4;
	
		public	StudentLogin(){
				f = new JFrame("Assignment   Management    System");
				f.setSize(500,500);
				f.setVisible(true);
				f.setResizable(false);
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				p1 = new JPanel();
				p1.setLayout(null);
				
				l1 = new JLabel("YOU ARE GOING TO LOG IN AS STUDENT");
				l1.setBounds(110, 30, 300, 30);
				p1.add(l1);
				
				l2 = new JLabel("Roll No.:");
				l2.setBounds(20, 80, 200, 30);
				p1.add(l2);
				
				t1 = new JTextField("");
				t1.setBounds(170,80,200,30);
			    p1.add(t1);
			    
				l3 = new JLabel("Password:");
				l3.setBounds(20, 130, 200, 30);
				p1.add(l3);
				
				t2 = new JPasswordField("");
				t2.setBounds(170,130,200,30);
				p1.add(t2);
					
				b1 = new JButton("Log In");
				b1.setBounds(170,220,100,30);
				b1.addActionListener(this);
				p1.add(b1);

				b2 = new JButton("Register");
				b2.setBounds(170,260,100,30);
				b2.addActionListener(this);
				p1.add(b2);
				
				b3 = new JButton("Forgot Password");
				b3.setBounds(300, 400,170,30);
				b3.addActionListener(this);
				p1.add(b3);
	
				b4 = new JButton("Back");
				b4.setBounds(0, 400, 100, 30);
				b4.addActionListener(this);
				p1.add(b4);
				
				f.add(p1);
			}

		public boolean checkData() {
			if(t1.getText().equals("") || t2.getText().equals(""))
				{
				JOptionPane.showMessageDialog(null,"Every Empty field must be filled.");
					return false;
					}
			else 
				return true;
				
			}		

		
		
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b1) {
						if(checkData()) {
										StudentDetails studentDetails2 = new StudentDetails();
										studentDetails2.loginStudentData(this);
										f.dispose();
								}
		
				}
					if(e.getSource()==b2) {
							new StudentRegisterNewAccount();
							f.dispose();
						}
			
				if(e.getSource()==b3) {
					JOptionPane.showMessageDialog(f,"Please visit to your department to recover your password.");
						}
				
				if(e.getSource()==b4) {
								new Body();
								f.dispose();
							}
		}

			}
