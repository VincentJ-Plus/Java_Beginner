package ch6;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {12, 35, 7, 24, 41, 63, 18, 9};
		SelectSort sorter = new SelectSort();
		sorter.sort(array);
	}
	
	/*
	 * select sort 
	 * @param array
	 * the array that be sorted
	 */
	
	public void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int index = 0;
			for (int j = 0; j < array.length-1; j++) {
				j = index;
				if (array[j] > array[j+1]) {
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
				index++;
			}
		}
		showArray(array);
	}
	
	public void showArray(int[] array) {
		System.out.print("The sorted array is: ");
		for (int c = 0; c < array.length; c++) {
			System.out.print(" < " + array[c]);
		}
	}
	
}
