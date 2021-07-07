package challenge;

public class Bus extends Vehicle{

	public Bus(int id, float price, int wheel, String colour, String model) {
		super(id, price, wheel, colour, model);
	}
	
	
	public Bus() {}
	
	@Override 
	public void engineSize() {
		System.out.println("large");
	}
	
	
	
}
