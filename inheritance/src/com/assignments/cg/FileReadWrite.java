package com.assignments.cg;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWrite{
	@SuppressWarnings("resource")
	public static void main(String[] args) {

	//reading input from user
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the message which you want to store in file");
	String s =  sc.next();
	String s1= s.toUpperCase();

	try {

	//writing the input taken from user to the file created
	BufferedWriter fw = new BufferedWriter(new FileWriter("file1.txt"));

	fw.write(s1);
	fw.close();
	//displaying contents of the file
	BufferedReader br= new BufferedReader(new FileReader("file1.txt"));
	int arr;

	System.out.println("Displaying the contents of file.......");
	br.lines().forEach(System.out::print);  
	br.close();
	} catch (IOException e) {
	// TODO Auto-generated catch bloca
	e.printStackTrace();
	}


	}

}


