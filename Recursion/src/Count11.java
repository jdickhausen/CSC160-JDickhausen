
public class Count11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int count11(String str) {
		  if (str.length() < 2){
		    return 0;
		  }
		  if (str.substring(0,2).equals("11")){
		    return 1 + count11(str.substring(2));
		  }
		  else{
		    return count11(str.substring(1));
		  }
	}

}
