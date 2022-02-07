import java.util.Scanner;

public class TempConverter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//declare variables
		// convert far to cel
		double far;
		System.out.println("Enter temperature: ");
		far = input.nextDouble();
		double cel;
		cel = ((far - 32.0)*(5.0/9.0));
		System.out.println (cel + " degrees celsius");
		//convert cel to far
		//far = (cel*(9.0/5.0)+32);
		System.out.println(far + " degreess farenheit");
	}

}
