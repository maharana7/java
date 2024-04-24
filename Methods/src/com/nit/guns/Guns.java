package com.nit.guns;

public class Guns {

	String gunName;
	String category;
	int magSize;
	int range;
	
	Guns(String gunName, String category, int magSize, int range){
		this.gunName = gunName;
		this.category = category;
		this.magSize = magSize;
		this.range = range;
		System.out.println(gunDetails());
	}
	
	String gunDetails() {
		return "\nGun Name: " + gunName + "\nType: " + category + "\nMag Size: " + magSize + "\nRange: " + range + "m";
	}
	
}
