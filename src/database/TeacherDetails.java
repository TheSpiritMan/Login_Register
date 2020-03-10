package database;

import java.sql.*;
import javax.swing.*;
import teacher.*;


		
public class TeacherDetails{
	private static Connecting c=new Connecting("root","");
		public  void saveTeacherData(TeacherRegisterNewAccount rf){
			
			try {
				String name = rf.tf2.getText();
				String address = rf.tf3.getText();
				String program = rf.tf4.getText();
				String contactno = rf.tf5.getText();
				String idno = rf.tf6.getText();
				String pass = rf.tf7.getText();
				
				String generatedSecuredPasswordHash = BCrypt.hashpw(pass, BCrypt.gensalt(12));
				
				
				String query="insert into TeacherDetails values(?,?,?,?,?,?)";
				PreparedStatement preparedStatement = c.connection.prepareStatement(query);
				
				
					preparedStatement.setString(1,name);
					preparedStatement.setString(2,address);
					preparedStatement.setString(3,program);
					preparedStatement.setString(4,contactno);
					preparedStatement.setString(5,idno);
					preparedStatement.setString(6,generatedSecuredPasswordHash);

					
					int rowid=preparedStatement.executeUpdate();
						
						if(rowid>0) {
							JOptionPane.showMessageDialog(null,"Registered Successfully.Now you can continue by logging in");
							new TeacherLogin();
							System.out.println("Done");
								}
				System.out.println("done");
				}catch (Exception m) {
							System.out.println(m);
							}
					}
		
		//LoggingProcess
		public void loginTeacherData(TeacherLogin rf){
			try {
						String idno = rf.t1.getText();
						String pass = rf.t2.getText();
						
						String query="select * from TeacherDetails where idno = ?";	
						PreparedStatement preparedStatement = c.connection.prepareStatement(query);
						
						preparedStatement.setString(1,idno);
							
							try {	
								ResultSet result = preparedStatement.executeQuery();
								if(result.next()) {
									if(BCrypt.checkpw(pass, result.getString("password"))){		
											
											JOptionPane.showMessageDialog(null,"Login Successfully.");
											System.out.println("Login Done");
											}
									else {
										JOptionPane.showMessageDialog(null,"Password Didn't Match");
									}
										}
								else {
									JOptionPane.showMessageDialog(null,"User not registered");
										}
							}catch (Exception e) {
								// TODO: handle exception
							}
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	
		}