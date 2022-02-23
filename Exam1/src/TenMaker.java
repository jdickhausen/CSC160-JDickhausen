import java.util.Scanner;

public class TenMaker {
	public static void main(String[] args) {
		int sum = 1;
		if (makes10(sum) == true){
			System.out.println("The sum is 10");
		}
		else {
			System.out.println("The sum is not 10");
		}
	}
	public static boolean makes10(int sum) {
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		System.out.println("Choose you first integer");
		int firstNum = input1.nextInt();
		
		System.out.println("Choose your second integer");
		int secondNum = input2.nextInt();
		
		return (firstNum + secondNum == 10);
	}
}
