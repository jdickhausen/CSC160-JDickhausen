import java.util.Scanner;

public class BeverageSelector {
	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		System.out.println("Enter 1 for Water. Enter 2 for Coke. Enter 3 for Coffee.");
		int chosenNumber = input.nextInt();
		if (chosenNumber == 1) {
			System.out.println("Water");
		}
		if (chosenNumber == 2) {
			System.out.println("Coke");
		}
		if (chosenNumber == 3) {
			System.out.println("Coffee");
		}
	}
}
