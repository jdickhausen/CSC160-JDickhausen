import java.util.Scanner;

public class Cylinder {

	public static void main(String[] args) {
		Scanner inputRad = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		//double area = computeArea();
		double radius = inputRad.nextDouble();
		Scanner inputLength = new Scanner(System.in);
		System.out.println("Enter the length: ");
		double length = inputLength.nextDouble();
		System.out.println("Your area is: ");
		//System.out.println(area);
		//System.out.println("Your volume is: ");
		//System.out.println(
	}
	
	public double computeArea(double radius){
		double pi = 3.14;
		double area = radius * radius * pi;
		return area; 
	}
	
	public double computeVolume(double length, double area) {
		double volume = area * length;
		return volume;
	}
}
	
