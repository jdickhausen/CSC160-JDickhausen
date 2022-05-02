import java.io.IOException;

public class Week15Practice {
	
	public enum Day{
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY; // all upper case because constants
//		Day = new Day;
//		if (input.nextLine().equals("Thursday")) {
//			new Day = Day.THURSDAY;
//		}
	}
	
	public static void main(String[] args) throws IOException {
		bigPractice();
	}
	public static int newConditions() {
		int x = 5;
		int y = (x == 5) ? 3:4; // shorter version of if statement 
		// 3 is if x = 5 and 4 is if x != 5
	
		return x == 5 ? 3:0; // if x = 5 return 3 else return 0
	}
	public static void bigPractice() {
		System.out.println(Long.MAX_VALUE);
		// pass BigInteger as String 
		// BigInteger sum = i.add(j)
		// do above for any multiplication, division, subtraction, addition of bigs
		// they are immutable 
	}
}
