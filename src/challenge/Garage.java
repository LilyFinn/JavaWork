package challenge;

import java.util.ArrayList;

public class Garage {

	public ArrayList<Vehicle> vehicles = new ArrayList<>();
	
	
public boolean addVehicle(Vehicle x) {
	boolean added = vehicles.add(x);
	return added; // my add and remove method removes by index not ID or Type
}

public  Vehicle removeVehicle(int x) {
	Vehicle removed = vehicles.remove(x);
	return removed;
}
 	
	public void calculateBill(int  numberOfWheels) {
	float	Price = 10.80F;
		float total = Price * numberOfWheels;
		
		System.out.println("Total: £");
		System.out.println(total);
	}

	public void print () {
		System.out.println("Vehicles: ");
		for (Vehicle v : this.vehicles) {
			v.print();
			
			calculateBill(v.getWheels());
		}
		
		}
		
	public void clearVehicles () {
		vehicles.clear();
		
	}
	}
	

	
