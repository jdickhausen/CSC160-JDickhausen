import java.util.Scanner;

public class ForFibonacci {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner input;
		input = new Scanner(System.in);
		int firstNum = 1;
		int secondNum = 1;
		
		int n = input.nextInt();
		
		
		for(int i = 1; i <= n; ++i) {
			System.out.print(firstNum);
			
			int newNum = (firstNum + secondNum);
			firstNum = secondNum;
			secondNum = newNum;
			
			if (i < n) {
				System.out.print(", ");
			}
		}
	}
}
