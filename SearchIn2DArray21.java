package binarySearch;

public class SearchIn2DArray21 {

	public static void main(String[] args) {
		int[][] nums = { { 10,20,30,40 }, 
						 { 15,25,35,45 },
						 { 27,29,37,48 }, 
						 { 32,33,39,50 } 
					};
		System.out.println(searchElement(nums, 31));
	}
	
	public static String searchElement(int[][]nums,int target) {
		int j=nums[0].length-1;
		int i=0;
		while(j>=0 && nums[i][j]!=target && i<nums[0].length) {
			if(nums[i][j]>target) {
				j--;
			}
			else if(nums[i][j]>target) {
				i++;
			}
			else return "i:"+i+" j:"+j;
		}
			return "Not present";
	}

}
