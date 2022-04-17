package binarySearch;

//Search an element in a sorted array using binary search.Elements are
//in descending order.
public class ReverseSortedArray2 {
	
	public static void main(String[] args) {
		int[] nums ={12,9,5,3,0,-1};
		ReverseSortedArray2 bs=new ReverseSortedArray2();
		System.out.println(bs.search(nums,3));
	}
	
	public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
        	int mid=start + (end-start)/2;
        	System.out.println(mid);
            if(nums[mid]==target){
            	System.out.println("mid matched target:" +mid);
                return mid;
            }
            else if(nums[mid]<target){
            	System.out.println("target is on right side:");
                end=mid-1;
            }
            else if(nums[mid]>target) {
            	start=mid+1;
            	System.out.println("target is on left side:");
            }
        }
        return -1;
    }
}
