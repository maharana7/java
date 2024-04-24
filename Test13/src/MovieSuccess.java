import java.util.Scanner;

public class MovieSuccess {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Acting Good: ");
		boolean actingGood = sc.nextBoolean();
		System.out.println("Dance Good:");
		boolean danceGood = sc.nextBoolean();
		System.out.println("Face Good: ");
		boolean faceGood = sc.nextBoolean();
		System.out.println("Talent Good: ");
		boolean talentGood = sc.nextBoolean();
		
		Actors actor1 = new Actors(name, actingGood, danceGood, faceGood, talentGood);
		System.out.println("Name: " + actor1.getActorName());
		System.out.println("Star: " + actor1.heatMovie());
		
		sc.close();
		
	}
	
}

class Actors{
	
	String name;
	boolean actingGood;
	boolean danceGood;
	boolean faceGood;
	boolean talentGood;
	public Actors(String name, boolean actingGood, boolean danceGood, boolean faceGood, boolean talentGood) {
		super();
		this.name = name;
		this.actingGood = actingGood;
		this.danceGood = danceGood;
		this.faceGood = faceGood;
		this.talentGood = talentGood;
	}
	
	String getActorName() {
		return name;
	}
	
	String heatMovie() {
		if(actingGood == true && danceGood == true && faceGood == true) {
			return "Superstar";
		}
		else if(talentGood) return "Superstar";
		else return "Flopstar";
	}
	
}
