package challenge;

import java.util.ArrayList;

public class Garage {

	public ArrayList<Vehicle> vehicle = new ArrayList<>();
	
	
	public void addVehicle(Vehicle vehicle) {
		this.vehicle.add(vehicle);
	}
	
	public void removeVehicle(Vehicle vehicle) {
		this.vehicle.remove(vehicle);
	}
	
	

}
