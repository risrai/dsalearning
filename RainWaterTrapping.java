package stack;

/**
 * This problem deals with smallest building present in the vicinity.
 * Then,that building's height is subtracted from current one,
 * to get unit of water at top of this building.
 * To get total water, we need to sum up water
 * collected at each of the building.
 * @author User
 *
 */
public class RainWaterTrapping {

	public static void main(String[] args) {
		int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		System.out.println(findWaterTrapped(arr, arr.length));
	}

	public static int findWaterTrapped(int[] ar, int n) {
		int[] absoluteMaxOnLeft = new int[n];
		int[] absoluteMaxOnRight = new int[n];
		int sum=0;
		absoluteMaxOnLeft[0] = ar[0];
		
		for (int index = 1; index < n; index++) {
			if (ar[index] > absoluteMaxOnLeft[index - 1]) {
				absoluteMaxOnLeft[index] = ar[index];
			} else {
				absoluteMaxOnLeft[index] = absoluteMaxOnLeft[index - 1];
			}
		}
		
		absoluteMaxOnRight[n-1]=ar[n-1];
		for (int index = n-2; index >=0; index--) {
			if (ar[index] > absoluteMaxOnLeft[index+1]) {
				absoluteMaxOnRight[index] = ar[index];
			} else {
				absoluteMaxOnRight[index] = absoluteMaxOnRight[index+1];
			}
		}
		
		for(int index=0;index<n;index++) {
			sum+=Math.min(absoluteMaxOnLeft[index], absoluteMaxOnRight[index])-ar[index];
		}
		return sum;
	}
}
