public class StringFun {
	public static void main(String[] args) {

		String s = "This is a string.";
		String otherString = "This is another string.";
		String subString = "Another string.";

		System.out.println(s.length());
		System.out.println(s.equals(otherString));
		System.out.println(s.substring(1, 4));
		System.out.println(s.trim());
		System.out.println(s.indexOf(subString));
		System.out.println(s.lastIndexOf(subString));
		System.out.println(s.charAt(3));
		System.out.println(s.toLowerCase());
		System.out.println(s.replace('i', 'x'));

		/**
		* toLowerCase changes the case of all characters to lowercase
		* replace (s.replace(oldchar, newchar)) replaces all instances of a character (oldchar) with a new character (newchar) in a string
		*
		*/


	}
}