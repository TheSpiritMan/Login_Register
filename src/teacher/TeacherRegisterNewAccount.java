package teacher;

import javax.swing.*;
import java.awt.event.*;
import database.*;

public class TeacherRegisterNewAccount implements ActionListener {
				JFrame f;
				JPanel p1;
				JLabel l1, l2, l3, l4, l5,l6,l7;
				public JRadioButton rb1, rb2, rb3;
				ButtonGroup bg;
				public JTextField  tf2,tf3,tf4, tf5, tf6,tf7;
				JButton b1, b2;
				
				
			public TeacherRegisterNewAccount() {
						f = new JFrame("Assignment   Management    System");
						f.setSize(500,500);
						f.setVisible(true);
						f.setResizable(false);
						f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						
						p1 = new JPanel();
						p1.setLayout(null);
						
						l1 = new JLabel("YOU ARE CREATING NEW ACCOUNT AS TEACHER");
						l1.setBounds(20, 0, 500,30);
						p1.add(l1);
						
						l2 = new JLabel("Name:");
						l2.setBounds(10, 50, 90, 30);
						p1.add(l2);
						
						tf2 = new JTextField("");
						tf2.setBounds(110,50,300,30);
						p1.add(tf2);
						
						l3 = new JLabel("Address:");
						l3.setBounds(10, 90,90,30);
						p1.add(l3);
						
						tf3 = new JTextField("");
						tf3.setBounds(110,90, 300, 30);
						p1.add(tf3);
						
						l4 = new JLabel("Program:");
						l4.setBounds(10,130,90,30);
						p1.add(l4);
						tf4 = new JTextField();
						
						bg = new ButtonGroup();
						rb1 = new JRadioButton("SE");
						rb2 = new JRadioButton("CE");
						rb3 = new JRadioButton("IT");
						
						bg.add(rb1);
						bg.add(rb2);
						bg.add(rb3);
						
						rb1.setBounds(110, 130, 70, 30);
						rb1.addActionListener(this);
						
						rb2.setBounds(200, 130, 70, 30);
						rb2.addActionListener(this);
						
						rb3.setBounds(290, 130, 70, 30);
						rb3.addActionListener(this);
						
						p1.add(rb1);
						p1.add(rb2);
						p1.add(rb3);
						
						
						l5 = new JLabel("Contact No.:");
						l5.setBounds(10, 170, 90,30);
						p1.add(l5);
						
						tf5 = new JTextField("");
						tf5.setBounds(110, 170, 300,30);
						p1.add(tf5);
						
						l6 = new JLabel("ID No.:");
						l6.setBounds(10,210,90,30);
						p1.add(l6);
						
						tf6 = new JTextField("");
						tf6.setBounds(110,210,300,30);
						p1.add(tf6);
						
						l7 = new JLabel("Password:");
						l7.setBounds(10, 250,90,30);
						p1.add(l7);
						
						tf7 = new JPasswordField("");
						tf7.setBounds(110, 250, 300, 30);
						p1.add(tf7);
						
						b1 = new JButton("Sign Up");
						b1.setBounds(170, 320,100,30);
						b1.addActionListener(this);
						p1.add(b1);

						b2 = new JButton("Back");
						b2.setBounds(0, 400, 100, 30);
						b2.addActionListener(this);
						p1.add(b2);
						
						f.add(p1);
				
				}

			public boolean checkData() {
				
				if(tf2.getText().equals("") || tf3.getText().equals("") || tf4.getText().equals("") || tf5.getText().equals("") || tf6.getText().equals("") || tf7.getText().equals("") )
					{
					JOptionPane.showMessageDialog(null,"Every Empty field must be filled.");
						return false;
						}
				else 
					return true;
					
				}
public void actionPerformed(ActionEvent e) {
									if(e.getSource()==rb1) {
										tf4 = new JTextField("SE");
										p1.add(tf4);
									}
										if (e.getSource()==rb2) {
										tf4 = new JTextField("CE");
										p1.add(tf4);
									}
									if (e.getSource()==rb3) {
											tf4= new JTextField("IT");
											p1.add(tf4);
									}
									
	
										if(e.getSource()==b1) {
											if(checkData()) {
												TeacherDetails teacherDetails = new TeacherDetails();
												teacherDetails.saveTeacherData(this);
												
													f.dispose();
														}
									}
		
								if(e.getSource()==b2) {
									new TeacherLogin();
									f.dispose();
										}		
	
		}
}

