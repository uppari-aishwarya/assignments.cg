package com.example.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeData2 {
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
			PreparedStatement stmt=con.prepareStatement("insert into employeee1 values(?,?,?,?,?)");  
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
			  
			do{  
			System.out.println("enter empno:");  
			String empno=br.readLine();  
			System.out.println("enter empname:");  
			String empname=br.readLine();  
			System.out.println("enter salary:");  
			int salary=Integer.parseInt(br.readLine());  
			System.out.println("enter DESIGNATION:");  
			String designation=br.readLine();  
			System.out.println("enter DEPARTMENT:");  
			String department=br.readLine(); 
			  
			stmt.setString(1,empno);  
			stmt.setString(2,empname);  
			stmt.setInt(3,salary);  
			stmt.setString(4,designation);  
			stmt.setString(5,department); 
			int i=stmt.executeUpdate();  
			System.out.println(i+" records affected");  
			  
			System.out.println("Do you want to continue: y/n");  
			String s=br.readLine();  
			if(s.startsWith("n")){  
				break;  
			}  
			}while(true);  
			PreparedStatement stmt1=con.prepareStatement("select * from employeee1 where designation='trainer' and department='cse'");  
			ResultSet rs=stmt1.executeQuery();  
			while(rs.next()){  
			System.out.println("no:"+rs.getString(1)+"  name "+rs.getString(2)+"salary "+rs.getInt(3)+" desig"+rs.getString(4)+"dep "+rs.getString(5));  
			  
			con.close();  
			
			}  
			
		}
		
		catch(Exception e)	{
			e.printStackTrace();
		}
		
	}
}
	