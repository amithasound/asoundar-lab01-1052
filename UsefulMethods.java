
public class UsefulMethods {
	
	public static void main (String[] args) {
		
		
		
		int[] array = {4,2,3,8,9,1,7};

		boolean result = isValidEmail("vgehlot@villanova.");
		System.out.println(result);
		
		//int[] finalArr = subArray(array,2 ,5);
		
		//int[] finalArr = dropN(array,3);
		
		//for(int i = 0; i < finalArr.length; i++) {
		//	System.out.println(finalArr[i]);
			
		//}
		
				
				
				
	}//end of main 
	
	
	
	public static int[] subArray(int[]arr, int start, int end) {	
		
		int newArrLength = end - start;
		
	    int[] newArr = new int[newArrLength];
	    
	    int index = 0;
	    for(int i = start; i < end; i++) {
	    	
	    	newArr[index] = arr[i];
	    	index++;
	    }
		
	    return newArr;
	}
	
	
	public static int[] dropN(int[]arr, int n) {	
		
		int newArrLength = arr.length - n;
	    int[] newArr = new int[newArrLength];
	    int index = 0;
	    
	    for(int i = n; i < arr.length; i++) {
	    	
	    	newArr[index] = arr[i];
	    	index++;
	    }
		
	    return newArr;
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
				atCount++;
			}
		}
	    
	   // only one period	   
	   
	    String newSub = s.substring(atIndex);
	    for(int i = 0; i< s.length(); i++) {
			if(s.charAt(i)== period) {
				periodCount++;
			}
		}
	    
	    
	  //contains alphanumeric character before @
	    String stringTwo = s.substring(0,atIndex);
	    char stringTwoIndex;
	    boolean containsAlphanumericBeforeAt = false;
	    
	    for(int i = 0; i < stringTwo.length(); i++) {
	    	stringTwoIndex = s.charAt(i);
	    	stringTwoIndex = Character.toUpperCase(stringTwoIndex);
	    	
	    	 if((atIndex != 0) && (stringTwoIndex >= 48 && stringTwoIndex <=57 || stringTwoIndex >= 65 && stringTwoIndex <= 90)) {
	    		containsAlphanumericBeforeAt = true;
	    	}else {
	    		containsAlphanumericBeforeAt = false;
	    		break;
	    	}
	    }
	    
	    String stringThree = s.substring(atIndex);
	    char stringThreeIndex;
	    boolean containsAlphanumericAfterAt = false;
	    String afterAtBeforePeriod = s.substring(atIndex + 1, periodIndex);
	    String afterPeriod = s.substring(periodIndex);
	  
	    
	    for(int i = 0; i < stringTwo.length(); i++) {
	    	stringThreeIndex = s.charAt(i);
	    	stringThreeIndex = Character.toUpperCase(stringThreeIndex);
	    	if((afterPeriod.length()>0) &&(afterAtBeforePeriod.length()>0) && (stringThreeIndex >= 48 && stringThreeIndex <=57 || stringThreeIndex >= 65 && stringThreeIndex <= 90 || stringThreeIndex == 46)) {
	    		containsAlphanumericAfterAt = true;
	    	}else {
	    		containsAlphanumericAfterAt = false;
	    		break;
	    	}
	    } 
	    
	   

	    
	    
	    if(atCount == 1 && periodCount == 1 && containsAlphanumericBeforeAt && containsAlphanumericAfterAt)  {
	    	return true;
	    }else {
	    	return false;
	    }
	        
	    
	 
	 
	}
	
	
}//end of class
