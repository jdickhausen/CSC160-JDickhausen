
public class BatStrings {
	public String plusOut(String str, String word) {
		int index = 0;
		char [] strArray = str.toCharArray();
		while (index != -1) {
			int oldIndex = index; 
			index = str.indexOf(word, index);
			
			for (int i = oldIndex; i < index; i++){
			  strArray[i] = '+';
			}
			index += word.length();
			
		}
		return strArray.toString();
	}

}