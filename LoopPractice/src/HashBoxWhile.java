import java.util.Scanner;

public class HashBoxWhile {

	public static void main(String[] args) {
		Scanner input1 = new Scanner (System.in);
		Scanner input2 = new Scanner (System.in);
		
		String box = "#";
		System.out.println("How many rows?");
		int numberRows = input1.nextInt();
		System.out.println("How many colums?");
		int numberColumns = input2.nextInt();
		int i = 1;
		int j = 1;
		
		while (j++ <= numberColumns && i++ <=numberRows) {	
			//while (i++<= numberRows) {
			//	System.out.print(box);
			//}
			System.out.print(box);
			System.out.println(box);
		}
	}

}
