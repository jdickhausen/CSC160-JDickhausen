
public class StringInteger {
	public static void main(String[] args) {
		String s = "102";
		
		int n = Integer.parseInt(s);
		
		System.out.println(n + 4);
		
		int a = 8;
		
		System.out.println(Integer.toString(a) + 1);
		
		String x = "age 47";
		x = x.replaceAll("\\D+", "");
		
		int y = Integer.parseInt(x);
		System.out.println(x);
	}
}
