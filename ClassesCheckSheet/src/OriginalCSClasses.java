import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class OriginalCSClasses {

	static List<Courses> courseList = new LinkedList<Courses>();
	
	public static void main(String[] args) {
		Courses course;
		String ans = "y";
		int classType; 
		int onlineType;
		String courseNum;
		int numStudents;
		int maxStudents;
		int credits;
		String zoomID;
		String email;
		String room;
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		while (ans.equals ("y")) {
			
			System.out.println("What is your course number?");
			courseNum = input1.nextLine();
			System.out.println("How many students are in your class?");
			numStudents = input.nextInt();
			System.out.println("How many students can be in your class?");
			maxStudents = input.nextInt();
			System.out.println("How many credits is your class?");
			credits = input.nextInt();
			
			System.out.println("If your course is online, enter 1." + "\n" + "If your course is in person, enter 0.");
			classType = input.nextInt();
			
			if (classType == 1) {
				System.out.println("If your course is real time remote, enter 1." + "\n" + "If your course is full remote, enter 2.");
				onlineType = input.nextInt();
				if (onlineType == 1) {
					System.out.println("What is the zoom ID");
					zoomID = input1.nextLine();
					course = new RealTimeRemoteCourse(courseNum, numStudents, maxStudents, credits, zoomID);
					courseList.add(course);
				}
				else if (onlineType == 2){
					System.out.println("What is the email?");
					email = input1.nextLine();
					course = new FullRemoteCourse(courseNum, numStudents, maxStudents, credits, email);
					courseList.add(course);
				}
			}
			else if (classType == 0){
				System.out.println("What is the room?");
				room = input1.nextLine();
				course = new InPersonCourse(courseNum, numStudents, maxStudents, credits, room);
				courseList.add(course);
		}
			System.out.println("Do you have another class?" + "\n" + "If yes, press y." + "\n" + "If no, press n.");
			ans = input2.nextLine();
		}
		System.out.println("\n");
		courseDetails();
		System.out.println("\n" + "Done");
			
	}
	public static void courseDetails() {
		for (Courses course: courseList) {
			//Courses course = courseList.get(i);
			System.out.println("Course number: " + course.getCourseNumber());
			System.out.println("Number of students: " + course.getNumStudents());
			System.out.println("Maximum number of students: " + course.getMaxStudents());
			System.out.println("Number of credits: " + course.getCredits());

			if (course instanceof FullRemoteCourse) {
				System.out.println("Email: " + ((FullRemoteCourse) course).getEmail() + "\n");
			}
			else if (course instanceof RealTimeRemoteCourse) {
				System.out.println("Zoom ID: " + ((RealTimeRemoteCourse)course).getZoomId() + "\n");
			}
			else if (course instanceof InPersonCourse) {
				System.out.println("Classroom: " + ((InPersonCourse)course).getRoomNumber() + "\n");
			}
		}
	}

}
