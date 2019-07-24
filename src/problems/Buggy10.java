package problems;

import library.BuggyCode;

public class Buggy10 extends BuggyCode<String[], String[]> {

	// Translates English to Yoda
	// Takes a sentence (array) of words and moves the last two words and moves them to the front in reverse order
	// Example: ["there", "are", "always", "two"] -> ["two", "always", "there", "are"]
	// Also, if the input is less than two words long, just return the input
	public String[] run(String[] words) {
		
		String[] result = new String[words.length];
		
		result[0] = words[words.length - 1];
		result[1] = words[words.length - 2];
		
		for (int i = 0; i < words.length; i++) {
			
			result[i] = words[i];
			
		}
		
		return result;
		
	}

}