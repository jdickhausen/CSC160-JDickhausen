import java.util.Scanner;

public class FactorialFor {
	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		int chosenNumber;
		int total = 1;
		
		System.out.print("Choose a number: ");
		chosenNumber = input.nextInt();
		for(int i = 0; i <= chosenNumber; i++) {
			total = total*i;
		}
		System.out.print(total);
	}

}
