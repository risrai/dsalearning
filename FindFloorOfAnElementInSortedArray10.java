package binarySearch;

/**
 * If target element is present, then that is the floor, otherwise we need to
 * find greatest element which is smaller than target.
 * 
 * @author User
 *
 */
public class FindFloorOfAnElementInSortedArray10 {

	public static int[] myArray = { 1, 3, 4, -7, -8, -9, -10, -11, 12, 11 };

	public static void main(String[] args) {
		FindFloorOfAnElementInSortedArray10 fa = new FindFloorOfAnElementInSortedArray10();
		// System.out.println(fa.findFloor(myArray, 50));

		System.err.println(fa.solution(myArray));
	}

	public int findFloor(int[] myArray, int target) {
		int low = 0;
		int high = myArray.length - 1;
		int result = -1;
		while (low <= high) {
			int mid = (low + high) / 2;

			// Check whether mid element is equal to target.
			if (myArray[mid] == target) {
				return target;
			}

			// Check if middle element is greater than
			// target, then floor must be on left side of mid.
			else if (myArray[mid] > target) {
				high = mid - 1;
			}

			// If mid is less than target, then it could
			// be our answer, so store it in result
			// and look for an element which is
			// greater than current but smaller than target
			else {
				result = myArray[mid];
				low = mid + 1;
			}
		}
		return result;
	}

	public int solution(int[] A) {
		// write your code in Java SE 8
		int result = 0;
		int ans = 0;
		for (int index = 0; index < A.length - 1; index++) {
			int diff = A[index + 1] - A[index];
			System.out.println("DIFF: " + diff);
			if (diff == -1 || diff == 1) {
				result++;
			} else {
				if (result > ans) {
					ans = result;
					System.out.println("ANS: " + result);
				}
				result = 0;
			}
		}
		return ans + 1;
	}

	public int[] solution(int X, int Y) {
		int[] myArray = new int[2];

		if (X == 0 && Y == 0) {
			myArray[0] = -1;
			myArray[1] = -1;
			return myArray;
		}

		int half = X / 2;
		for (int i = 0; i <= half; i++) {
			int t1 = i;
			int t2 = X - i;
			if (t1 * 4 + t2 * 2 == Y) {
				myArray[0] = t1;
				myArray[1] = t2;
			} else if (t1 * 2 + t2 * 4 == Y) {
				myArray[0] = t2;
				myArray[1] = t1;
			}
		}

		return myArray;
	}

}
