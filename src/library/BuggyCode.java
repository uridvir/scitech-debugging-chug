package library;

//All buggy code files are descended from this class and implement run()

public abstract class BuggyCode<Input, Output> {
	
	public abstract Output run(Input param);
	
}