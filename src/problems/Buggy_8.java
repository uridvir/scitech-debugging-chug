package problems;

import library.BuggyCode;

public class Buggy_8 extends BuggyCode<String, Integer> {

	// Returns the number of vowels in the string (a, e, i, o, u)
	public Integer run(String str) {
		
		int vowels = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			char c = Character.toLowerCase(str.charAt(i));
			
			if (c == 'a' && c == 'e' && c == 'i' && c == 'o' && c == 'u') {
				
				vowels++;
				
			}
			
		}
		
		return vowels;
		
	}

}
