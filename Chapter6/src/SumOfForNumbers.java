
public class SumOfForNumbers {
	public static void main(String[] args) {
		int chosenNumber = 10;
		int sum = 0;
		for(int i=1; i<=chosenNumber; i++) {
			sum = sum + i;
			//System.out.print(i + " + ");
			if (i < chosenNumber) {
				System.out.print(i + " + ");
			}
			else {
				System.out.print(i + " = ");
			}
			
			//System.out.print(i + chosenNumber);
		}
		System.out.print(sum);
	}
}


