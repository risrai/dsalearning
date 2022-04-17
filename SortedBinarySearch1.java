package binarySearch;

//Search an element in a sorted array using binary search.Elements are
//in ascending order.
public class SortedBinarySearch1 {
	public static void main(String[] args) {
		int[] nums = { -1, 0, 3, 5, 9, 12 };
		SortedBinarySearch1 bs = new SortedBinarySearch1();
		System.out.println(bs.search(nums, 12));
	}

	public int search(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				start = mid + 1;
			} else if (nums[mid] > target) {
				end = mid - 1;
			}
		}
		return -1;
	}
}

