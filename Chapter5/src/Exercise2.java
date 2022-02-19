import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner input1;
		Scanner input2;
		Scanner input3;
		
		System.out.println("You are going to pick three different number");
		System.out.println("Pick your first number: ");
		input1 = new Scanner(System.in);
		int num1 = input1.nextInt();
		
		System.out.println("Pick your second number: ");
		input2 = new Scanner(System.in);
		int num2 = input2.nextInt();
		
		System.out.println("Pick your third number: ");
		input3 = new Scanner(System.in);
		int num3 = input3.nextInt();
		
		int maxNum = greatestNumber(num1, num2, num3);
		System.out.print("The greatest number is " + maxNum);
		
	}
	public static int greatestNumber(int num1, int num2, int num3) {
		int maxNum;
		if ((num1 > num2)&&(num1 > num3)) {
			maxNum = num1;
		}
		else if ((num2>num1)&&(num2 > num3)) {
			maxNum = num2;
		}
		else {
			maxNum = num3;
		}
		return maxNum;
	}
}