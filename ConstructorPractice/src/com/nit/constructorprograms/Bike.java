package com.nit.constructorprograms;

public class Bike {
	
	String brand;
	String model;
	double mileage;
	int enginePower;
	static int noOfWheels =  2;
	
	Bike(String brand, String model, double mileage, int enginePower){
		this.brand = brand;
		this.model = model;
		this.mileage = mileage;
		this.enginePower = enginePower;
	}
	
	String displayDetails() {
		return "Brand:"+ brand + ", Model:" + model + ", Mileage: "+ mileage + " Engine Power: " + enginePower + ", No. of Wheels: " + noOfWheels + "\n"; 
	}
	
	public static void main(String[] args) {
		Bike firstBike = new Bike("Kawasaki Ninja", "H2R", 10, 500);
		Bike secondBike = new Bike("TVS", "Heavy Duty", 70, 100);
		Bike thirdBike = new Bike("Honda", "Sp125", 70, 125);
		
		
		System.out.println(firstBike.displayDetails());
		System.out.println(secondBike.displayDetails());
		System.out.println(thirdBike.displayDetails());
	}

}
