import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {

	public static void main(String[] args) throws IOException{ // passing the buck
		File myFile = new File("FileWriteTest");
		if (!myFile.exists()) {
			myFile.createNewFile();
		}
		//PrintWriter printWriter = new PrintWriter(myFile.getName());
		// Append file
		PrintWriter printWriter = new PrintWriter(new FileOutputStream(myFile.getName(), true));
		printWriter.println("But I am still happy."); // Adds to full moon line in file
		if (printWriter.checkError()) {
			System.out.println("There were errors in writing.");
		}
		printWriter.close();
		//printer.flush to flush buffer
	}

}
