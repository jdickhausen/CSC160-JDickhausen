import java.util.Scanner;

public class Exercise1 {
	
	public static void main(String[] args) {
		System.out.println("Choose a number: ");
		Scanner chosenNumber = new Scanner (System.in);
		int playerChoice = chosenNumber.nextInt();
		isPositive(playerChoice);
	}
	public static boolean isPositive(int playerChoice) {
		if(playerChoice < 0) {
			System.out.println ("Your number is negative");
			return false;
		}
		else if (playerChoice == 0) {
			System.out.println("Neither - your nunber is 0");
			return false;	
		}
		else {
			System.out.println("Your number is positive");
			return true;
		}
		
	}
}