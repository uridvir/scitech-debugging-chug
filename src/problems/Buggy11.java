package problems;

import library.BuggyCode;

public class Buggy11 extends BuggyCode<Integer, Integer> {

	// Returns the n-th Fibonaci number (starting at zero) using RECURSION!
	public Integer run(Integer n) {
		
		return run(n - 1) + run(n - 2);
		
	}

}