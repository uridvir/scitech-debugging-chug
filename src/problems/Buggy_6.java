package problems;

import library.BuggyCode;

public class Buggy_6 extends BuggyCode<Integer, Integer> {

	// Gets the n-th Fibonacci number (starting at 0)
	public Integer run(Integer n) {
		
		int a = 1;
		int b = 1;
		int c = 0;
		
		if (n == 0) {
			
			return 1;
			
		}
		
		else if (n == 1) {
			
			return 1;
			
		}
		
		for (int i = 2; i <= n; i++) {
			
			c = a + b;
			a = b;
			
		}
		
		return c;
		
	}

}
