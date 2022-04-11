
public class BunnyEars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int bunnyEars(int bunnies) {
		  if (bunnies == 0){
		    return 0;
		  }
		  
		  int ears = 2 + bunnyEars(bunnies - 1);
		  return ears;
		  
	}
}
