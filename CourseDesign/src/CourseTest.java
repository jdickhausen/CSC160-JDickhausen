
public class CourseTest {
	public static void main(String[] args) {
		Course course1 = new Course("CSC160", 4, 25, 15);
		Course course2 = new Course("CSC160", 20, 10);
		Course course3 = new Course("CSC161");
		Course course4 = new Course("MAT160", 5);
		
		Course [] courses = new Course [4];
		courses[0] = course1;
		courses[1] = course2;
		courses[2] = course3;
		courses[3] = course4; 
	}
}
