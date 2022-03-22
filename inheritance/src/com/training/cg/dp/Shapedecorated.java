package com.training.cg.dp;

public  abstract class Shapedecorated implements Shape{
	protected Shape decoratedShape;
	public Shapedecorated(Shape decoratedShape) {
	
		this.decoratedShape=decoratedShape;
		
	}
public void draw() {
decoratedShape.draw();
}
}
