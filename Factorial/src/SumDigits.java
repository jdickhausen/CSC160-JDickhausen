
public class SumDigits {
	
	public static void main(String[] args) {
		System.out.println(sumDigits(126));
	}
	public static int sumDigits(int n) {
		  if (n < 10){
		    return n;
		  }
		  return n%10 + sumDigits(n/10);
		}
}
