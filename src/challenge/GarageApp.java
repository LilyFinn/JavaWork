package challenge;

public class GarageApp {

	public static void main(String[] args) {
		
		Garage manager = new Garage(); 
		
		/*manager.addVehicle(new Car(1,  4, "Silver","Tesla"));
		manager.addVehicle(new Bus(2,  8, "Yellow","Honda"));
		manager.addVehicle(new Bike(3, 2, "Black","Broadman"));*/
		
		Vehicle Car1 = new Car(1, 4, "gold", "Ford"); // this has created the car object
		manager.addVehicle(Car1);	
		Vehicle Bus1 = new Bus(2,  8, "Yellow","Honda");
		manager.addVehicle(Bus1);
		Vehicle Bike1 = new Bike(3, 2, "Black","Broadman");
		manager.addVehicle(Bike1);			
		manager.print();
		
		manager.removeVehicle(0);
		manager.print();
		
		/*manager.clearVehicles();
		manager.print(); */ // this will empty the garage 
		
		
	}	
	
}
