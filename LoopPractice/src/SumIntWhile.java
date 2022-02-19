import java.util.Scanner;

public class SumIntWhile {
	public static void main(String[] args) {
		
		Scanner input;
		input = new Scanner(System.in);
		int chosenNumber;
		int addNumber = 1;
		int sum = 0;
		
		System.out.println("What number do you choose?");
		chosenNumber = input.nextInt();
		
		while(chosenNumber >= addNumber) {
			
			if(chosenNumber > addNumber) {
				System.out.print(addNumber + " + ");
			}
			else {
				System.out.print(addNumber + " = ");
			}
			sum = sum + addNumber;
			addNumber++;
		}
		System.out.print(sum);
	}
	
}
