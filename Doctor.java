
public class Doctor extends Person {
	 
	private String hospital; 
	private String specialty; 
	
	
	
	public Doctor(int age, String name, String gender, String hospital,String specialty) {
		super(age,name,gender);
		this.hospital = hospital; 
		this.specialty = specialty; 
		
		
	}
	
	//@Override
	public String toString() {
		String description = super.toString();
		
		return   "Dr. " + description ;
		
	}
	
	
	
	
	
}


