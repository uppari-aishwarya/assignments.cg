package com.assignments.cg;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side ");
		double side=sc.nextDouble();
		System.out.println("Enter the height ");
		double height=sc.nextDouble();
		System.out.println("Enter the radius ");
		double radius=sc.nextDouble();

		Shape c=new Circle(radius,"Circle");
		double circle=c.getArea();
		System.out.println("Area of a circle = "+ circle);

		Shape sq=new Square(side,"Square");
		double square=sq.getArea();
		System.out.println("Area of  a square = "+ square);

		Shape cy=new Cylinder(height,radius,"Cylinder");
		double cylinder=cy.getArea();
		System.out.println("Volume of a Cylinder = "+ cylinder);

		Shape sp=new Sphere(radius,"Sphere");
		double sphere=sp.getArea();
		System.out.println("Volume of a sphere = "+ sphere);

		Shape cu=new Cube("Cube",side);
		double cube=cu.getArea();
		System.out.println("Volume of  a cube = "+ cube);

		Shape g=new Glome(radius,"Glome");
		double glome=g.getArea();
		System.out.println("Volume of a glome = "+ glome);

	}

}

