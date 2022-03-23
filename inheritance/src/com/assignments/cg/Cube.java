package com.assignments.cg;



public class  Cube extends Square implements Volume {
	Cube( String name,Double side){
	
		this.side=side;
		this.name=name;
	}
		@Override
		public double getVolume() {
			double v;
			v=side*side*side;
			return v;
		}
}
