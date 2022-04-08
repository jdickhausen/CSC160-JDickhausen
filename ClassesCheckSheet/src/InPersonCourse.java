
public class InPersonCourse extends Courses {
	private String roomNumber;

	public InPersonCourse() {
		
	}
	public InPersonCourse(String courseNumber, int numStudents, int maxStudents, int credits, String roomNumber) {
		super(courseNumber, numStudents, maxStudents, credits);
		this.roomNumber = roomNumber;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	@Override
	public String toString() {
		return "In Person Course:" + "\n" + "roomNumber = " + roomNumber + "\n" + super.toString();
	}
	
}
