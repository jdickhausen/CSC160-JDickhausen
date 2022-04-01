import java.util.Arrays;

public class CardTest {
	public static void main(String[] args) {
		Card[] cards = new Card [52];
		int index = 0;
		for (int i = 0; i < 4; i ++) {
			for (int j = 1; j < 14; j++) {
				cards[index] = new Card(j, i);
				index++;
				System.out.print(index + "\n");
			}
		}
	}
}
