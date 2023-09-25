package java_Basic;

//import java.util.regex.Pattern;

//public class RevWord {
//
//	static String reverseWords(String str) {
//
//		Pattern pattern = Pattern.compile("\\s");
//
//		String[] temp = pattern.split(str);
//		String result = "";
//
//		for (int i = 0; i < temp.length; i++) {
//			if (i == temp.length - 1)
//				result = temp[i] + result;
//			else
//				result = " " + temp[i] + result;
//		}
//		return result;
//	}
//
//	public static void main(String[] args) {
//		String delta = "Delta Airline Best";
//		System.out.println(reverseWords(delta));
//
//	}
//}

public class RevWord {

	public static String revWords(String input) {
		// Split the input string into words using whitespace as the delimiter
		String[] words = input.split(" ");

		StringBuffer reversed = new StringBuffer();

		for (int i = words.length - 1; i >= 0; i--) {
			reversed.append(words[i]);
			if (i > 0) {
				reversed.append(" ");
			}
		}

		return reversed.toString();
	}

	public static void main(String[] args) {
		String delta = revWords("Delta Airline Best");
		System.out.println(delta);
	}
}
