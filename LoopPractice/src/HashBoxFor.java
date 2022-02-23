import java.util.Scanner;

public class HashBoxFor {
	public static void main(String[] args) {
		
		Scanner input1;
		input1 = new Scanner(System.in);
		
		Scanner input2;
		input2 = new Scanner(System.in);
		
		String box = "#";
		System.out.println ("How many rows?");
		int rowNumber = input1.nextInt();
		System.out.println ("How many columns?");
		int columnNumber = input1.nextInt();
		for (int j = 0; j <= columnNumber-1; j++) {
			for(int i = 1; i <= rowNumber-1; i++) {
				System.out.print(box);
			}
			System.out.println(box);
		}
		
	}
}
