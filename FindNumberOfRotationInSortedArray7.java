package binarySearch;

//No of rotations will be equal to index of lowest element
//in the array.For eg. if array= {11,12,18,2,5,6,8}
//Index of lowest element '2' is four. So, no of rotations will be 4.

//First condition -> Check whether array is not being rotated
//by comparing first and last element.If last element is greater than
//first element ,then array is unrotated, hence first index will be answer
//i.e Zero.
public class FindNumberOfRotationInSortedArray7 {
	public static void main(String[] args) {
		int[] nums = {2,5,6,8,11,12,13,15,18};
		FindNumberOfRotationInSortedArray7 bs = new FindNumberOfRotationInSortedArray7();
		System.out.println("Answer :" + bs.findNumberOfRotation(nums));
	}

	public int findNumberOfRotation(int[] nums) {
		int low = 0;
		int high = nums.length - 1;
		int mid = 0;

		// Check whether array is not being rotated
		// by comparing first and last element.If last element is greater than
		// first element ,then array is unrotated, hence first index will be answer
		// i.e Zero.
		if (nums[low] < nums[high]) {
			System.out.println("Condition 1");
			return 0;
		}

		while (high >= low) {
			mid = (low + high) / 2;
			// 3,4,5,1,2
			// If middle element is less than previous element, then mid will
			// be answer.
			if (nums[mid] < nums[mid - 1]) {
				System.out.println("Condition 2");
				return mid;
			}

			// If mid+1 element is less than mid, then mid+1 is the answer.
			if (nums[mid + 1] < nums[mid]) {
				System.out.println("Condition 3");
				return mid + 1;
			}

			if (nums[low]<nums[mid]) {
				System.out.println("right side pe hai unsorted:" + mid);
				low = mid + 1;
			}

			else {
				System.out.println("left side pe hai unsorted:" + mid);
				high = mid - 1;
			}
		}
		return mid;
	}
}
