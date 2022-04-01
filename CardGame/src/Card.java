
public class Card {
	private int rank;
	private int suit; 
	
	//all caps for constants
	// constants when 'final'
	public final String[] RANKS = {
			null, "Ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", 
			"Jack", "Queen", "King"
	};
	public final String [] SUITS = {
			"Clubs", "Diamonds", "Hearts", "Spades"
	};
	public Card (int rank, int suit) {
		this.rank = rank;
		this.suit = suit; 
	}
	public int getRank() {
		return this.rank;
	}
	public int getSuit() {
		return this.suit;
	}
	public void setRank (int rank) {
		this.rank = rank;
	}
	public void setSuit (int suit) {
		this.suit = suit;
	}
	public boolean equals(Card that) {
		return this.rank == that.rank 
		&& this.suit == that.rank;
	}
	public int compareTo (Card that) {
		if (this.rank < that.rank) {
			return -1;
		}
		else if (this.rank == that.rank) {
			return 0;
		}
		return 1;
		
	}
	public String toString() {
		return(RANKS[this.rank]+ " of " + SUITS[this.suit]);
	}
}
