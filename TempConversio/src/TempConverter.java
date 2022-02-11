import java.util.Scanner;

public class TempConverter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//declare variables
		// convert far to cel
		System.out.println("Enter farenheit temperature: ");
		double far = input.nextDouble();
		double cel = ConvertToCel(far);
		System.out.println (cel + " degrees celsius");
		System.out.println("Enter celsius temperature: ");
		double celsius = input.nextDouble();
		double farenheit = ConvertToFar(cel);
		System.out.println(farenheit + " degreess farenheit");
	}
	public static double ConvertToCel(double far) {
		double cel = ((far - 32.0)*(5.0/9.0));
		return cel;
	}
	public static double ConvertToFar(double celsius){
		//convert cel to far
		double farenheit = (celsius*(9.0/5.0)+32);
		return farenheit;
	}
}
