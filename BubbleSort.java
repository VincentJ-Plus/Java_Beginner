package ch6;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {63, 4, 24, 1, 3, 15};
		BubbleSort sorter = new BubbleSort();
		sorter.sort(array);
	}
	
	/* 
	 * Bubble Sort
	 * @param array
	 * The array that be sorted
	 */
	
	public void sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length-i; j++) {
				if (array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		showArray(array);
	}
	
	/*
	 * display all elements in the array
	 * @param array 
	 * the array that be displayed
	 */
	
	public void showArray(int[] array) {
		for (int i: array) {
			System.out.print(" < " + i);
		}
	}
}
