import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FileRead {

	static List<Courses> courseList = new LinkedList<Courses>();
	
	public static void main(String[] args) {
		fileRead();
		printFile();
	}
	public static void printFile() {
		for (Courses course: courseList) {
			System.out.println(course);
			System.out.println();
		}
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
		
		readFile = new File("C:\\Users\\jdick\\OneDrive\\Documents\\CSClassesFile.txt\\");//C:\\Users\\jdick\\OneDrive\\Documents\\CSClassesFile.txt\\
		try {
			input = new Scanner(readFile);
		} catch (FileNotFoundException e) {
			System.out.println("Error");
			e.printStackTrace();
			System.exit(-1);
		}
		while (input.hasNextLine()) {
			String line = input.nextLine();
			if (line.equals("In Person")) { // check when 2 in persons in a row it repeats!!!!
				courseNum = input.nextLine();
				numStudents = Integer.parseInt(input.nextLine());
				maxStudents = Integer.parseInt(input.nextLine());
				credits = Integer.parseInt(input.nextLine());
				room = input.nextLine();
				course1 = new InPersonCourse(courseNum, numStudents, maxStudents, credits, room);
				courseList.add(course1);
			}
			else if (line.equals("Full Remote")) {
				courseNum = input.nextLine();
				numStudents = Integer.parseInt(input.nextLine());
				maxStudents = Integer.parseInt(input.nextLine());
				credits = Integer.parseInt(input.nextLine());
				email = input.nextLine();
				course1 = new FullRemoteCourse(courseNum, numStudents, maxStudents, credits, email);
				courseList.add(course1);
			}
			else if (line.equals("Real Time Remote")) {
				courseNum = input.nextLine();
				numStudents = Integer.parseInt(input.nextLine());
				maxStudents = Integer.parseInt(input.nextLine());
				credits = Integer.parseInt(input.nextLine());
				zoomID = input.nextLine();
				course1 = new RealTimeRemoteCourse(courseNum, numStudents, maxStudents, credits, zoomID);
				courseList.add(course1);
			}
		}
	}
}
