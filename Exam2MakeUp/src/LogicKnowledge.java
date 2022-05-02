
public class LogicKnowledge {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		System.out.println(evenlySpaced(a, b, c));
	}
	public static int redTicket(int a, int b, int c) {
		int count;
		if (a == 2 && b == 2 && c == 2) {
			count = 10;
		}
		else if (a == b && b == c) {
			count = 5;
		}
		else if (b != a && c != a) {
			count = 1;
		}
		else {
			count = 0;
		}
		return count;
	}
	public static boolean evenlySpaced(int a, int b, int c) {
		a = 2;
		b = 4;
		c = 5;
		if (a - b == b - c) {
			return true;
		}
		else if (b - a == a - c) {
			return true;
		}
		else if (c - a == b - c) {
			return true; 
		}
		return false;
	}
}
