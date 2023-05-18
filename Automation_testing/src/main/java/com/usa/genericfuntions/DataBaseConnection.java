package com.usa.genericfuntions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataBaseConnection {
	public static void main(String[] args) throws Throwable {		
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "hr", "hr");		                                                                            // JDBC URL, Host Number, Database Name, UserName & Password		
		// Statement is an interface 
		Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = stmt.executeQuery("select * from employees");
	    List<String> columnValue = new ArrayList<String>(); 
		while (rs.next()) {
			columnValue.add(rs.getString("Last_Name"));
		}
	    System.out.println(columnValue); 
	    }
}
