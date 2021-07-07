package challenge;

public class Car extends Vehicle {

	public Car(int id, float price, int wheel, String colour, String model) {
		super(id, price, wheel, colour, model);
	}
	
	
public Car() {}
	
	@Override 
	public void engineSize() {
		System.out.println("medium");
	}
	
	
	
}
