
public class ParenthesesBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String parenBit(String str) {
		  if (str.charAt(0) != '('){
		    return parenBit(str.substring(1));
		  }
		  if (str.charAt(0) == '('){
		    if (str.charAt(str.length()-1) == ')'){
		      return str;
		    }
		    else if (str.charAt(str.length() - 1) != ')'){
		      return parenBit(str.substring(0, str.length()-1));
		    }
		  }
		  return parenBit(str.substring(1, str.length()-1));
	}
}
