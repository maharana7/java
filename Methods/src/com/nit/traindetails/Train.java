package com.nit.traindetails;

public class Train {
	
	String trainName;
	double departureTime; 
	String destination; 
	String boardingStation;
	
	Train(String trainName, double departureTime, String destination, String boardingStation){
		this.trainName = trainName;
		this.departureTime = departureTime;
		this.destination = destination;
		this.boardingStation = boardingStation;
	}
	
	String trainDetails() {
		return "\nTrain Name: " + trainName + "\nDeparture Time: " + departureTime + " PM\nDestination: " + destination 
				+ "\nBoarding Station: " + boardingStation;
	} 
	
}
