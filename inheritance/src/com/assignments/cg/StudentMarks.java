package com.assignments.cg;

import java.util.Scanner;

public class StudentMarks {
	private static final Exception RangeException = null;
	public static String name;
	StudentMarks()
	{
		
	}
	public static void main(String args[]) throws Exception
	{
		double marks[]=new double[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name ");
		name=sc.nextLine();
		System.out.println("Enter the marks in 6 subjects");
		for(int i=0;i<6;i++)
		{
			marks[i]=sc.nextDouble();
		}
		double sum=0;
		for(int i=0;i<6;i++)
		{
			if(marks[i]>=0 && marks[i]<=50)
			{
				
				sum+=marks[i];
				
			}
			else
				{
					System.out.println("Marks cant be lesser than 0 or be greater than 50");
					throw RangeException;
					
				}
		}
		double p;
		p=(sum/3);
		System.out.println("the total marks are="+sum);
		System.out.println(" Percentage= "+p+"%");
	}

}
