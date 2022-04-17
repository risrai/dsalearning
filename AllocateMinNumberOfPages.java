package binarySearch;

public class AllocateMinNumberOfPages {

	public static void main(String[] args) {
		int arr[] = {12, 34, 67, 90};
		System.out.println(findPages(arr, 2));
	}
	
	public static int findPages(int[] arr,int students) {
		int low=0;
		int result=-1;
		int high=findSum(arr);
		while(low<=high) {
			int mid=(low+high)/2;
			if(isPossible(arr,mid,students)) {
				high=mid-1;
				result=mid;
			}
			else low=mid+1;
		}
		return result;
	}

	public static int findSum(int[] arr) {
		int sum=0;
		for(int number:arr) {
			sum+=number;
		}
		return sum;
	}
	
	public static boolean isPossible(int[] arr,int limit,int students) {
		int count=1;
		int sum=0;
			for(int number:arr) {
				if(number>limit) {
					return false;
				}
				else if(sum+number>limit) {
					sum=number;
					count++;
				}
				else sum+=number;
			}
			if(count>students) {
				return false;
			}
			else return true;
	}
}
