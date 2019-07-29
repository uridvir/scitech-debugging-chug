package library;

import java.util.Arrays;
import java.util.HashMap;

public class Problem<Input, Output> {
	
	//Code to be tested
	private BuggyCode<Input, Output> code;
	
	//Map of test cases for buggy code
	private HashMap<Input, Output> testCases = new HashMap<Input, Output>();
	
	//Constructor
	public Problem(BuggyCode<Input, Output> code) {
		
		this.code = code;
		
	}
	
	//Adds an input / output pair to be checked
	public void addCase(Input in, Output out) {
		
		testCases.put(in, out);
		
	}
	
	private String formatObject(Object obj) {
		
		if (obj == null) {
			
			return "null";
			
		}
		
		if (obj.getClass() == String.class) {
			
			return "\"" + obj.toString() + "\"";
			
		}
		
		if (obj.getClass().isArray()) {
			
			if (obj.getClass().getComponentType() == String.class) {
				
				String[] array = (String[]) obj;
				
				String result = "[";
				
				for (int i = 0; i < array.length; i++) {
					
					result += "\"" + array[i] + "\"" + (i + 1 < array.length ? ", " : "]");
					
				}
				
				return result;
				
			}
			
			else {
			
				return Arrays.toString((Object[]) obj);
			
			}
			
		}
		
		else {
			
			return obj.toString();
			
		}
		
	}
	
	private Boolean outputsEqual(Output a, Output b) {
		
		if (a == null && b == null) {
			
			return true;
			
		}
		
		else if (a.getClass().isArray()) {
			
			return Arrays.equals((Object[]) a, (Object[]) b);
			
		}
		
		else {
			
			return a.equals(b);
			
		}
		
	}
	
	//Checks all test cases
	public void checkCases() {
		
		int successCount = 0;
		
		String codeName = code.getClass().getSimpleName();
		System.out.println("------------------------------");
		System.out.println("Checking " + codeName + "...");
		System.out.println();
		
		for (Input in : testCases.keySet()) {
			
			Output expectedOut = testCases.get(in);
			Output realOut;
			
			System.out.print("Case " + formatObject(in) + " -> " + formatObject(expectedOut) + " ");
			
			try {
			
				realOut = code.run(in);
				
			} catch (Throwable e) {
				
				System.out.println("failed with:");
				
				StackTraceElement[] stackTrace = e.getStackTrace();
				stackTrace = Arrays.copyOfRange(stackTrace, 0, stackTrace.length > 5 ? 5 : stackTrace.length);
				
				System.out.println(e.toString());
				
				for (StackTraceElement element : stackTrace) {
					
					System.out.println("\tat " + element.toString());
					
				}
				
				continue;
				
			}
			
			if (outputsEqual(realOut, expectedOut)) {
				
				System.out.println("passed!");
				
				successCount++;
				
			}
			
			else {
				
				System.out.println("failed, returned " + formatObject(realOut));
				
			}
			
		}
		
		System.out.println();
		System.out.println(new Integer(successCount).toString() + "/" + new Integer(testCases.size()).toString() + " cases passed!");
		System.out.println("------------------------------");
		
	}
	
}