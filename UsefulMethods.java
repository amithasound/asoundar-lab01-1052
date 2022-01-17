public class UsefulMethods {
	
	public static void main (String[] args) {
		
		
		
		int[] array = {4,2,3,8,9,1,7};
		int[] subArrayReturn = subArray(array,2 ,5); //invoking subArray method
		int[] dropNReturn = dropN(array,3); 	//invoking dropNReturn method
		int[] dropN2Return = dropN2(array,3);	//invoking dropN2Return method
		
		System.out.print("Printing sub Array: ");
		for(int i = 0; i < subArrayReturn.length; i++) {
	    	System.out.print(subArrayReturn[i] + " "); //printing the subArray  
		}
		System.out.println(""); 
		
		
		
		System.out.print("Printing dropNArray: ");
		for(int i = 0; i <  dropNReturn.length; i++) {
			System.out.print(dropNReturn[i] + " "); //printing the dropNReturn 
		}
		
		System.out.println("");
		
		
		System.out.print("Printing dropN2Array: ");
		for(int i = 0; i <  dropN2Return.length; i++) {  //printing the dropN2Return
			System.out.print(dropN2Return[i] + " ");
		}
		System.out.println("");
		
		
		
		String emailAddress = "vgehlot@villanova.edu";
		//String emailAddress = "vgehlot88@villanova.edu";
		//String emailAddress = "vgehlot@villa2nova.edu";
		//String emailAddress = "123@456.789";
		//String emailAddress = "@villanova.edu";
		//String emailAddress = "vgehlot@villa@nova.edu";
		//String emailAddress = "vgehlot@villa.nova.edu";
	    //String emailAddress = "vgehlot@villanova.";
		 
		//Testing isValid email & printing
		System.out.println(isValidEmail(emailAddress) == true ? "The email address: " + emailAddress + " is valid" :   "The email address: " + emailAddress + " is invalid" );
		
				
				
	}//end of main 
	
	
	
	public static int[] subArray(int[]arr, int start, int end) {	
		
	    int[] newArr = new int[end-start]; 
	    int index = 0; 
	    for(int i = start; i < end; i++) { 
	    	//assigning newArr indexes from 0 to length n to indexes of arr starting parameter "start"
	    	newArr[index] = arr[i];
	    	index++; //increase newArr index 
	    }
	    return newArr;
	    
	}
	
	
	public static int[] dropN(int[]arr, int n) {	
	
	    int[] newArr = new int[ arr.length - n];
	    int index = 0;
	    //assigning newArr indexes from 0 to length n to indexes of arr starting at n + 1
	    for(int i = n; i < arr.length; i++) {
	    	newArr[index] = arr[i];
	    	index++;
	    }
	    return newArr;
	}
	
	
    public static int[] dropN2(int[]arr, int n)	{
    	int arrLength = arr.length;
    	return subArray(arr, n, arrLength);
    	
    }
	
	
	
	
	
	public static boolean isValidEmail(String s) {
	  char A = '@';
	  int atCount = 0;
	  int periodCount = 0;
	  int atIndex = s.indexOf("@");
	  char period = '.';
	  int periodIndex = s.indexOf(".");
	  boolean isPeriodFirst = false;
	  
	  
	 
		  
		  
		  
	  //only one @
	    for(int i = 0; i< s.length(); i++) {
			if(s.charAt(i)== A) {
				atCount++; //counts the amount of @ symbols in symbol and will return false if atCount is greater than 1
			} 
		}
	    
	   // only one period	   
	   
	    String newSub = s.substring(atIndex);
	    for(int i = 0; i< s.length(); i++) {
			if(s.charAt(i)== period) {
				periodCount++; //counts the amount of period symbols in symbol and will return false if atCount is greater than 1
			}
		}
	    
	    
	  //contains alphanumeric character before @
	    String stringTwo = s.substring(0,atIndex); //substring from beginning until the @ symbol
	    char stringTwoIndex;
	    boolean containsAlphanumericBeforeAt = false; 
	    
	    for(int i = 0; i < stringTwo.length(); i++) { 
	    	stringTwoIndex = s.charAt(i); //captures each letter of the string before atSymbol and makes it a character to make sure it is alphamumeric
	    	stringTwoIndex = Character.toUpperCase(stringTwoIndex); //converts to uppercase so I only need to test uppercase unicode values instead of upper and lower
	    	
	    	 if((atIndex != 0) && (stringTwoIndex >= 48 && stringTwoIndex <=57 || stringTwoIndex >= 65 && stringTwoIndex <= 90)) { 
	    		//48 - 57 are unicode values for numbers & 65 - 90 are Uppercase letter unicode values
	    		// if @ sign is the first index this means there are no letters before and are therefore invalid 
	    		 containsAlphanumericBeforeAt = true;
	    	}else {
	    		containsAlphanumericBeforeAt = false;
	    		break;
	    	}
	    }
	    //contains alphamueric charachter after@
	    String stringThree = s.substring(atIndex + 1); //substrings email after the @ sign
	    String afterAtBeforePeriod = s.substring(atIndex + 1, periodIndex); //substring between @ and .
	    String afterPeriod = s.substring(periodIndex);  //substring after . 
	    char stringThreeIndex;
	    boolean containsAlphanumericAfterAt = false;
	   
	  
	    
	    for(int i = 0; i < stringTwo.length(); i++) {
	    	stringThreeIndex = s.charAt(i);
	    	stringThreeIndex = Character.toUpperCase(stringThreeIndex);
	    	if((afterPeriod.length()>1) &&(afterAtBeforePeriod.length()>1) && (stringThreeIndex >= 48 && stringThreeIndex <=57 || stringThreeIndex >= 65 && stringThreeIndex <= 90 || stringThreeIndex == 46)) {
	    		//48 - 57 are unicode values for numbers & 65 - 90 are Uppercase letter unicode values & 46 is unicode value for the .
	    		// if substring between @ sign and . sign is  < 1 it is false and if after the period substring length is < 1 it also is false 
	    		
	    		containsAlphanumericAfterAt = true;
	    	}else {
	    		containsAlphanumericAfterAt = false;
	    		break;
	    	}
	    } 
	    
	   

	    
	    //only returms true if all conditions are met 
	    if(atCount == 1 && periodCount == 1 && containsAlphanumericBeforeAt && containsAlphanumericAfterAt)  {
	    	return true;
	    }else {
	    	return false;
	    }
	        
	    
	 
	 
	}
	
	
}//end of class

