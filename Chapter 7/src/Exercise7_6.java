
public class Exercise7_6 {
	
	public static void main(String[] args) {
		int nNum = 15;
		int [] myArray = {5,3,4};
		if (arePrimeFactors(nNum, myArray)) {
			System.out.println("All numbers are prime and add to " + nNum);
		}
	}
	public static boolean arePrimeFactors (int n, int []myArr) {
		int sum = 0;
		int max = myArr[0];
		    for (int i = 0; i < myArr.length; i++){
		    max = Math.max (max, myArr[i]);
		  }
		for (int i = 1; i < myArr.length +1; i++) {
		for (int j = 2; j < max; j++) {
			int numCheck = myArr[i-1];
			sum = numCheck + sum;
			if (numCheck == 0 || numCheck == 1) {
				System.out.print("An element in th array is not prime. ");
				return false;
			}	
			else if (i != 1 && numCheck% j == 0) {
				System.out.print("An element in th array is not prime. ");
				return false;
			}
			
		}
		}
		if (sum != n) {
			System.out.print("The numbers do not add to " + n + ". ");
			return false;
		}
		return true;
	}
}
	
