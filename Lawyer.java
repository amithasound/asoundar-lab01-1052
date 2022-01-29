
public class Lawyer extends Person {
	private String lawFirm; 
	private int yearsExperience; 
	
	
	
	public Lawyer(int age, String name, String gender, String lawFirm, int yearsExperience) {
		super(age,name,gender);
		this.lawFirm = lawFirm; 
		this.yearsExperience = yearsExperience; 
		
		
	}
	
	//@Override
	public String toString() {
		String description = super.toString();
		
		return description +  ", Esq." ;
		
	}
	
	
	
	
	
}
