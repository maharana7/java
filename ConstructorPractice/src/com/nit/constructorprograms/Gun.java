package com.nit.constructorprograms;

public class Gun {
	
	String name;
	String type;
	double range;
	
	Gun(String name, String type, int range){
		this.name = name;
		this.type = type;
		this.range = range;
	}
	
	String displayDetails() {
		return "Name:"+ name + ", Type:" + type + ", Range:" + range + "\n"; 
	}
	
	public static void main(String[] args) {
		Gun firstGun = new Gun("Kar98K", "Sniper", 10000);
		Gun secondGun = new Gun("M416", "Rifle", 200);
		Gun thirdGun = new Gun("P90", "Machine Gun", 500);		
		
		System.out.println(firstGun.displayDetails());
		System.out.println(secondGun.displayDetails());
		System.out.println(thirdGun.displayDetails());
	}

}
