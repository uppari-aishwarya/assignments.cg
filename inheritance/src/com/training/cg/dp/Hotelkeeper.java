package com.training.cg.dp;

public class Hotelkeeper {
	public Vegmenu getVegmenu() {
		Vegrestaurent v=new Vegrestaurent();
		Vegmenu vm=(Vegmenu)v.getMenus();
		return vm;
		
	}
	public NonVegmenu getNonVegmenu() {
		NonVegrestaurent v=new NonVegrestaurent();
		NonVegmenu nvm=(NonVegmenu)v.getMenus();
		return nvm;
	}

}
 