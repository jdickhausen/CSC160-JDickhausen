
public class Employee extends Person{
	private String office;
	private String salary;
	private String dateHired;
	
	public Employee() {
		
	}
	
	public Employee(String name, String address, String phoneNumber, String emailAddress, String office, String salary, String dateHired, String title) {
		super(name, address, phoneNumber, emailAddress);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDateHired() {
		return dateHired;
	}

	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}
	
}
