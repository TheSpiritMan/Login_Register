package database;

	import java.sql.*;
	import javax.swing.*;

	public class Connecting {
				public Connection connection ;
				public Connecting(String username,String password) {

					try{
						Class.forName("com.mysql.jdbc.Driver");
						System.out.println("Driver Loaded");
						connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/L_R",username,password);
						System.out.println("Connection Established.");
					}
					catch(ClassNotFoundException e){
						System.out.println("Driver is not Loaded.");
						System.out.println("Exception : "+e.getMessage());
					}
					catch(SQLException e){
						JOptionPane.showMessageDialog(null, "Can't connect to server.");
						System.out.println("Connection is not established : "+e.getMessage()+"\n\n"+e);
					}
					
				}
				
						
	}



