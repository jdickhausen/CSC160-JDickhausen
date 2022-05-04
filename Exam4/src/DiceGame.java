import java.io.IOException;
import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) throws IOException {
		int sides;
		int numPlayers;
		
		Scanner input = new Scanner (System.in);
		System.out.println("How many sides are on the dice?");
		sides = input.nextInt();
		System.out.println("How many are playing?");
		numPlayers = input.nextInt();
		
		Player player; 
		int value = 0;
		Player[] players = new Player[numPlayers];
		String name;
		String die = null;
		Scanner input1 = new Scanner (System.in);
		
		for (int i = 0; i < numPlayers; i++) {
			System.out.println("What is player name?");
			name = input1.nextLine();
			die = (sides + " sided die");
			players[i] = new Player (name, die, value);
		}
	
		for (int i = 0; i < numPlayers; i++) {
			System.out.println(players[i]);
		}
	}
	public static void decideWinner() {

	}
}
