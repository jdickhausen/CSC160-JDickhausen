
public class StringKnowledge {
	public static void main(String[] args) {
		//String str = "breadjellybread";
		//getSandwich(str);
	}
	public static boolean endOther(String a, String b) {
		a = "stopit";
		b = "it";
		int aLong = a.length();
		int bLong = b.length();
		
		if (aLong > bLong) {
			int diff = aLong - bLong;
			if (a.substring(diff, a.length()) == b) {
				return true;
			}
		}
		else if (aLong > bLong) {
			int diff = bLong - aLong;
			if (a.substring(diff, b.length()) == a) {
				return true;
			}
		}
		return false;
	}
	public static String getSandwich(String str) {
		str = "breadjellybread";
		int index = str.indexOf("bread");
		
		while (index != -1) {
			index++;
		}
		str = str.substring((index + 5), index);
		return str;
	}
}
