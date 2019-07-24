package problems;

import library.BuggyCode;

public class Buggy15 extends BuggyCode<Integer, Integer> {

	// Finds the sum of all even Fibonacci numbers less than max
	public Integer run(Integer max) {

		int a = 1;
		int b = 1;
		int c = 0;
		int sum = 0;

		while (c < max) {
			
			c = a + b;
			a = b;
			b = c;
			
			if (c % 2 == 0) {
				
				sum += c;
				
			}
			
		}

		return sum;

	}

}