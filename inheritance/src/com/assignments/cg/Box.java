package com.assignments.cg;

import java.util.Scanner;

public class Box {
		double length;
		double breadth;
		double height;
		Box(Object obj){
			this.length=length;
			this.breadth=breadth;
			this.height=height;
			
		}
		static void boxvolume(){

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of the box");
		double l=sc.nextDouble();
		System.out.println("enter the breadth of the box");
		double b=sc.nextDouble();
		System.out.println("enter the height of the box");
		double h=sc
				.nextDouble();
		double volume=l*b*h;
		System.out.println("volume of the box:"+volume);
		}
		public static void main(String args[])
		{
		boxvolume();
		}
	}



