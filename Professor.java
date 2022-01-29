
public class Professor extends Person {
	 
	private String university; 
	private String department; 
	
	
	
	public Professor(int age, String name, String gender, String university,String department) {
		super(age,name,gender);
		this.university = university; 
		this.department = department; 
		
		
	}
	
	//@Override
	public String toString() {
		String description = super.toString();
		
		return   "Prof. " + description ;
		
	}
	
	
	
	
	
}



