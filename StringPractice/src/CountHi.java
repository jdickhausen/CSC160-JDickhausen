
public class CountHi {

	public static void main(String[] args) {
		

	}
	public int countHi(String str) {
		  int count = 0;
		  if (str.length()<2){
		    return count;
		  }
		  for (int i = 0; i < str.length(); i++){
		    if (str.charAt(i) == 'h' && str.charAt(i+1) == 'i'){
		      count = count +1;
		    }
		  }
		  return count;
		}
}
