package com.training.cg.dp;

public class Decoratetest {
	public static void main(String args[])
	{
		Shape square=new Square();
		Shape blueSquare=new Blueshapedecorator(new Square());
		Shape blueRectangle=new Blueshapedecorator(new Rectangle());
		System.out.println("drawing normal square");
		square.draw();
		System.out.println("drawing  square with blue borders");
		blueSquare.draw();
		System.out.println("drawing  rectangle with blue borders");
		blueRectangle.draw();	
		
	}

}
