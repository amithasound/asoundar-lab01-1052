
public class UsefulMethods {
	
	public static void main (String[] args) {
		
		
		
		int[] array = {4,2,3,8,9,1,7};
		
		

		
		int[] finalArr = subArray(array,2 ,5);
		
		for(int i = 0; i < finalArr.length; i++) {
			System.out.println(finalArr[i]);
			
		}
		
	}
	
	
	
	public static int[] subArray(int[]arr, int start, int end) {
		int arrLength = arr.length; 
		int newArrLength = end - start;
	    int[] newArr = new int[newArrLength];
	    int index = 0;
	    for(int i = start; i < end; i++) {
	    	
	    	arr[start] = newArr[index];
	    	
	    }
		
	    return newArr;
		
		
	}
	
	
	
	
	
}
