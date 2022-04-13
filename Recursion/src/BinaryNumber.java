
public class BinaryNumber {
	public static void main(String[] args) {
		displayBinary(13);
	}
	public static void displayBinary(int n) {
		if (n > 0) {
			displayBinary(n/2);
			System.out.println(n%2);
		}
	}
}
