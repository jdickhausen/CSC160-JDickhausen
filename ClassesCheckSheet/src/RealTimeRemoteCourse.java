
public class RealTimeRemoteCourse extends OnlineCourse{
	
	private String zoomId;
	
	public RealTimeRemoteCourse(String courseNumber, int numStudents, int maxStudents, int credits, String zoomId) {
		super(courseNumber, numStudents, maxStudents, credits);
		this.zoomId = zoomId;
	}

	public String getZoomId() {
		return zoomId;
	}

	public void setZoomId(String zoomId) {
		this.zoomId = zoomId;
	}

	@Override
	public String toString() {
		return "Real Time Remote:" + "\n" + "Zoom ID = " + zoomId + "\n" + super.toString();
	}
	
}
