import java.util.Scanner;

public class SumIntFor {
	public static void main(String[] args) {
		System.out.println("What number do you choose?");
		Scanner playerChoice = new Scanner(System.in);
		int chosenNumber = playerChoice.nextInt();
		int addNumber = 0;
		for(int i=1; i<=chosenNumber; i++) {
			addNumber = addNumber + i;
			//System.out.print(i + " + ");
			if (i < chosenNumber) {
				System.out.print(i + " + ");
			}
			else {
				System.out.print(i + " = ");
			}
			
			//System.out.print(i + chosenNumber);
		}
		System.out.print(addNumber);
	}
}
