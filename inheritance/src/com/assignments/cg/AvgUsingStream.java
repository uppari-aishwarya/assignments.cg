package com.assignments.cg;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.IntStream;
public class  AvgUsingStream{
 
    private static Scanner scanner;
 
    public static void main(String[] args) {
 
        System.out.println("Enter how many numbers you want to use to calculate the average");
 
        scanner = new Scanner(System.in);
 
        int number = scanner.nextInt();
 
        int[] arr = new int[number];
 
        System.out.println("\nEnter numbers now\n");
        for (int i = 0; i < number; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            arr[i] = scanner.nextInt();
        }
 
        IntStream streamOfNumbers = Arrays.stream(arr);
 
        OptionalDouble averageOfNumbers = streamOfNumbers.average();
 
        System.out.println("\nAverage of Numbers: " + averageOfNumbers);
 
    }
 
 
}
