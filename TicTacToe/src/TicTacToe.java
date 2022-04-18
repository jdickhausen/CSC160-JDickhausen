import java.util.Scanner;

public class TicTacToe {
	
	public static char [][] board = {{'1', '2', '3'}, {'4','5','6'}, {'7','8','9'}};
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		makeBoard();
		pickSpot();
	}
	public static void makeBoard() {
		
		System.out.println("   |   |   ");
		System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " ");
		System.out.println("___|___|___");
		System.out.println("   |   |   ");
		System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " ");
		System.out.println("___|___|___");
		System.out.println("   |   |   ");
		System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " ");
		System.out.println("   |   |   ");
		
	}
	public static void player() {
		
	}
	public static void pickSpot() {
		char player1 = 'O';
		char player2 = 'X';
		char player = player1;
		char icon = '1';
		
		char winner = winnerCheck();
		while (winner == 'W') {
			// switch players
			if (player == player1) {
				player = player2;
				icon = '1';
			}
			else {
				player = player1;
				icon = '2';
			}
			// check for winners or full board
			if (winnerCheck() == 'X') {
				System.out.println("Player 1 wins" + "\n");
				break;
			}
			else if (winnerCheck() == 'O') {
				System.out.println("Player 2 wins" + "\n");
				break;
			}
			else if (winnerCheck() == 'D') {
				System.out.println("Game is a draw!");
			}
			// placing player mark on board
			System.out.println("Player " + icon + " choose your mark");
			int spot = input.nextInt();
			if (spot == 1) {
				board[0][0] = player;
				makeBoard();
			}
			else if (spot == 2) {
				board[0][1] = player;
				makeBoard();
			}
			else if (spot == 3) {
				board[0][2] = player;
				makeBoard();
			}
			else if (spot == 4) {
				board[1][0] = player;
				makeBoard();
			}
			else if (spot == 5) {
				board[1][1] = player;
				makeBoard();
			}
			else if (spot == 6) {
				board[1][2] = player;
				makeBoard();
			}
			else if (spot == 7) {
				board[2][0] = player;
				makeBoard();
			}
			else if (spot == 8) {
				board[2][1] = player;
				makeBoard();
			}
			else if (spot == 9) {
				board[2][2] = player;
				makeBoard();
			}
		}
			
	}
	public static char winnerCheck() {
		 	// player X winner check
			if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') {
		        return 'X';
		    }
		    if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') {
		        return 'X'; 		    }
		    if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') {
		        return 'X'; 
		    }
		    if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') {
		        return 'X'; 
		    }
		    if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') {
		        return 'X'; 
		    }
		    if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {
		        return 'X'; 
		    }
		    if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
		        return 'X';
		    }
		    if (board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == 'X') {
		        return 'X'; 
		    }
		    // Player O winner check
		    if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') {
		        return 'O'; 
		    }
		    if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') {
		        return 'O'; 
		    }
		    if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') {
		        return 'O'; 
		    }
		    if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') {
		        return 'O';
		    }
		    if (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') {
		        return 'O';
		     }
		    if (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') {
		        return 'O';
		    }
		    if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
		        return 'O'; 
		    }
		    if (board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == 'O') {
		        return 'O'; 
		    }
		    // check for draw
		    if (board[0][0] != '1' && board[0][1] != '2' && board[0][2] != '3' && board[1][0] != '4' && board[1][1] != '5' && board[1][2] != '6'
		        && board[2][0] != '7' && board[2][1] != '8' && board[2][2] != '9') {
		        return 'D'; 
		    }
		    // W is no winner
		    else {
		        return 'W'; 
		    }
	}

}
