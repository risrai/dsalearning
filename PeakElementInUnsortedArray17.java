package binarySearch;

/**
 * We need to find peak element in unsorted array. Peak Element is an element
 * which is greater than it's neighbor There is always a peak element in an
 * array. There could be more than one peak element in an array. First, compare
 * whether first element is greater than second element, then first element is
 * the peak. If last element is greater than second last, then last element is
 * peak element. Else, we should start comparing middle element from it's
 * neighbors,if it is not greater than it's neighbor then we should shift our
 * search depending on whether left or right element to middle is greater than
 * middle.
 * 
 * @author rishabhrai
 *
 */
public class PeakElementInUnsortedArray17 {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 20, 4, 1, 2};
		PeakElementInUnsortedArray17 psfd = new PeakElementInUnsortedArray17();
		System.out.println(psfd.findFloor(arr));
	}

	public int findFloor(int[] myArray) {
		int length = myArray.length;
		if (myArray[0] > myArray[1]) {
			return myArray[0];
		} else if (myArray[length - 1] > myArray[length - 2]) {
			return myArray[length - 1];
		}

		int low = 0;
		int high = length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (myArray[mid] > myArray[mid - 1] && myArray[mid] > myArray[mid + 1]) {
					return myArray[mid];
			}
			else if(myArray[mid]<myArray[mid - 1]) {
				high=mid-1;
			}
			else low=mid+1;
		}
		return -1;
	}
}
