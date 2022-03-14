
public class Date {
	private int year;
	private int month;
	private int day; 
	
	public static void main(String[] args) {
		Date birthday = new Date();
		System.out.print("" + birthday.month + " " +birthday.day + " " + birthday.year);
	}
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public Date() {
		this(1999, 11, 10);
	}
}
