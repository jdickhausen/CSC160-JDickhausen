import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CSclasses {	
	
	
	static List<Courses> courseList = new LinkedList<Courses>();

	public static void main(String[] args) {
		File readFile = null;
		Scanner input = null;
		Courses course1;
		
		//readFile();
		String courseNum = null;
		int numStudents = 0;
		int maxStudents = 0;
		int credits = 0;
		String zoomID = null;
		String email = null;
		String room = null;
		
		readFile = new File("C:\\Users\\jdick\\OneDrive\\Documents\\CSClassesFile.txt\\");
		try {
			input = new Scanner(readFile);
		} catch (FileNotFoundException e) {
			System.out.println("Error");
			e.printStackTrace();
			System.exit(-1);
		}
		while (input.hasNextLine()) {
			String line = input.nextLine();
			String line2 = input.nextLine();
			//int intM = input.nextInt();
			if (input.nextLine().equals("In person")) {
				System.out.println();
			}
			if (line.equals("In Person")) {
				courseNum = line2;
				numStudents = input.nextInt();
				maxStudents = input.nextInt();
				credits = input.nextInt();
				room = input.nextLine();
				course1 = new InPersonCourse(courseNum, numStudents, maxStudents, credits, room);
				courseList.add(course1);
			}
			else if (line.equals("Full Remote")) {
				course1 = new FullRemoteCourse(courseNum, numStudents, maxStudents, credits, email);
				
				courseNum = line2;
				numStudents = input.nextInt();
				maxStudents = input.nextInt();
				credits = input.nextInt();
				email = input.nextLine();
				courseList.add(course1);
			}
			else if (line.equals("Real Time Remote")) {
				course1 = new RealTimeRemoteCourse(courseNum, numStudents, maxStudents, credits, zoomID);
				
				courseNum = line2;
				numStudents = input.nextInt();
				maxStudents = input.nextInt();
				credits = input.nextInt();
				zoomID = input.nextLine();
				courseList.add(course1);
			}
			
			for (Courses course: courseList) {
				System.out.println(course);
				System.out.println();
			}
		}
		
	}
public static void readFile() {
		
	}
	
}
