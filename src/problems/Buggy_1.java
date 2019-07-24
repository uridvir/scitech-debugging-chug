package problems;

import library.BuggyCode;

public class Buggy_1 extends BuggyCode<Integer[], Integer> {

	// Finds the sum of all the elements of the array
	public Integer run(Integer[] array) {

		Integer sum = 0;

		for (int i = 0; i <= array.length; i++) {

			sum += array[i];

		}

		return sum;

	}

}