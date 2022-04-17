package binarySearch;

/**
 * When we are unaware whether array is sorted in
 * ascending order or descending order.First,we should check
 * whether array is in descending or ascending.
 * 
 * @author risrai
 *
 */
public class OrderAgnosticSearch3 {
	
	public static void main(String[] args) {
		int[] nums ={-1,0,3,5,9,12};
		OrderAgnosticSearch3 bs=new OrderAgnosticSearch3();
		System.out.println(bs.agnosticSearch(nums,3));
	}
	
	public int agnosticSearch(int[] nums, int target) {
		if(nums.length==1) {
			return 0;
		}
		else if (nums[0]>nums[1]) {
			return descendingSearch(nums,target);
		}
		else return ascendingSearch(nums,target);
	}
	
	public int descendingSearch(int[] nums, int target) {
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
	
	public int ascendingSearch(int[] nums, int target) {
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
                start=mid+1;
            }
            else if(nums[mid]>target) {
            	end=mid-1;
            	System.out.println("target is on left side:");
            }
        }
        return -1;
    }
}
