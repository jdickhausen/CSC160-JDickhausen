
public class LogicKnowledge {
	public static void main(String[] args) {
		System.out.print(greenTicket());
	}
	public static int greenTicket() {
		int ticket = 0;
		int a = 7;
		int b = 8;
		int c = 8;
		if (a == b) {
			ticket = ticket + 10;
		}
		if (b == c) {
			ticket = ticket + 10;
		}
		if (a == c && b != c) {
			ticket = ticket + 10;
		}
		return ticket;
	}
	public static int makeChocolate(int small, int large, int goal) {
		small = 4;
		large = 1;
		goal = 9;
		
		}
	}
}
