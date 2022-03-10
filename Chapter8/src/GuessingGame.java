import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		int lower = 10;
		int upper = 20;
		int random = randomNumber(lower, upper);
		
		
		Scanner input = new Scanner (System.in);
		System.out.println("Guess a number between " + lower + " and " + upper);
		int guess = 0;
		int points = 5;
		
		while (guess != random) {
			guess = input.nextInt();
			if (guess < lower) {
				System.out.println("You guessed too low.");
			}
			else if ( guess > upper) {
				System.out.println("You guessed too high.");
			}
			else if (guess != random) {
				System.out.println("Incorect, try again!");
				points--;
			}
			if (points < 0) {
				points = 0;
			}
		}
		System.out.println("You got it! You got " + points + " points.");
	}
	public static int randomNumber(int lower, int upper) {
		lower = 10;
		upper = 20;
		int random = (int) (Math.random() * (upper - lower)) + lower;
		return random;
	}
}
