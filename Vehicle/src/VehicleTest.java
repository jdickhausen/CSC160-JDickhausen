
public class VehicleTest {
	public static void main(String[] args) {
//		Car car1 = new Car(1, 1, "A2", "Green");
//		Vehicle vehicle1 = new Vehicle();
//		System.out.println(vehicle1);
//		car1.drive(5, 10);
//		System.out.println(car1);
//		car1.drive(2);
		
		Vehicle[] vehicles = new Vehicle[4];
		vehicles[0] = new Car(0, 110, "C3D4", "Green");
		vehicles[1] = new Truck(0, 80, "A1B2", 5.5);
		vehicles[2] = new Car(0, 120, "E5F6", "Blue");
		vehicles[3] = new Vehicle(0, 90, "G7H8");
		
		for(int i = 0; i < vehicles.length; i++) {
			System.out.println(vehicles[i]);
		}
		Vehicle myVehicle = new Car(0, 110, "C3D4", "Green");
		System.out.println(myVehicle);
		Car myCar = (Car) myVehicle;
		
		for (int i = 0; i < vehicles.length; i++) {
			if (vehicles[i] instanceof Truck) {
				double bedLength = ((Truck)vehicles[i]).getBedLength();
				System.out.println(bedLength);
			}
		}
	} 
	
}
