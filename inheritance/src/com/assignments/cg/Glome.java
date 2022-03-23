package com.assignments.cg;

import java.util.Scanner;

public class Glome extends Sphere implements Volume {
	double radius;
	String name;
	Glome(double radius,String name){
		this.radius=radius;
		this.name=name;
		
	}
	public double getVolume() {
		double v;
		v=0.2*(Math.PI*Math.PI)*(Math.pow(radius, 4));
		return v;
	}

}
