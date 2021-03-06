package hw06Abstraction;

/*
 	extends and implements keyword is used in Java, but in a regular class, implements keyword is used
   	to inherit Interface and extends keywords to inherit a regular class or an abstract class
*/
public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool  {
	         /* extends keyword is used to inherit a regular class or an abstract class in regular class.
			 Multiple inheritance is not possible by extends keyword in regular class.
			 Extends keyword can not inherit an interface in regular or abstract class.
			 */
			 
	public ColumbiaUniversity() {
		System.out.println("This is from default constructor of ColumbiaUniversity");
	}
	public void chemistry() {
		System.out.println("Chemistry Lab");
	}
	
	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		System.out.println("Common Room");
	}
	@Override
	public void laboratory() {
		System.out.println("Laboratory");
		
	}
	@Override
	public void languageClub() {
		System.out.println("Language Club");
		
		
	}
	@Override
	public void cafeteria() {
		System.out.println("Cafeteria");
		
	}
	@Override
	public void emergencyRoom() {
		System.out.println("Emergency Room");
		
	}
	@Override
	public void surgeryRoom() {
		System.out.println("Surgery Room");
		
	}
	@Override
	public void classSize() {
		System.out.println("Class size");
		
	}
	@Override
	public void field() {
		System.out.println("Field");
		
	}
	@Override
	public void teacher() {
		System.out.println("Teacher");
		
	}
	@Override
	public void biochemistryLab() {
		System.out.println("Biochemistry Lab");
		
	}
	@Override
	public void hygiene() {
		System.out.println("Hygiene");
		
	}
	@Override
	public void computerLab() {
		System.out.println("Computer Lab");
		
	}
	@Override
	public void vocationalInfo() {
		System.out.println("Vocational Info");
		
	}
	
	public void aeronauticalInfo () {
		System.out.println("Aeronautical Info");
	}
}

