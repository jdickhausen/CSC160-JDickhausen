
public class Triangle {
	
	public static void main(String[] args) {
		System.out.println(triangle(5));
	}
	public static int triangle(int rows) {
		  if (rows == 0){
		    return 0;
		  }
		  return rows + triangle(rows-1);
		}

}
