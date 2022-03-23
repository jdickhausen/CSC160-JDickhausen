import java.util.Objects;

public class Course {
	private String courseName;
	private double numberOfCredits;
	private int maxStudents;
	private int actualNumberOfStudents;
	
	public Course(String courseName, double numberOfCredits, int maxStudents, int acutalNumberOfStudents){
		this.courseName = "CSC160";
		this.numberOfCredits = 4;
		this.maxStudents = 25;
		this.actualNumberOfStudents = 15;
	}
	public Course (String courseName){
		courseName = "CSC160";
	}
	public Course(String courseName, int maxStudents, int actualNumberOfStudents) {
		courseName = "CSC160";
		this.maxStudents = 25;
		this.actualNumberOfStudents = 15;
	}
	public Course (String courseName, double numberOfCredits) {
		courseName = "CSC160";
		numberOfCredits = 4;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getNumberOfCredits() {
		return numberOfCredits;
	}
	public void setNumberOfCredits(int numberOfCredits) {
		this.numberOfCredits = numberOfCredits;
	}
	public int getMaxStudents() {
		return maxStudents;
	}
	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}
	public int getActualNumberOfStudents() {
		return actualNumberOfStudents;
	}
	public void setActualNumberOfStudents(int actualNumberOfStudents) {
		this.actualNumberOfStudents = actualNumberOfStudents;
	}
	public String toString() {
		return this.numberOfCredits + " " + this.maxStudents + " " + this.actualNumberOfStudents;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return actualNumberOfStudents == other.actualNumberOfStudents && maxStudents == other.maxStudents;
	}
}
