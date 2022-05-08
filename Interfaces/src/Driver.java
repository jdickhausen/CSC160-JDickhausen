import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		
//		int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		
//		List <Integer> myList = new ArrayList<Integer>();
//		
//		for(int i = 9; i > -1; i--) {
//			myList.add(i);
//		}
//
//		for(int elements: myList) {
//			System.out.print(elements + ", ");
//		}
//		System.out.println();
//		
//		Collections.sort(myList);
//		for(int elements: myList) {
//			System.out.print(elements + ", ");
//		}
		
		//Person[] person = new Person[20];
		List <Person> person = new ArrayList<Person>();
		int height = 65;
		int weight = 250;
		for (int i = 0; i < 20; i++) {
			person.add(new Person(height++, weight--));
		}
		//Arrays.sort(person);
		Collections.sort(person, Collections.reverseOrder());
		
		for (Person element: person) {
			System.out.print(element.getHeight() + ", ");
		}
		System.out.println();
		
		Collections.sort(person, new WeightComparator());
		
		for (Person element: person) {
			System.out.print(element.getWeight() + ", ");
		}
	}

}
