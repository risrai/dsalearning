package binarySearch;

public class CountOfAnElementInArray6 {

	public static void main(String[] args) {
		int[] nums = { -1, 0,3,3,3,6,9};
		CountOfAnElementInArray6 bs = new CountOfAnElementInArray6();
		System.out.println("Answer :"+bs.getCount(nums,3));
	}

	public int getCount(int[] nums, int target) {
		return findLastOccurence(nums,target)-findFirstOccurence(nums, target)+1;
	}
		public int findLastOccurence(int[] nums, int target) {
			int low = 0;
			int high = nums.length - 1;
			int result = -1;
			while (low <= high) {
				int mid = low + (high - low) / 2;
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
		
		public int findFirstOccurence(int[] nums, int target) {
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
