package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Product {
	public static void main(String args[]) {
		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/aishwarya";
			String userName="postgres";
			String password="Daddy@1101";
			Connection con=DriverManager.getConnection(url,userName,password);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select *from Product");
			while(rs.next()) {
				Product p=new Product();
				p.setprod
System.out.println("ID:"+rs.getString("prod_id")+" Name:"+rs.getString("prod_name")+"prod_desc:"+rs.getString("prod_desc")+"price:"+rs.getString("salary"));
			}
		}
			catch(Exception e)	{
				e.printStackTrace();

}
}
}