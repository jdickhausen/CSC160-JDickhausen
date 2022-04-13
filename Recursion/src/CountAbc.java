
public class CountAbc {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int countAbc(String str) {
		  if (str.length() < 3){
		    return 0;
		  }
		  else if (str.substring(0,2).equals ("ab") && str.charAt(2) == 'a'){
		    return 1 + countAbc(str.substring(1));
		  }
		  else if (str.substring(0,2).equals ("ab") && str.charAt(2) == 'c'){
		     return 1 + countAbc(str.substring(1));
		  }
		  else {
		    return countAbc(str.substring(1));
		  }
	}

}
