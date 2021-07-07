package challenge;

public class Bike extends Vehicle{

	public Bike(int id, int wheel, String colour, String model) {
		super(id, wheel, colour, model);
	}
	
	
	public Bike() {}
	
	@Override 
	public void engineSize() {
		System.out.println("small");
	}
	
	
	
}
