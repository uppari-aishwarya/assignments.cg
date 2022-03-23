package com.assignments.cg;

public class Circle extends Shape implements Area {
	public double radius;
	Circle()
	{
	}
	
	Circle(Double radius,String n){
		this.name=name;
		this.radius=radius;
	}
	@Override
	public double getArea() {
		double a;
		a=Math.PI*(radius*radius);
		return a;
	}
	
	}


