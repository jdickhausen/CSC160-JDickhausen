import java.util.Scanner;

public class AskSum {
	static Scanner input;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int sum = 0;
		
		sum = getSum();
	}	
	public static int getSum() {
		System.out.println("Pick a number");
		int sum;
		int num;
		num = input.nextInt();
		if (num == 0) {
			return 0;
		}
		else {
			sum = sum + getSum();
		}
		return sum;
	}

}
