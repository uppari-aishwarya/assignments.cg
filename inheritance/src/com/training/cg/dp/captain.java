package com.training.cg.dp;

public class captain {
	private static captain obj;
	private captain() {
		
	}
	public static captain getcaptain() {
		if(obj==null) {
			return new captain();
	}
	return obj;
	}
	public void play() {
		System.out.println("captain can play any number depending on match situation");
	}

}

