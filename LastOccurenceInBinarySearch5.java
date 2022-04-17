package binarySearch;

public class LastOccurenceInBinarySearch5 {
	
	public static void main(String[] args) {
		int[] nums = { -1, 0, 3, 3, 5, 9, 12, 12 };
		LastOccurenceInBinarySearch5 bs = new LastOccurenceInBinarySearch5();
		System.out.println(bs.search(nums, 12));
	}
	
	public int search(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		int result = -1;
		while (low <= high) {
			int mid = low + (high - low);
			if (nums[mid] == target) {
				result = mid;
				low = mid+1;
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
