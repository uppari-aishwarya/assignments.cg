package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class orders {
	public static void main(String args[]) {
		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/aishwarya";
			String userName="postgres";
			String password="Daddy@1101";
			Connection con=DriverManager.getConnection(url,userName,password);
			Statement stmt=con.createStatement();

			if(con!=null) {
			System.out.println("successfully connected::")	;
			}
			else {
				System.out.println("not successfully connected::")	;
			}

}
		catch(Exception e)	{
			e.printStackTrace();
		}
	}
}
		
