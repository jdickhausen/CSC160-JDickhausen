
public class Exercise7_6 {
	
	public static void main(String[] args) {
		int nNum = 75;
		int [] myArray = {3,5,5};
		if (arePrimeFactors(nNum, myArray)) {
			System.out.println("All numbers are prime and multiply to " + nNum + ".");
		}
	}
	public static boolean arePrimeFactors (int n, int []myArr) {
		int product = 1;
		int max = myArr[0];
		    for (int i = 0; i < myArr.length; i++){
		    max = Math.max (max, myArr[i]);
		  }
		for (int i = 1; i < myArr.length+1; i++) {
			int numCheck = myArr[i-1];
			product = numCheck * product;
			if (numCheck == 0 || numCheck == 1 || numCheck == 2) {
				System.out.print("An element in the array is not prime. ");
				return false;
			}
			for (int j = 2; j < numCheck; j++) {
				if (numCheck != j && numCheck% j == 0) {
					System.out.print("An element in th array is not prime. ");
					return false;
				}
			}
		}
		if (product != n) {
			System.out.print("The numbers do not add to " + n + ". ");
			return false;
		}
		return true;
	}
}
	
