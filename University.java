package hw06Abstraction;

public interface University extends College, Hospital{
	/* Interface use extends keyword to inherit more than one Interfaces
	   Interface can't inherit abstract or regular class by extends keyword
	
	    Interfaces cannot have constructors
		public University() {
		System.out.println("Interfaces cannot have constructors");
    }
    */
	public void classSize();
	public void field();
	public void teacher();
	
	public default void gymnasium() {
		System.out.println("From the default method of University");
	}
	
	public static void library() {
		System.out.println("From the static method of University");
	}
	// from java 8, default and static methods are implemented in interface
	
}

