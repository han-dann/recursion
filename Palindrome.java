import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palindrome {

	public static void main(String[] args) throws Exception {

		// Using BufferedReader for input
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please enter a string of text: ");
		String text = stdin.readLine();

		if (isPalindrome(text)) {
			System.out.println("That is a palindrome!");
		} else {
			System.out.println("Sorry, that is NOT a palindrome.");
		}
	}

	// Recursive helper method to determine if the text is a palindrome
	public static boolean isPalindrome(String text) {
		if (text.length() <= 1) { //if the user enters a single character/letter that is aoutomatically a palindrome!
			return true;
		} else if (text.charAt(0) != text.charAt(text.length() - 1)) {//if first character is not equal to last character, it is false//not a palindrome
			return false;
		} else {
			return isPalindrome(text.substring(1, text.length() - 1));//if previous statement is true, extract that first character, and the last character from the string and recursively call the method to see if the remaining string is a palindrome.
		}
	}
}