package binarySearch;

public class IndexOfElementInRotatedSortedArray8 {

	public static void main(String[] args) {
		int[] nums = { 12, 13, 2, 5, 6, 8, 11 };
		IndexOfElementInRotatedSortedArray8 bs = new IndexOfElementInRotatedSortedArray8();
		System.out.println("Answer :" + bs.findNumberOfRotation(nums, 12));
	}

	public int findNumberOfRotation(int[] nums, int key) {
		int low = 0;
		int high = nums.length - 1;
		int mid = 0;
		// 20,30,40,50,60,5,10
		// key=5
		while (low <= high) {
			mid = (high + low) / 2;

			// If key is present in the middle.
			if (nums[mid] == key) {
				return mid;
			}

			// Check whether left side is sorted
			if (nums[mid] > nums[low]) {
				// If yes, then whether key is present in sorted part
				if (key >= nums[low] && key < nums[mid]) {
					high = mid - 1;
				}
				// Look for key in unsorted right part.
				else
					low = mid + 1;
			}

			// Since, right side is sorted, look for key in right side.
			else {
				// If key is on sorted right side.
				if (key > nums[mid] && key <= nums[high]) {
					low = mid + 1;
				}
				// Look for key in unsorted left side.
				else
					high = mid - 1;
			}
		}
		// If element is not present, then return -1.
		return -1;

	}
}
