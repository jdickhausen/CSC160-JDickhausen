
public class Courses {
	private String courseNumber;
	private int numStudents;
	private int maxStudents;
	private int credits;
	
	public Courses() {
		
	}

	public Courses(String courseNumber, int numStudents, int maxStudents, int credits) {
		this.courseNumber = courseNumber;
		this.numStudents = numStudents;
		this.maxStudents = maxStudents;
		this.credits = credits;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public int getNumStudents() {
		return numStudents;
	}

	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}

	public int getMaxStudents() {
		return maxStudents;
	} 

	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	@Override
	public String toString() {
		return "courseNumber = " + courseNumber + "\n" + "numStudents = " + numStudents + "\n" + "maxStudents = " + maxStudents
				+ "\n" + "credits = " + credits;
	}
	
}
