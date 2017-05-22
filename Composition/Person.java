package Composition;

public class Person {
	
	private Job job;
	
	public Person(Job job){
		
		// Composition has-a relationship
		
		this.job = job;
		
		job.setSalary(1000L);
		
	}
	
	public long getSalary(){
		
		return job.getSalary();
	}

}
