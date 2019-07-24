package problems;

import library.BuggyCode;

public class Buggy13 extends BuggyCode<String, Boolean> {

	// Returns true if a string is "haunted" and contains "666"
	public Boolean run(String str) {
		
		int sixesSeen = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) == '6') {
				
				sixesSeen++;
				
			}
			
			else {
				
				sixesSeen = 1;
				
			}
			
			if (sixesSeen == 3) {
				
				return false;
				
			}
			
		}
		
		return true;
		
	}

}
