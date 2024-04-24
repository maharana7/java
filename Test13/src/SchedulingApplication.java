
public class SchedulingApplication {

	public static void main(String[] args) {
		
		Vehicle vh1 = new Vehicle(100, "Hyderabad");
		System.out.println(vh1.getTotalDistanceTraveled());
		
	}
	
}

class Vehicle{
	
	double totalDistance;
	String newLocation;
	
	Vehicle(double totalDistance, String newLocation){
		this.totalDistance = totalDistance;
		this.newLocation = newLocation;
	}
	
	void recordDistance(double distance) {
		this.totalDistance += distance;
	}
	
	void updateLocation(String newLocation) {
		this.newLocation = newLocation;
	}
	
	double getTotalDistanceTraveled() {
		return totalDistance;
	}
	
	String getCurrentLocation() {
		return newLocation;
	}
	
}