package mytesting;

public class Array {
	public static void main(String[] args) {
		int []arr = {1,2,3};
		
//		System.out.print(arr.length);
//		
//		arr[2] = 100;
//		System.out.print(arr[2]);
		
		// Declaration and initialization of a 2D array
		int[][] matrix = {
		    {1, 2, 3},
		    {4, 5, 6},
		    {7, 8, 9}
		};
		
		// Iterating through a 2D array
		for (int i = 0; i < matrix.length; i++) {
		    for (int j = 0; j < matrix[i].length; j++) {
		        System.out.print(matrix[i][j] + " ");
		    }
		    System.out.println();
		}
		
		
		
	}
}
