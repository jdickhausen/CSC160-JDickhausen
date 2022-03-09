
public class Exercise6_5 {

	public static void main(String[] args) {
		String wordCheck = "Noon";
		if (isDoubloon(wordCheck)) {
			System.out.print("It is a doubloon");
		}
		else {
			System.out.print("It is not a doubloon");
		}
	}
	public static boolean isDoubloon(String wordCheck) {
		wordCheck = wordCheck.toLowerCase();
		boolean doubloonCheck = true;
		for(int i= 0; i<wordCheck.length();i++){
			int count=0;
			for(int j=0;j<wordCheck.length();j++){
				if(wordCheck.charAt(i)==wordCheck.charAt(j)) {
					count++;
				}
			}
			if (count != 2) {
	    	doubloonCheck = false;
			}
		}
		return doubloonCheck;
	}
}
