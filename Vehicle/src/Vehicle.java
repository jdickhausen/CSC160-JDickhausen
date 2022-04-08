
public class Vehicle {
	
	private int minSpeed;
	private int maxSpeed;
	private String vin;
	
	public Vehicle(int minSpeed, int maxSpeed, String vin) {
		this.minSpeed = minSpeed;
		this.maxSpeed = maxSpeed;
		this.vin = vin;
	}
	public Vehicle() {
		this.minSpeed = 0;
		this.maxSpeed = 100;
		this.vin = "A1B2C3";
	}
	public int getMinSpeed() {
		return minSpeed;
	}
	public void setMinSpeed(int minSpeed) {
		this.minSpeed = minSpeed;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public String getVin() {
		return vin;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public void drive(int n) {
		n = 3;
		for (int i = 1; i <= n; i++) {
			System.out.print("+");
		}
	}
	public String toString() {
		return "Vehicle minSpeed = " + minSpeed + ", maxSpeed = " + maxSpeed + ", vin = " + vin;
	}
	
}
