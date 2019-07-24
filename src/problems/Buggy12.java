package problems;

import library.BuggyCode;

public class Buggy12 extends BuggyCode<Integer, Integer> {

	// Finds the factorial of n
	public Integer run(Integer n) {

		if (n < 0) {
			return 1;
		}
		
		else {
			return n * run(n);
		}
		
	}

}
