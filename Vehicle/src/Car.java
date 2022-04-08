
public class Car extends Vehicle{
	
	private String trim;

	public Car() {
		
	}
	public Car(int minSpeed, int maxSpeed, String vin, String trim) {
		super(minSpeed, maxSpeed, vin);
		this.trim = trim;
	}
	public String getTrim() {
		return trim;
	}
	public void setTrim(String trim) {
		this.trim = trim;
	}
	public int drive(int miles, int fuel) {
		super.drive(miles);
		
		int newFuel = fuel - miles;
		
		return newFuel;
	}
	@Override
	public String toString() {
		return "Car trim = "+ trim;
	}
}
