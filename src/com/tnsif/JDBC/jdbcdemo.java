package com.tnsif.JDBC;
/*
 * JDBC: Java Database Connection
 * connecting with DB
 * 
 * 1. JDBC-ODBC bridge:
 * 2. 
 * 3. Java to Network protocol
 * 4. Java to Database Protocol
 * 
 * JDBC API: java.sql package
 * 
 * 
 * Steps:
 Import the packages .
 Register/load the driver .
 Establish the connection.
 Creating JDBC Statements .
 Executing the query .
 Closing resources
 * 
 * 
 * RightCLick -> BuildPath -> Configure BuildPath -> Libraries -> ClassPath -> select the  jar file -> Apply and close
 * 
 * executeUpdate() - insertion
 * executeQuery() - for normal query
 * 
 * 
 * Work:
 * 	id
	Name
	Salary
	DOB
	DOJ
	Department
	Designation 
	Projects  
	DOR
	CRUD OPerations
 * 
 * */
import java.sql.*;

public class jdbcdemo {

	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/jdbcdemo";
		String un="root";
		String pas="Abhijit2030@mysql";
		try {
		Connection con = DriverManager.getConnection(url,un,pas);
		
		String q="select * from emp";
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery(q);
		
		rs.next();
		System.out.println("ID is: "+rs.getInt(1));
		System.out.println("Name is: "+rs.getString(2));
		System.out.println("Salary is: "+rs.getInt(3));
		con.close();
		}
		catch(SQLException e) {
			System.out.println(e);
		}

	}

}
