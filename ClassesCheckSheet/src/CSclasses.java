import java.util.ArrayList;
import java.util.Scanner;

public class CSclasses {
	static ArrayList<Courses> courseList = new ArrayList<Courses>();
	
	public static void main(String[] args) {
		
//		FullRemoteCourse c1 = new FullRemoteCourse("MAT121",12, 20, 4, "frcc@class.edu");
//		courseList.add(c1);
//		
//		InPersonCourse c2 = new InPersonCourse("CSC 160", 25, 30, 4, "BP119");
//		courseList.add(c2);
//		
//		RealTimeRemoteCourse c3 = new RealTimeRemoteCourse("SOC 101", 18, 30, 3, "A1B2");
//		courseList.add(c3);
		
		char ans = 'y';
		String classType; 
		String course;
		int numStudents;
		int maxStudents;
		int credits;
		String zoomID;
		String email;
		String room;
		Scanner input = new Scanner(System.in);
		while (ans == 'y') {
			System.out.print("Is your class online or in person?");
			classType = input.next();
			if (classType.equals("online")){
				System.out.println("Course number?");
				course = input.next();
			}
			for (int i = 0; i < courseList.size(); i ++) {
				System.out.println(courseList.get(i) + "\n");
			}
		//courseDetails();
		}
	}
	public void courseDetails() {
		System.out.println();
	}
	public static void noStringCourseDetails() {
		// pass object into parameters
	}

}
