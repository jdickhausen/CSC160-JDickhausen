
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
		double hoursInDay = 24;
		double minutesInHour = 60;
		double secondsInMinute = 60;
		System.out.print("The current time is ");
		System.out.println(hour + ":" + minute + ".");
		System.out.println("It has been " + secondsInMinute * minutesInHour * hour + " seconds since midnight.");
		System.out.print("There are ");
		System.out.print((secondsInMinute*minutesInHour*hoursInDay) - (secondsInMinute*minutesInHour*hour));
		System.out.println(" seconds left in the day.");
		System.out.print("The percentage of the day that has past is ");
		System.out.print((secondsInMinute*minutesInHour*hour)/(secondsInMinute*minutesInHour*hoursInDay) * 100);
		System.out.println("%.");
	}
}
