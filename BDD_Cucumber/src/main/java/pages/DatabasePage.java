package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePage {

	Connection connection;
	Statement statement;
	ResultSet resultset;
	String columnValue;
	
	public String getDataFromDb(String columnName) {
		
		
//	set the properties of mySQL
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			String sqlUrl = "jdbc:mysql://localhost:3306/december2021";
			String sqlUsername = "root";
			String sqlPassword = "root";
			String sqlQuery = "select * from users";
		
// create a connection to the local database
			connection = DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword);
// Empower the connection reference variable to execute queries
		    statement = connection.createStatement();
//	Deliver the query
			resultset = statement.executeQuery(sqlQuery);
			
			while (resultset.next()) {
			    return columnValue = resultset.getString(columnName);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(resultset !=null) {
				try {
					resultset.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				}
			if(connection !=null) {
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
