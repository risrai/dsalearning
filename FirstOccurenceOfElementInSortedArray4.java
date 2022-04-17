package binarySearch;

public class FirstOccurenceOfElementInSortedArray4 {

	public static void main(String[] args) {
		int[] nums = { -1, 0, 3, 3, 5, 9, 9, 12 };
		FirstOccurenceOfElementInSortedArray4 bs = new FirstOccurenceOfElementInSortedArray4();
		System.out.println(bs.search(nums, 9));
	}

	public int search(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		int result = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] == target) {
				result = mid;
				high = mid - 1;
				continue;
			} else if (nums[mid] > target) {
				high = mid - 1;
			}
			else
				low = mid + 1;
		}
		return result;
	}
}
