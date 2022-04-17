package binarySearch;

/**
 * If element is not present, find the difference between target element and the
 * closest element to the target element. In case element itself is
 * present,return 0.
 * 
 * @author User
 *
 */
public class MinDiffElementInSortedArray15 {

	public static void main(String[] args) {
		int[] myArray = { 3, 4, 6, 7, 12 };
		MinDiffElementInSortedArray15 minDiff = new MinDiffElementInSortedArray15();
		System.out.println("Answer:" + minDiff.findMinDifference(myArray, 1));
	}

	public int findMinDifference(int[] myArray, int target) {
		int low = 0;
		int high = myArray.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (myArray[mid] == target) {
				return 0;
			} else if (myArray[mid] > target) {
				high = mid - 1;
			}

			else if (myArray[mid] < target) {
				low = mid + 1;
			}

			if (low > myArray.length - 1) {
				low--;
				break;
			} else if (high < 0) {
				high++;
				break;
			}
		}
		return Math.min(Math.abs(myArray[high] - target), Math.abs(myArray[low] - target));
	}
}
