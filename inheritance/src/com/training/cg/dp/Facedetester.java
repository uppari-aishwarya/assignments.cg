package com.training.cg.dp;

public class Facedetester {
	public static void main(String args[]) {
		Hotelkeeper hk=new Hotelkeeper();
		hk.getVegmenu();
		System.out.println("the veg items are:"+hk.getVegmenu());
		hk.getNonVegmenu();
	}

}
