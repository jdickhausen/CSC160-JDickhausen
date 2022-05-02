import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CSclasses {	
	
	
	static List<Courses> courseList = new LinkedList<Courses>();

	public static void main(String[] args) throws IOException {
		getClasses();
		fileWrite();
		fileRead();
	}
	public static void printFile() {
		for (Courses course: courseList) {
			System.out.println(course);
			System.out.println();
		}
	}
	public static void getClasses() {
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
			ans = input1.nextLine();
		}
	}
	public static void fileWrite() throws IOException{

		getClasses();
		File myFile = new File("FileCourses.csv");
		if (!myFile.exists()) {
			myFile.createNewFile();
		}
		PrintWriter classWriter = new PrintWriter(new FileOutputStream(myFile.getName(), true));
		for(Courses course: courseList) {
			classWriter.print(course.getCourseNumber() + "," + course.getMaxStudents() + "," + course.getNumStudents() + "," + course.getCredits()); 
			if (course instanceof FullRemoteCourse) { // do for each course type
				classWriter.print("," + ((FullRemoteCourse)course).getEmail());
			}
			else if (course instanceof RealTimeRemoteCourse) {
				classWriter.print("," + ((RealTimeRemoteCourse)course).getZoomId());
			}
			else if (course instanceof InPersonCourse) {
				classWriter.print("," + ((InPersonCourse)course).getRoomNumber());
			}
			classWriter.println();
		}
		classWriter.flush();
		classWriter.close();
	}
	public static void fileRead() { // use .split to separate at the comma
		File readFile = null;
		Scanner input = null;
		Courses course1 = null;
		
		String courseNum = null;
		int numStudents = 0;
		int maxStudents = 0;
		int credits = 0;
		String zoomID = null;
		String email = null;
		String room = null;
		
		readFile = new File("FileCourses.csv");//C:\\Users\\jdick\\OneDrive\\Documents\\CSClassesFile.txt\\
		try {
			input = new Scanner(readFile);
		} catch (FileNotFoundException e) {
			System.out.println("Error");
			e.printStackTrace();
			System.exit(-1);
		}
		while (input.hasNextLine()) {
			String line = input.nextLine();
			line.split(",");
			if (line.equals("In Person")) { // check when 2 in persons in a row it repeats!!!!
				courseNum = input.nextLine();
				numStudents = Integer.parseInt(input.nextLine());
				maxStudents = Integer.parseInt(input.nextLine());
				credits = Integer.parseInt(input.nextLine());
				room = input.nextLine();
				course1 = new InPersonCourse(courseNum, numStudents, maxStudents, credits, room);
			}
			else if (line.equals("Full Remote")) {
				courseNum = input.nextLine();
				numStudents = Integer.parseInt(input.nextLine());
				maxStudents = Integer.parseInt(input.nextLine());
				credits = Integer.parseInt(input.nextLine());
				email = input.nextLine();
				course1 = new FullRemoteCourse(courseNum, numStudents, maxStudents, credits, email);
			}
			else if (line.equals("Real Time Remote")) {
				courseNum = input.nextLine();
				numStudents = Integer.parseInt(input.nextLine());
				maxStudents = Integer.parseInt(input.nextLine());
				credits = Integer.parseInt(input.nextLine());
				zoomID = input.nextLine();
				course1 = new RealTimeRemoteCourse(courseNum, numStudents, maxStudents, credits, zoomID);
			}
			courseList.add(course1);
		}
		printFile();
	}
	// use instance of after you do the .split and so on
}
