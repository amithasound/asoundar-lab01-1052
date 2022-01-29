
public class TestPerson{
	public static void main (String [] args) {
		
		
		
	Person[] arr = new Person[4];
	 arr[0] = new Lawyer(50, "Michael Imms", "Male","Kirland Associates" , 20);
	 arr[1] = new Doctor(40, "Christine Meyers", "Female","Penn Medicine" , "General");
	 arr[2] = new Professor (30, "Gehlot", "Male", " Villanova University", "Computing Sciences");
	 arr[3] = new Person (18, "Amitha Soundararajan", "Female");
	 
	 
	
		
		/*
	Person [] arr = { (new Lawyer(50, "Michael Imms", "Male","Kirland Associates" , 20)),
			        (new Doctor(40, "Christine Meyers", "Female","Penn Medicine" , "General")), 
			       ( new Professor (30, "Gehlot", "Male", " Villanova University", "Computing Sciences"))
	 }
	 
	 */
	 
	 
	 for(int i = 0; i< arr.length; i++) {
	    System.out.println(arr[i]);
	 }
	
	 
	 
	}
}
