package challenge;

public class Car extends Vehicle {

	public Car(int id, int wheel, String colour, String model) {
		super(id,  wheel, colour, model);
	}
	
	
public Car() {}
	
	@Override 
	public void engineSize() {
		System.out.println("medium");
	}
	
	
	
}
