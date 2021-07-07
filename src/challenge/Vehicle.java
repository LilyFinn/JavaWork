package challenge;

public class Vehicle {

	
	// attributes 
	
	private int id;
	private float price;
	private int wheels; 
	private String colour;
	private String model; 
	
	public Vehicle() {
		super();	
		}
	
	public Vehicle(int id, float price, int wheels, String colour, String model) {
		super();
		
		this.setId(id);
		this.setPrice(price);
		this.setWheels(wheels);
		this.setColour(colour);
		this.setModel(model); 
	
	}
	
	

	public void engineSize() {
		System.out.println("Unknown engine size");
	}
	
	// GETTERS & SETTERS
	
	public int getId() {
		return this.id;
	}  
	public void setId(int id) {
		this.id = id; 
	}
	
	public float getPrice() {
		return this.price;
	}
	public void setPrice(float price) {
		this.price = price; 
	}
	
	public int getWheels() {
		return this.wheels;
	}  
	public void setWheels(int wheels) {
		this.wheels = wheels; 
	}
	public String getColour() {
		return this.colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public String getModel() {
		return this.model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
}



