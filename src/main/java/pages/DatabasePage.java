package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabasePage {

	Connection connection;
	Statement statement;
	ResultSet resultSet;
	String columnValue;
	ArrayList<String> columnValueList;
	
	
	public String getDataFromDatabase(String columnName) {
		//com.mysql.cj.jdbc.Driver call the driver (jdbc connector)
		try {
			
		//set properties for MySql	
			Class.forName("com.mysql.cj.jdbc.Driver");
		//	String sqlUrl = "jdbc:mysql:// + hostName: + portNumber/ + databaseName";
			String sqlUrl = "jdbc:mysql://44.195.13.80:3306/june_2023";
			
			String sqlUsername = "student";
			String sqlPassword = "Student@123";
			String sqlQuery = "SELECT * FROM login_data WHERE user_id=1;";
			
		//create a connection to DB	
			connection = DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword);
			
		//Empower connection reference variable to execute queries
			statement = connection.createStatement();
			
		//Execute query
			resultSet = statement.executeQuery(sqlQuery);
			
			while(resultSet.next()) {
			columnValue =	resultSet.getString(columnName);
			
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(resultSet!=null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return columnValue;
		
	}
	
	
	
	
}
