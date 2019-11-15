package ch6;

public class Ch6_4 {
		// 矩阵行列互换
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println("The original array is: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("The modified array is: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(" " + arr[j][i]);
			}
			System.out.println();
		}
	}

}
