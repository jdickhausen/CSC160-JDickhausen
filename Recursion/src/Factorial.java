
public class Factorial {
	
	public static void main(String[] args) {

	}
	
	public int factorial(int n) {
		  if (n == 0){
		    return 1;
		  }
		  
		  int product =  n * (factorial(n-1));
		  return product;
		}

}
