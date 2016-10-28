package algorithms.string;

public class OracleRemoveAdjacentDuplicates {

	public static String removeAdjacentDuplicates(String s ) {
		String output = "";
		char prev = ' ';
		return recursiveMethod(s, output, prev);
	}


	public static String recursiveMethod(String s, String output, char prevChar) {
		if (s == null || s.length() == 0) {
			return output;
		}
		if (s.charAt(0) == prevChar) {
			return recursiveMethod(s.substring(1), output, prevChar);	
		} else {
			output += s.charAt(0);
			prevChar = s.charAt(0);
			return recursiveMethod(s.substring(1), output, prevChar);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("yyzzzay" + " " + removeAdjacentDuplicates("yyzzzay"));
		System.out.println("abbbcdd" + " " + removeAdjacentDuplicates("abbbcdd"));
		System.out.println("Hello" + " " + removeAdjacentDuplicates("Hello"));
		System.out.println("empty" + " " + removeAdjacentDuplicates(""));
		System.out.println("null" + " " + removeAdjacentDuplicates(null));
		
	}
}
