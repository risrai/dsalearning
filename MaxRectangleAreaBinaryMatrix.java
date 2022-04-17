package stack;

public class MaxRectangleAreaBinaryMatrix {

	public static void main(String[] args) {
		int myInputArray[][] = { { 1, 0, 1, 0, 0 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 0, 0, 1, 0 } };
		System.out.println(findMaxArea(myInputArray, myInputArray.length, myInputArray[0].length));
	}

	public static int findMaxArea(int[][] matrix, int m, int n) {
		int[] myOutputArray = new int[n];
		int result = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0) {
					myOutputArray[j] = 0;
				} else {
					myOutputArray[j] += matrix[i][j];
				}
			}
			int temp = MaxHistogramArea.findMaxAreaInHistogram(myOutputArray, myOutputArray.length);
			if (temp > result) {
				result = temp;
			}
		}
		return result;
	}

}
