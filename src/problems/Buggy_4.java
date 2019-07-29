package problems;

import library.BuggyCode;

public class Buggy_4 extends BuggyCode<Integer[], Boolean> {

	// Returns true if array is a palindrome, return false for empty array
	public Boolean run(Integer[] array) {
		
		for (int i = 0; i < array.length / 2; i++) {
			
			if (array[i] == array[(array.length - 1) - i]) {
				
				return true;
				
			}
			
		}
		
		return false;
		
	}

}