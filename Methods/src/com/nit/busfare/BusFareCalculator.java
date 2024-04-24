package com.nit.busfare;

class BusFareCalculator {
	
	int distance;
	BusFareCalculator(int distance){
		this.distance = distance;
		displayFare();
	}

	int fareCalculator() {
		if(distance <= 15) return 70;
		else if(distance <= 21) return 70 + (distance-15)*6;
		else if(distance <= 35) return 70 + (6 * 6) + (distance - 21) * 5;
		else return 70 + (6 * 6) + (14 * 5) + (distance - 35) * 4;
	}
	
	void displayFare() {
		System.out.println("Fare to be paid: " + fareCalculator());
	}
	
}