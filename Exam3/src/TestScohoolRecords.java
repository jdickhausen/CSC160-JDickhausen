import java.util.ArrayList;

public class TestScohoolRecords {

	public static void main(String[] args) {
		ArrayList <Person> personList = new ArrayList<Person>();
		
		Student student1 = new Student("Kyle", "885 A Street", "300-303-303", "student1@frcc", "sophmore");
		personList.add(student1);
		
		Student student2 = new Student("Josh", "521 S Street", "999-999-999", "student2@frcc", "senior");
		personList.add(student2);
		
		Faculty f1 = new Faculty ("Ryan", "111 E st.", "111-111-111", "f1@frcc", "main" , "50,000", "11/10/19", "junior", "8-5");
		personList.add(f1);
		
		Faculty f2 = new Faculty ("Max", "222 E st.", "222-111-111", "f2@frcc", "main" , "80,000", "10/20/15", "senior", "9-6");
		personList.add(f2);
		
		Staff s1 = new Staff ("Jake", "333 F st", "444-444-444", "s1@frcc", "secondary", "60,000", "4/8/20", "Staff member");
		personList.add(s1);
		
		Staff s2 = new Staff ("Mark", "444 G st", "555-555-555", "s2@frcc", "main", "70,000", "6/15/18", "Staff member");
		personList.add(s2);
		
		for (int i = 0; i < personList.size(); i++) {
			if (personList.get(i) instanceof Student) {
				student1.getAdress();
				System.out.println(student1);
			}
			System.out.println();
		}
	}

}
