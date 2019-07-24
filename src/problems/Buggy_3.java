package problems;

import library.BuggyCode;

public class Buggy_3 extends BuggyCode<Integer[], Integer> {

	// Returns the product of all the odd-numbered items in the array: so the 1st, 3rd, etc.
	// If array is empty return zero
	public Integer run(Integer[] array) {
		
		int product = 0;
		
		for (int i = 1; i < array.length; i += 2) {
			
			product *= array[i];
			
		}
		
		return product;
		
	}

}