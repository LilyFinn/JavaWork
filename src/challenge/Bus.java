package challenge;

public class Bus extends Vehicle{

	public Bus(int id,  int wheel, String colour, String model) {
		super(id, wheel, colour, model);	
		}
	
	
	public Bus() {}
	
	@Override 
	public void engineSize() {
		System.out.println("large");
	}
	
	
	
}
