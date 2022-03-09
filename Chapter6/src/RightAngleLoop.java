import java.util.Scanner;

public class RightAngleLoop {

	@SuppressWarnings("resource")
	
	public static int getUserNumber(int chosenNumber) {
		//getting number of rows user wants
		System.out.println("How many rows?");
		Scanner input;
		input = new Scanner (System.in);
		chosenNumber = input.nextInt();
		
		return chosenNumber;
	}
	public static void main(String[] args) {
		// declaring chosenNumber and calling method
		int chosenNumber = 1;
		int chosenNum = getUserNumber(chosenNumber);
		//printing right triangle for specified number of rows
		for(int i = 1; i <= chosenNum; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}
