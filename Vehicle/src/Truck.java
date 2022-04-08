
public class Truck extends Vehicle{
	
	private double bedLength;
	
	public Truck() {
		super();
		bedLength = 5;
	}
	public Truck(int minSpeed, int maxSpeed, String vin, double bedLength) {
		super(minSpeed, maxSpeed, vin);
		this.bedLength = bedLength;
	}

	public double getBedLength() {
		return bedLength;
	}

	public void setBedLength(double bedLength) {
		this.bedLength = bedLength;
	}
//	@Override
//	public String toString() {
//		return "Truck bedLength = "+ bedLength;
//	}
	
}
