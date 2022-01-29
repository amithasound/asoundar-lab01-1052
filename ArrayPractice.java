
public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = new int[20][20];
		int rowSum = 0;
		int rowOfSum = 0;
		int colSum = 0;
		int colOfSum = 0;
		
		
		
		
		for (int row = 0; row < matrix.length; row++) {
		    for (int col = 0; col < matrix[row].length; col++) {
		        matrix[row][col] = (int) ((Math.random() * 100)+ 1) ;
		    } //fills array with random values in the range of 1-100 inclusive
		}
		
		for (int row = 0; row < matrix.length; row++) {
		    for (int col = 0; col < matrix[row].length; col++)
		        System.out.print(matrix[row][col] + "  ");

		    System.out.println();
		} //printing array
		
		for(int i = 0; i < matrix.length; i++) {
			int sum = 0;
			int [] temp = matrix[i];//array of the row i of matrix
			
			for(int j = 0; j< matrix.length; j++) {
				sum += temp[j]; //sum of the temp array
			}
			if(sum > rowSum) {//if sum of temp array > highest row sum (rowSum)
				rowSum = sum; 
				rowOfSum = i;
			}
		
		}
		
		
		
		for(int i = 0; i <  matrix.length; i++) { 
			int sumTwo = 0;
			for(int j = 0; j<  matrix.length; j++){
				sumTwo += matrix[j][i]; //sums column 
			}
			
			if(sumTwo > colSum){ //if sum column > highest col sum(colSum)
				colSum = sumTwo;
				colOfSum = i;
			}
			
		}
			
		
		System.out.println("Mac row sum is: " + rowSum + " at row: " + rowOfSum);
		System.out.println("Col row sum is " + colSum + " at row: " + colOfSum);
		
		
		
		
		
	}
}
