package com.nit.batsmanstatistics;

import java.util.Scanner;

public class TestBatsman {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Runs: ");
		int runs = sc.nextInt();
		
		System.out.print("Matches: ");
		int matches = sc.nextInt();
		
		Batter batter1 = new Batter();
		batter1.batterDetails(name, runs, matches);
		
		batter1.computeBattingAverage();
		batter1.getStatistics();
		
		sc.close();
	}
	
}
