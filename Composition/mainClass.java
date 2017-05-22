package Composition;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Here it is object composition , because 
		// A person has a job . 
		// A Composition is achieved by using instance variables that refers to other objects. 
		
		/* Notice that above test program is not affected by any change in the Job Object. 
		 * If you are looking for code reuse and the relationship between two classes is has-a 
		 * then you should use composition rather than inheritance.
		 */
		Person person = new Person(new Job());
		
		long salary = person.getSalary();
		
		System.out.println(salary);
	}

}
