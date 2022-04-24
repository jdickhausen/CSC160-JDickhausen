
public class XyBalance {

	public static void main(String[] args) {
		String str = null;
		xyBalance(str);

	}
	public static boolean xyBalance(String str) {
		 int xIndex = 0;
		 if (!str.contains("x")){
		   return true;
		 }
		 for (int i = 0; i < str.length(); i++){
		   if (str.charAt(i) == 'x'){
		     xIndex = i;
		   }
		 }
		 for (int j = xIndex; j < str.length(); j++){
		   if (str.charAt(j) == 'y'){
		     return true;
		   }
		 }
		 return false;
		}

}
