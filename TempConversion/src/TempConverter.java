
public class TempConverter {
	public static void main(String[] args) {
		double far = 55;
		double cel = ((far - 32.0)*(5.0/9.0));
		System.out.println (cel + " degrees celsius");
		
		cel = 10.5;
		far = (cel*(9.0/5.0)+32);
		System.out.println(far + " degreess farenheit");
	}

}
