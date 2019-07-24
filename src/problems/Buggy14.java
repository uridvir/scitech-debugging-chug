package problems;

import library.BuggyCode;

public class Buggy14 extends BuggyCode<Integer, Integer> {

	// Returns the n-th digit of pi (starting at zero) (for small n)
	// Example: 0 -> 3, 1 -> 1, 2 -> 4
	public Integer run(Integer index) {
		
		double shiftedDecimalPlace = Math.PI * Math.pow(10, index);
		return (int) shiftedDecimalPlace;
		
	}

}