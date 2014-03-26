package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

	  public static void main(String[] args) {
	        Connection connection = null;
	        Statement selectStmt = null;
	        try
	        {
	            Class.forName("com.mysql.jdbc.Driver");
	            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bazadate", "root", "student");
	             
	            selectStmt = connection.createStatement();
	            ResultSet rs = selectStmt.executeQuery("SELECT * FROM users");
	            while(rs.next())
	            {
	            	
	            	System.out.println(rs.getString("id")+ " " + rs.getString("username"));
	            }
	        } 
	        catch (Exception e) {
	            e.printStackTrace();
	        }finally {
	            try {
	                selectStmt.close();
	                connection.close();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    }

}
