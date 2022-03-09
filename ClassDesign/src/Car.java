
public class Car {
	// Data members
	//Cannot access data members directly from outside with private
	private String color;
	private double amountOfGas;
	private int mileage;
	
	// Constructors
	public Car() {
		color = "Green";
		amountOfGas = 12.0;
	}
	public Car(String requestedColor) {
		color = requestedColor;
	}
	public Car(String orderedColor, double amountOfGas) {
		color = orderedColor;
		this.amountOfGas = amountOfGas;
	}
	// Accessors
	// Getters and Setters
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
