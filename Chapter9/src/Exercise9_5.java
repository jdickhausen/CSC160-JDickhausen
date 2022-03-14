import java.util.Arrays;
import java.util.Scanner;

public class Exercise9_5 {

	public static void main(String[] args) {
		
		powArray();
		
		
		histogram();
	}
	@SuppressWarnings("resource")
	public static void powArray() {
		Scanner input; 
		System.out.println("What power do you want to raise to?");
		input = new Scanner(System.in);
		int power = input.nextInt();
		
		double[] a = {1, 2, 3, 4, 5};
		
		for (int i = 0; i < a.length; i++) {
			a[i] = (double) Math.pow(a[i], power);
		}
		System.out.println(Arrays.toString(a) + "\n");
	}
	public static int[] histogram() {
		int[] counts = new int[100];
		int [] scores = new int [100];
		for (int score : scores) {
		    counts[score]++;
		}
		System.out.print("Historgram: " + Arrays.toString(counts));
		return counts;
	}
}
