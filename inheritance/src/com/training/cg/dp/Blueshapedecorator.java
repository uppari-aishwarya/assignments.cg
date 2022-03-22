package com.training.cg.dp;

public class  Blueshapedecorator extends Shapedecorated{

	
		public Blueshapedecorator(Shape decoratedShape){
		super(decoratedShape)	;
		}
		@Override
		public void draw() {
			decoratedShape.draw();
		
		 setBlueBorder( decoratedShape);	
		}

private void setBlueBorder(Shape decoratedShape) {
	System.out.println("shape border color:blue");
}
}
