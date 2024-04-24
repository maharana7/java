package com.nit.constructorprograms;

public class Animal {

	String name;
	String category;
	String foodType;
	int noOfLegs;

	Animal(String name, String category, String foodType, int noOfLegs) {
		this.category = category;
		this.name = name;
		this.foodType = foodType;
		this.noOfLegs = noOfLegs;
	}

	String displayDetails() {
		return "Animal:" + name + ", Category:" + category + ", Food Type:" + foodType + ", No. of Legs:" + noOfLegs
				+ "\n";
	}

	public static void main(String[] args) {
		Animal firstAnimal = new Animal("Dog", "Mammal", "Carnivorous", 4);
		Animal secondAnimal = new Animal("Cobra", "Reptile", "Carnivorous", 0);
		Animal thirdAnimal = new Animal("Shark", "Fish", "Carnivorous", 0);

		System.out.println(firstAnimal.displayDetails());
		System.out.println(secondAnimal.displayDetails());
		System.out.println(thirdAnimal.displayDetails());
	}

}
