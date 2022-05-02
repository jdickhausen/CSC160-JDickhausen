import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) {//throws FileNotFoundException {
		File readFile = null; // initialize object to null
		Scanner input = null; 
	
		try {
			readFile = new File("SampleInput"); // object file pass which file to parameters
			input = new Scanner(readFile); // pass File readFile
			int[] myNumbers = {1, 2, 3};
			System.out.println(myNumbers[10]);
		}
		catch (FileNotFoundException e) { // put Exception for all exceptions
			System.out.println("Something went wrong");
			System.out.println(e.getMessage());
			e.printStackTrace(); // print where it went wrong in red
			System.exit(-1); // exit right from catch block
		}
		catch (NullPointerException e) {
			System.out.println("Null Pointer");
		}
		finally {
			// executes whether it works correctly or not
			// Example: put input.close()
		}
		// you can make specific exception handles (checked or unchecked)
//		public static voidsetIndex10 (int[] array) {
//			if (array.length < 11) {
//				throw new ArrayIndexOutOfBoundsException("Less than 11 elements!");
//			}
//		}
		// convert String elements to integer array
		while(input.hasNextLine()) { // checks for next line on input
			String line = input.nextLine();
			String[] splitArr = line.split(",");
				
			int [] intArr = new int[splitArr.length];
			for (int i = 0; i < splitArr.length; i++) {
				intArr[i] = Integer.parseInt(splitArr[i]); // or use --> Integer.valueOf();
				System.out.println(intArr[i]);
			}
		}
			
		
		input.close(); // do not close until completely done using object
		//numbers[i] = Integer.parseInt(numberStrs[i]);
	}

}
