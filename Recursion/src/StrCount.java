
public class StrCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int strCount(String str, String sub) {
		  if (!str.contains(sub)){
		    return 0;
		  }
		  else {
		    return 1 + strCount(str.substring(str.indexOf(sub)+sub.length()), sub);
		  }

	}
}
