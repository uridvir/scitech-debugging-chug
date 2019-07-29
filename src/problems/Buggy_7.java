package problems;

import library.BuggyCode;

public class Buggy_7 extends BuggyCode<Integer[], Boolean> {

	// Returns true if array follows "Fibonacci" rule, so [1, 3, 4, 7, 11] passes but [1, 5, 5, 9, 13] does not
	public Boolean run(Integer[] array) {
		
		for (int i = 2; i < array.length; i++) {
			
			if (array[i] != array[i - 1] + array[i - 2]) {
				
				return true;
				
			}
			
		}
		
		return false;
		
	}

}