import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {


	//public static int Guess (int playerGuess) {
		
		//return playerGuess;
	//}
	public static void main(String[] args) {
		System.out.println("Guess a number between 1-100: ");
		Scanner guess = new Scanner(System.in);
		int playerGuess = guess.nextInt();
		System.out.println("Your guess is: " + playerGuess);
		Random random = new Random();
		int number = random.nextInt(100) + 1;
		if (playerGuess == number) {
			System.out.println("You got it!");
		}
		else {
		System.out.println("The number I thought of was: " + number);
		System.out.println ("You were off by: ");
		System.out.println (Math.abs(number - playerGuess));
		}
	}

}
