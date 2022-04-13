
public class EndX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String endX(String str) {
		  if (str.length() == 0){
		    return str;
		  }
		  else if (str.charAt(0) == 'x'){
		    return endX(str.substring(1)) + str.charAt(0);
		  }
		  else {
		    return str.charAt(0) + endX(str.substring(1));
		  }
	}

}
