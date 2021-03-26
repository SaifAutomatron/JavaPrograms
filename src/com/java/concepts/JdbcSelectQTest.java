package com.java.concepts;

import java.sql.*;

public class JdbcSelectQTest {

	public static void main(String[] jdbc) throws Throwable {
		
		
		Connection connection = null;
	     try {
					/*step-1  : load or register the data base*/
	    	        Class.forName("com.mysql.cj.jdbc.Driver");

					/*step-2  : connect to database*/
					connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/saif", "root", "root");
					System.out.println("Database Connected");
					
					/*step-3  : create/issue SQL statement*/
					Statement stat = connection.createStatement();
					String query = "select * from sdet";
					
					/*step-4  : execute query*/
					 ResultSet resultSet =  stat.executeQuery(query);
					   while (resultSet.next()) {
						  System.out.println(resultSet.getInt(1) + "\t" + resultSet.getNString(2)+ "\t" +  resultSet.getNString(3));
						
				       }
	          }catch (Exception e) {
					       e.printStackTrace();
				   }finally {
				 		/*step-5  : close the Connection*/
					   connection.close();
						System.err.println("Connection closed");
					}



	}

}
