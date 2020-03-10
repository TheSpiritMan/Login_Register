package database;

import java.sql.*;
import javax.swing.*;
import student.*;


public class StudentDetails {
	public static Connecting c=new Connecting("root","");
	//RegistratingProcess
		public  void saveStudentData(StudentRegisterNewAccount rf){
		
			try {
				String name = rf.tf2.getText();
				String address = rf.tf3.getText();
				String program = rf.tf4.getText();
				String contactno = rf.tf5.getText();
				String rollno = rf.tf6.getText();
				String pass = rf.tf7.getText();
				
				String generatedSecuredPasswordHash = BCrypt.hashpw(pass, BCrypt.gensalt(12));
	
				String query="insert into StudentDetails values(?,?,?,?,?,?)";
				PreparedStatement preparedStatement = c.connection.prepareStatement(query);
		
		
			preparedStatement.setString(1,name);
			preparedStatement.setString(2,address);
			preparedStatement.setString(3,program);
			preparedStatement.setString(4,contactno);
			preparedStatement.setString(5,rollno);
			preparedStatement.setString(6, generatedSecuredPasswordHash);

			
			int rowid=preparedStatement.executeUpdate();
				
				if(rowid>0) {
					JOptionPane.showMessageDialog(null,"Registered Successfully.Now you can continue by logging in");
					new StudentLogin();
					System.out.println("Done");
						}
		System.out.println("done");
		}
			catch (Exception m) {
					System.out.println(m);
					}
			}
		
	//LoggingProcess
			public void loginStudentData(StudentLogin rf) {
				try {
					String rollno = rf.t1.getText();
					String pass = rf.t2.getText();
					
				String query="select * from StudentDetails where rollno = ?";	
				PreparedStatement preparedStatement = c.connection.prepareStatement(query);
				
				preparedStatement.setString(1,rollno);
				
						try {
							ResultSet result = preparedStatement.executeQuery();
						if(result.next()) {
							if(BCrypt.checkpw(pass, result.getString("password"))){
									JOptionPane.showMessageDialog(null,"Login Successfully.");
									System.out.println("Login Done");
									System.out.println("Logged In Successfully");	
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
				}catch (SQLException e) {
					// TODO: handle exception
				}
			}
		
		
}