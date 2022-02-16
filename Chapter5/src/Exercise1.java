import java.util.Scanner;

public class Exercise1 {
	
	
	public static boolean isNumberPositive(int chosenNumber) {
		System.out.println ("Enter a number: ");
		Scanner userNumber = new Scanner(System.in);
		chosenNumber = userNumber.nextInt();
		if (chosenNumber < 0) {
			System.out.println ("Your number " +chosenNumber + " is negative");
			return false;
		}
		else{
			System.out.println("Your number " + chosenNumber + " is positive");
			return true;
		}
	}
	public static void main(String[] args) {
		if(isNumberPositive = true) {
		System.out.println("Your number is positive");
	}
}