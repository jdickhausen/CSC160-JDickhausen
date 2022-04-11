
public class AllStars {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String allStar(String str) {
		  if (str.length() < 2){
		    return str;
		  }
		  else {
		    return str.charAt(0) + "*" + allStar(str.substring(1));
		  }
	}
}
