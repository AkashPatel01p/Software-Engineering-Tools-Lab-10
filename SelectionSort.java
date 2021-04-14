package sorting;

public class SelectionSort {
	/**
	 * preconditions: None 
	 * postconditions: array is decsending order  (might have duplicates) 
	 * @param x: int[], the array to sort 
	 * @return a sorted array 
	 */
	public int[] selectionSort(int[] x) {
		int temp = 0;
		for(int row = 0; row < x.length; row++) {
			for(int col = 0; col < x.length; col++) {
				if(x[row] < x[col]) {
					temp = x[row];
					x[row] = x[col];
					x[col] = temp; 
				}
			}
		}
		return x; 
	}
}
