package com.assignments.cg;

import java.util.Scanner;

public class MovieTicket {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome to the  movie ticket reservation app");
			System.out.println("the  available theaters are");
			System.out.println("***********1.lakshmi**********");
			System.out.println("***********2.Alankar**********");
			System.out.println("enetr the choice ");
			int choice=sc.nextInt();
			if(choice==1) {
				System.out.println(" enter into the lakshmi theater");
				System.out.println("select a movie");
				System.out.println("we have two movies");
				System.out.println("1.sankranthi  *****    2.singham");
			System.out.println("enter the choice");
				int choice2=sc.nextInt();
				if(choice2==1) {
					System.out.println("sankranthi movie in lakshmi theater");
					System.out.println("how many tickets to be booked********** each cost 80rs");
					int n=sc.nextInt();
					System.out.println("the total cost is"+n*80+"rs");
				}
				else {
					System.out.println("singam movie in laksmi theater theater");
					System.out.println("how many tickets to be booked********** each cost 80rs");
					int n=sc.nextInt();
					System.out.println("the total cost is"+n*80+"rs");
					
				}
				
				
			}
			else {
				System.out.println(" enter into the alankar theater");
				System.out.println("select a movie");
				System.out.println("we have two movies");
				System.out.println("1.drushyam  *****    2.mirchi");
				System.out.println("enter the choice2");
				int choice2=sc.nextInt();
				if(choice2==1) {
					System.out.println("drushyam movie in alankar theater");
					System.out.println("how many tickets to be booked********** each cost 100rs");
					int n=sc.nextInt();
					System.out.println("the total cost is"+n*100+"rs");
				}
				else {
					System.out.println("mirchi  movie in alankar theater");
					System.out.println("how many tickets to be booked********** each cost 150rs");
					int n=sc.nextInt();
					System.out.println("the total cost is"+n*150+"rs");
					
				}
				
				
			
			
		}
		
	}

}
