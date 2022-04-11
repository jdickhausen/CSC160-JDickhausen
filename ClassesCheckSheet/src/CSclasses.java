import java.util.ArrayList;
import java.util.Scanner;

public class CSclasses {
	static ArrayList<Courses> courseList = new ArrayList<Courses>();
	
	Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Courses c1;
		String ans = "yes";
		String classType; 
		String onlineType;
		String course;
		int numStudents;
		int maxStudents;
		int credits;
		String zoomID;
		String email;
		String room;
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		while (ans.equals ("yes")) {
			
			System.out.println("What is your course number?");
			course = input.next();
			System.out.println("How many students are in your class?");
			numStudents = input.nextInt();
			System.out.println("How many students can be in your class?");
			maxStudents = input.nextInt();
			System.out.println("How many credits is your class?");
			credits = input.nextInt();
			
			System.out.println("Is your course online?");
			classType = input1.nextLine();
			
			if (classType.equals("yes")) {
				System.out.println("Is it real time or full remote?");
				onlineType = input1.nextLine();
				if (onlineType.equals("real time")) {
					System.out.println("What is the zoom ID");
					zoomID = input1.nextLine();
					c1 = new RealTimeRemoteCourse(course, numStudents, maxStudents, credits, zoomID);
					courseList.add(c1);
				}
				else if (onlineType.equals("full remote")){
					System.out.println("What is the email?");
					email = input1.nextLine();
					c1 = new FullRemoteCourse(course, numStudents, maxStudents, credits, email);
					courseList.add(c1);
				}
			}
			else if (classType.equals("no")){
				System.out.println("What is the room?");
				room = input1.nextLine();
				c1 = new InPersonCourse(course, numStudents, maxStudents, credits, room);
				courseList.add(c1);
		}
			System.out.println("Do you have another class?");
			ans = input2.nextLine();
		}
		courseDetails();
		System.out.println("\n" + "Done");
			
	}
	public static void courseDetails() {
		for (int i = 0; i < courseList.size(); i++) {
			System.out.println(courseList.get(i) + "\n");
		}
	}
	public static void noStringCourseDetails() {
		
	}
	
}
