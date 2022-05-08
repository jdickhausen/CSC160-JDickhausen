import java.util.Random;

public class Die {
	private int numSides;
	private int value;
	
	public Die() {
		numSides = 6;
		value = 1;
	}
	public Die (int numSides) {
		this.numSides = numSides;
		Random random = new Random();
		value = random.nextInt(numSides) + 1;
	}
	public Die(int numSides, int value) {
		this.numSides = numSides;
		this.value = value;
	}
	public int getNumSides() {
		return numSides;
	}

	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}
	public void roll() {
		//int value = (int) (Math.random() * numSides) + 1;
		Random random = new Random();
		value = random.nextInt(numSides) + 1;
	}
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return numSides + " " + value;
	}
	
}
