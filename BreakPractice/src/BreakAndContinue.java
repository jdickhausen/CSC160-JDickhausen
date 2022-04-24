import java.util.ArrayList;
import java.util.List;

public class BreakAndContinue {
	static List <Integer> myArr = new ArrayList<>();
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			myArr.add(i);
		}
//		myArr.add(1);
//		myArr.add(2);
//		myArr.add(3);
//		myArr.add(4);
//		myArr.add(5);
//		myArr.add(6);
//		myArr.add(7);
//		myArr.add(8);
//		myArr.add(9);
//		myArr.add(0);
		for (Integer element: myArr) {
			if (element == 3) {
				continue;
			}
			System.out.println((int) myArr.get(element));
		}
	}
}
