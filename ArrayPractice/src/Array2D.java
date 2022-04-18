
public class Array2D {
	public static int[][] tables = new int [10][10];
	
	public static void main(String[] args) {
		tableCreation();
		for (int i = 0; i < tables.length; i++) {
			for (int j = 0; j < tables.length; j++) {
				System.out.print(tables[i][j]+ " ");
			}
			System.out.println("");
		}
	}
	public static void tableCreation() {
		for (int i = 0; i < tables.length; i++) {
			for (int j = 0; j < tables[i].length; j++) {
				tables[i][j] = (i+1)*(j+1);
			}
		}
	}
}
