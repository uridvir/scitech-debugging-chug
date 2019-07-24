package problems;

import library.BuggyCode;

public class Buggy_9 extends BuggyCode<Integer[], Boolean> {

	// Returns true if the number of 3's in the array is divisible by 3, or if the number of 5's is divisible by 5, but not both.
	public Boolean run(Integer[] array) {
		
		int twoCount = 0;
		int threeCount = 0;
		
		for (int i : array) {
			
			if (i == 2) {
				
				twoCount++;
				
			}
			
			if (i == 5) {
				
				threeCount++;
				
			}
			
		}
		
		return (twoCount % 2 == 0) || (threeCount % 3 == 0);
		
	}

}