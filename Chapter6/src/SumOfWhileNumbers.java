
public class SumOfWhileNumbers {
public static void main(String[] args) {
		
		int chosenNumber = 10;
		int addNumber = 1;
		int sum = 0;
		
		while(chosenNumber >= addNumber) {
			
			if(chosenNumber > addNumber) {
				System.out.print(addNumber + " + ");
			}
			else {
				System.out.print(addNumber + " = ");
			}
			sum = sum + addNumber;
			addNumber++;
		}
		System.out.print(sum);
	}
}
