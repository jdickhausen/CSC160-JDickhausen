import java.util.Random;

public class Die extends DiceGame{
	private int numSides;
	private int value;
	
	public Die() {
		numSides = 6;
		value = 1;
	}
	
	public Die (int numSides) {
		this.numSides = numSides;
		value = 6; 
	}
	public int getNumSides() {
		return numSides;
	}

	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	public static int roll() {
		Random random = new Random();
		int value;
		return value = random.nextInt();
	}
	@Override
	public String toString() {
		roll();
		return "Die numSides = " + numSides + ", value = " + value;
	}
}
