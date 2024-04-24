package com.nit.bowlerstatistics;

public class Bowler {

	private String name;
	private int wickets;
	private int matches;
	private int balls_bowled;
	private int runs_conceded;

	public void bowlerDetails(String name, int wickets, int matches, int balls_bowled, int runs_conceded) {
		this.name = name;
		this.wickets = wickets;
		this.matches = matches;
		this.balls_bowled = balls_bowled;
		this.runs_conceded = runs_conceded;
	}

	public void computeBowlingAverage() {
		if (runs_conceded < 0 || wickets < 0)
			System.out.println("Error");
		else if ((runs_conceded > 0 || wickets > 0) && matches == 0)
			System.out.println("Error");
		else
			System.out.println("\nName: " + name + "\nBowling Avg. = " + (1.0f * runs_conceded / wickets));
	}

	public void computeStrikeRate() {
		if (runs_conceded < 0 || balls_bowled < 0)
			System.out.println("Error");
		else if ((runs_conceded > 0 || balls_bowled > 0) && matches == 0)
			System.out.println("Error");
		else
			System.out.println("\nName: " + name + "\nStrikerate = " + (1.0f * runs_conceded / balls_bowled));
	}
	
	public void showStatistics() {
		if (runs_conceded < 0 || balls_bowled < 0 || wickets < 0 || matches < 0)
			System.out.println("Error");
		else if ((runs_conceded > 0 || balls_bowled > 0) && matches <= 0)
			System.out.println("Error");
		else
			System.out.println("\nName = " + name + "\nWickets = " + wickets + "\nMatches = " + matches
					+ "\nBalls Bowled = " + balls_bowled + "\nRuns Conceded = " + runs_conceded);
	}

}
