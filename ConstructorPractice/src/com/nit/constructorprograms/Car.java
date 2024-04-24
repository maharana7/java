package com.nit.constructorprograms;

public class Car {
	
	String brand;
	String model;
	int noOfWheels;
	int noOfSeats;
	
	Car(String brand, String model, int noOfWheels, int noOfSeats){
		this.brand = brand;
		this.model = model;
		this.noOfWheels = noOfWheels;
		this.noOfSeats = noOfSeats;
	}
	
	String displayDetails() {
		return "Brand:"+ brand + ", Model:" + model + ", No. of Wheels:" + noOfWheels + ", No. of Seats:" + noOfSeats + "\n"; 
	}
	
	public static void main(String[] args) {
		Car firstCar = new Car("Lamborghini", "Urus", 4, 2);
		Car secondCar = new Car("Piaggio", "Ape Xtra LDX", 3, 4);
		Car thirdCar = new Car("Maruti Suzuki", "Dzire", 4, 4);
		
		System.out.println(firstCar.displayDetails());
		System.out.println(secondCar.displayDetails());
		System.out.println(thirdCar.displayDetails());
	}

}
