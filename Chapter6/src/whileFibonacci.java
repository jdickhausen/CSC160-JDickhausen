import java.util.Scanner;

public class whileFibonacci {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner input;
		input = new Scanner(System.in);
		int firstNum = 1;
		int secondNum = 1;
		
		int n = input.nextInt();
		int numTerms = 1;
		
		
		while (n >= numTerms) {
	
			int newNum = (firstNum + secondNum);
			firstNum = secondNum;
			secondNum = newNum;
			
			System.out.print(firstNum);
			
			if (numTerms < n) {
				System.out.print(", ");
			}
			
			numTerms++;
		}
	}
}
