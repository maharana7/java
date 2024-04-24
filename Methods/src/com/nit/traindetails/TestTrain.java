package com.nit.traindetails;

public class TestTrain {

	public static void main(String[] args) {
		
		Train train1 = new Train("VandeBharat Express", 7, "Chennai", "Secunderabad");
		Train train2 = new Train("Shatabdi Express", 7.25, "Chennai", "Secunderabad");
		Train train3 = new Train("Nagavalli Express", 5.15, "Chennai", "Secunderabad");
		
		System.out.println(train1.trainDetails());
		System.out.println(train2.trainDetails());
		System.out.println(train3.trainDetails());
		
	}

}
