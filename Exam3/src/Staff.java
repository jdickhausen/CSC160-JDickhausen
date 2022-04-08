
public class Staff extends Employee{
	private String title;

	public Staff(String name, String adress, String phoneNumber, String emailAddress, String office, String salary, String dateHired,  String title) {
		super (name, adress, phoneNumber, emailAddress, office, salary, dateHired, title);
		this.title = title;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
