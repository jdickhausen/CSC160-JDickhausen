
public class Example2 implements Example1{

	public void sayHi() {
		System.out.println("Say hi!");
	}
	public static void main(String[] args) {
		Example1 e2 = new Example2();
		e2.openBag();
	}
	@Override
	public void openBag() {
		System.out.print("Bag Opened");
		
	}
	
}
		 
