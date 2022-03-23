package com.assignments.cg;

public class Square extends Shape implements Area {
	public double side;
	Square()
	{
	}
	
	Square(Double side,String name){
		this.name=name;
		this.side=side;
	}
	@Override
	public double getArea() {
		double a;
		a=side*side;
		return a;

}
}
