
public class Factorial {
	public static void main(String[] args) {
		System.out.println("The answer is: " + factorial(5));
	}
	
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		int product = n * factorial(n-1);
		return product;
	}
}
// base case is factorial 0 "0!" and it equals 1