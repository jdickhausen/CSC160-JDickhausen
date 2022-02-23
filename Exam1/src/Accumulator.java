import java.util.Scanner;

public class Accumulator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("When you press 0, you will get the sum of your numbers.");
		System.out.println("Choose any integer: ");
		
		int chosenNumber = input.nextInt();
		int sum = chosenNumber;
		
		while (chosenNumber != 0) {
			 chosenNumber = input.nextInt();
			 sum = sum + chosenNumber;
		}
		System.out.print("The sum of your numbers is " + sum);
	}

}
