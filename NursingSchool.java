package hw06Abstraction;

/*
	extends and implements keyword is used in Java, but in a regular class, implements keyword is used
	to inherit Interface and extends keywords to inherit a regular class or an abstract class
*/
public abstract class NursingSchool extends RockefellerUniversity {
	 /* extends keyword is used to inherit a regular class or an abstract class in regular class.
	 Multiple inheritance is not possible by extends keyword in regular class.
	 Extends keyword can not inherit an interface in regular or abstract class.
	 */
	public NursingSchool() {
		System.out.println("This is from default constructor of NursingSchool");
	}


	public void caring() {
		System.out.println("Caring");


	}


	public abstract void hygiene();


}

