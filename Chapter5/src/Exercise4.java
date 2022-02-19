import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		
		System.out.println("Choose the number for the day of the week, 1-7: ");
		Scanner input;
		input = new Scanner(System.in);
		int chosenNumber = input.nextInt();
		chosenNumber = getWeekDay(chosenNumber);
	}
	public static int getWeekDay(int chosenNum) {
		if (chosenNum == 1) {
			System.out.print("Monday");
		}
		if (chosenNum == 2) {
			System.out.print("Tuesday");
		}
		if (chosenNum == 3) {
			System.out.print("Wednesday");
		}
		if (chosenNum == 4) {
			System.out.print("Thursday");
		}
		if (chosenNum == 5) {
			System.out.print("Friday");
		}
		if (chosenNum == 6) {
			System.out.print("Saturday");
		}
		if (chosenNum == 7) {
			System.out.print("Sunday");
		}
		return chosenNum;
	}

}
