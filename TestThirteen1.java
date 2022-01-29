import java.util.Scanner;
public class TestThirteen1{
	public static void main (String[] args)throws ThirteenException {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String testString = kb.nextLine();
		
		
		while(testString.length() != 13) {
			System.out.println("Enter a string: ");
			testString = kb.nextLine();
			
		}
		
		
		if(testString.length() != 13){
			
			while(testString.length() != 13) {
				
				testString = kb.nextLine();
				
			}
	
		}else {
			throw new ThirteenException("The length of the string is 13");
		}
		
		
	}
	
}
