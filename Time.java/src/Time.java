
public class Time 
{
	public static void main(String[] args) 
	{
		// creating a system to print the time
		// print the seconds since midnight
		// print the seconds left in the day
		// print the percentage of the day that is left
		int hour = 20;
		int minute = 30;
		System.out.print("The current time is ");
		System.out.print(hour);
		System.out.print(":");
		System.out.print(minute);
		System.out.println(".");
		System.out.print("It has been ");
		System.out.print(hour * 3600 + minute * 60);
		System.out.println(" seconds since midnight.");
		double secondsSince = 73800;
		System.out.print("There are ");
		System.out.print(86400 - secondsSince);
		System.out.println(" seconds left in the day.");
		System.out.print("The percentage of the day left is ");
		System.out.print(12600.0/864.0);
		System.out.println("%.");
	}
}
