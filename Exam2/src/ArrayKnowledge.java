
public class ArrayKnowledge {
	public static void main(String[] args) {
	
	}
	public static int[] fizzArray1(int n) {
		n = 3;
		int [] fizzArray1 = new int [n];
		for (int i = 0; i < n; i++) {
			fizzArray1[i] = i;
		}
		return fizzArray1;
	}
	public static int[] fizzArray3(int start, int end) {
		start = 3;
		end = 7;
		int difference = end - start;
		int [] fizzArray3 = new int [difference];
		for (int i = start; i < end; i++) {
			fizzArray3[i] = i;
		}
		return fizzArray3;
	}
}
