import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		
		System.out.println("Choose any number with a decimal: ");
		Scanner input;
		input = new Scanner(System.in);
		
		double chosenNumber = input.nextDouble();
		
		System.out.print("Your number is ");
		
		if(chosenNumber == 0) {
			System.out.println("zero");
		}
		else if (chosenNumber > 0) {
			System.out.print("positive");
		}
		else{
			System.out.print("negative");
		}
		if (Math.abs(chosenNumber)< 1) {
			System.out.print(" and small");
		}
		if (Math.abs(chosenNumber)> 1000000) {
			System.out.println(" and large");
		}
	}
}
