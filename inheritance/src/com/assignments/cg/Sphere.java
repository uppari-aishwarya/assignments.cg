package com.assignments.cg;

public class Sphere extends Circle implements Volume {
Sphere()
{
}

	Sphere(Double radius,String name)
	{
		this.name=name;
		this.radius=radius;
		
		
	}
	@Override
	public double getVolume() {
		double v;
		v=(4/3)*Math.PI*(radius*radius);
		return v;
	}

}
