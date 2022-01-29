import java.util.Scanner;
public class TestThirteen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String testString = kb.nextLine();
		
		
	
			try {
				
				while(testString.length() !=13){
						System.out.println("Enter a string: ");
						testString = kb.nextLine();
						
				}
						
			 throw new ThirteenException("The length of the string is 13");
					
					
			}catch(ThirteenException e){
				System.out.println("The length of the string is 13!");
				//testString = kb.nextLine();
			}
		
		
		
		
		
	}

}
