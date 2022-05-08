import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DiceGame {
	
	static Player[] players;
	static int numSides;
	static int numPlayers;
	static String winner;

	public static void main(String[] args) throws Exception {
		
		Scanner input = new Scanner (System.in);
		System.out.println("How many sides are on the dice?");
		numSides = input.nextInt();
		System.out.println("How many are playing?");
		numPlayers = input.nextInt();
	
		decideWinner();
		fileWrite();
	}	
	public static void player() {
		Player player = new Player();
		players = new Player[numPlayers];
		String name;
		Die die;
		Scanner input1 = new Scanner (System.in);
		
		for (int i = 0; i < numPlayers; i++) {
			System.out.println("Enter player " + (i+1) + " name: ");
			name = input1.nextLine();
			die = new Die(numSides);
			player.roll();
			player.getValue();
			players[i] = new Player (name, die);
		}
//		for (int i = 0; i < numPlayers; i++) {
//			System.out.println("Player " + players[i].getName() + " rolled a " + players[i].getDie().getValue() + " on a "+ players[i].getDie().getNumSides() + " sided die");
//		}
	}
	public static void decideWinner() throws Exception {
		player();
		winner = players[0].getName();
		int index = 0;
		for (int i = 0; i < numPlayers-1; i++) {
			if (players[index].getDie().getValue() < players[i+1].getDie().getValue()) {
				winner = players[i+1].getName();
				index = i;
			}
		}
//		System.out.println("The winner is " + winner);
	}
	public static void fileWrite() throws IOException {
		File myFile = new File("DiceGameOutput1");
		if (!myFile.exists()) {
			myFile.createNewFile();
		}
		PrintWriter printWriter = new PrintWriter(new FileOutputStream(myFile.getName(), true));
		for (Player i: players) {
			printWriter.println("Player " + i.getName() + " rolled a " + i.getDie().getValue() + " on a "+ i.getDie().getNumSides() + " sided die");
		}
		printWriter.println("Player " + winner + " wins!" + "\n");
		if (printWriter.checkError()) {
			System.out.println("There were errors in writing.");
		}
		printWriter.close();
	}

}
