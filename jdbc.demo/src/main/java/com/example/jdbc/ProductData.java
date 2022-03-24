package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductData {
	public static void main(String args[]) {
		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/aishwarya";
			String userName="postgres";
			String password="Daddy@1101";
			Connection con=DriverManager.getConnection(url,userName,password);
			if(con!=null) {
			System.out.println("successfully connected::")	;
			}
			else {
				System.out.println("not successfully connected::")	;
			}
		Statement stmt=con.createStatement();
		deleteRow(stmt);
		//updateRow(stmt);
		//insertTable(stmt);
		//createTable(stmt);
		ResultSet rs=stmt.executeQuery("select *from Person");
		while(rs.next()) {
		System.out.println("ID:"+rs.getString("pers_id")+" Name:"+rs.getString("pers_name")+"Age:"+rs.getString("age"));
		}
		/*while(rs.next()) {
			System.out.println("ID:"+rs.getString("prod_id")+" Name:"+rs.getString("prod_name"));
		}*/
		}
	catch(Exception e)	{
		e.printStackTrace();
	}
	}
	public static void createTable(Statement stmt) {
	String query="create table Person(pers_id varchar(4) primary key,"+"pers_name varchar(20) not null,"+"age numeric(2))";
	try {
	stmt.execute(query)	;
	System.out.println("table successfully created");
	}
	catch (SQLException e)	{
		e.printStackTrace();
	}

}
	public static void insertTable(Statement stmt) {
		String query="insert into Person values('2','sanju','22'),('3','bharu','20'),('4','manasa','23')";
 try {
			stmt.execute(query);
			System.out.println("values inserted successfully");
			}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static void updateRow(Statement stmt) {
		String query="update Person set age=19 where pers_id='3'"; 
		 try {
				stmt.execute(query);
				System.out.println("row updated successfully");
				}
			catch(SQLException e) {
				e.printStackTrace();
			}
	}
	public static void deleteRow(Statement stmt) {
		String query="delete from Person where age=22";
		 try {
				stmt.execute(query);
				System.out.println("row deleted successfully");
				}
			catch(SQLException e) {
				e.printStackTrace();
			}
	}

}

