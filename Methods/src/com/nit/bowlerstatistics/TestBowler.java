package com.nit.bowlerstatistics;

import java.util.Scanner;

public class TestBowler {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Bowler Name: ");
		String name = sc.nextLine();
		
		System.out.print("Wickets: ");
		int wickets = sc.nextInt();
		
		System.out.print("Matches: ");
		int matches = sc.nextInt();
		
		System.out.print("Balls Bowled: ");
		int balls_bowled = sc.nextInt();
		
		System.out.print("Runs Conceded: ");
		int runs_conceded = sc.nextInt();
		
		Bowler bowler1 = new Bowler();
		bowler1.bowlerDetails(name, wickets, matches, balls_bowled, runs_conceded);
		
		bowler1.computeBowlingAverage();
		bowler1.computeStrikeRate();
		bowler1.showStatistics();
		
		sc.close();
		
	}
	
}
