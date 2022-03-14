
public class Car {
	// Data members
	//Cannot access data members directly from outside with private
	private String color;
	private double amountOfGas;
	private int mileage;
	
	// Constructors
	public Car() {
		color = "Green";
		amountOfGas = 10.0;
		mileage = 10;
	}
	public Car(String requestedColor) {
		this.color = requestedColor;
	}
	public Car(String orderedColor, double amountOfGas, int mileage) {
		super();
		this.color = orderedColor;
		this.amountOfGas = amountOfGas;
		this.mileage = mileage;
	}
	// Accessors and Mutators
	// Getters and Setters
	// need getters and setters because data members are private
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	// Methods
	public void selfClean() {
		System.out.println("Clean car!!, CleanCar!!, Clean Car!!");
	}
}
