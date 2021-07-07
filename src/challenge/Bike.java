package challenge;

public class Bike extends Vehicle{

	public Bike(int id, float price, int wheel, String colour, String model) {
		super(id, price, wheel, colour, model);
	}
	
	
	public Bike() {}
	
	@Override 
	public void engineSize() {
		System.out.println("small");
	}
	
	
	
}
