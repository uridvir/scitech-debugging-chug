package problems;

import library.BuggyCode;

public class Buggy_5 extends BuggyCode<Integer[], Integer[]> {

	// Returns reversed copy of array for any size
	public Integer[] run(Integer[] array) {

		Integer[] result = new Integer[array.length];

		int i = 0;
		int j = array.length;

		while (i < array.length) {

			result[i] = array[j];

			i += 1;
			j -= 1;

		}

		return result;

	}

}