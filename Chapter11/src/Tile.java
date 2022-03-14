
public class Tile {
	private char letter;
	private int value;
	
	public static void main(String[] args) {
		Tile tester = new Tile('z', 10); // test is tile object that prints 'z' and '10'
		printTile(tester); // displays states of object
	}
	// initializes variables
	public Tile(char letter, int value) {
		this.letter = letter;
		this.value = value;
	}
	// takes tileObject is Tile object taken as parameter
	// displays out instance variables
	public static void printTile(Tile tileObject) {
		System.out.print("The letter is: " + tileObject.letter + " and it is worth " + tileObject.value + " points.");
	}
	// gets String representation of object
	public String toString() {
		return this.letter + " and " + this.value;
	}
	public boolean equals(Tile that) {
		return this.letter == that.letter && this.value == that.value;
	}
	// getters and setters
	public char getLettter() {
		return letter;
	}
	public void setLetter(char letter) {
		this.letter = letter;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}
