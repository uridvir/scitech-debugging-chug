package problems;

import library.BuggyCode;

public class Buggy_2 extends BuggyCode<Integer[], Integer[]> {

	// Takes a 3-long array and returns a reversed copy, so [1, 2, 3] becomes [3, 2, 1]
	// If the array is the wrong size, return null
	public Integer[] run(Integer[] array) {

		return new Integer[] { array[3], array[2], array[1] };

	}

}