package com.nit.batsmanstatistics;

public class Batter {

	private String name;
	private int runs;
	private int matches;
	private float batting_avg;
	
	public void batterDetails(String name, int runs, int matches) {
		this.name = name;
		this.runs = runs;
		this.matches = matches;
	}
	
	public void computeBattingAverage() {
		batting_avg = (1.0f * runs) / matches;
		if(runs < 0 || matches < 0) System.out.println("Error");
		else if(runs > 0 && matches == 0) System.out.println("Error");
		else System.out.println("\nName: " + name + "\nBatting Avg: " + batting_avg);
	}
	
	public void getStatistics() {
		if(runs < 0 || matches < 0) System.out.println("Error");
		else if(runs > 0 && matches == 0) System.out.println("Error");
		else System.out.println("\nName: " + name + "\nRuns: " + runs + "\nMatches: " + matches);
	}
	
}
