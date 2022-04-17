package binarySearch;

/**
 * We need to find next alphabet. If that alphabet is present,
 * we should not return that alphabet, we need to return next alphabet.
 * If in the array, there is no next alphabet, we should return something like
 * '#'.
 * @author User
 *
 */
public class FindNextCharacter12 {

	public static void main(String[] args) {
		FindNextCharacter12 fnc=new FindNextCharacter12();
		char[] myCharArray= {'a','c','f','m'};
		System.out.println(fnc.findNextCharacter(myCharArray,'f'));
	}
	
	public char findNextCharacter(char[] myCharArray,char target) {
		int low=0;
		int high=myCharArray.length-1;
		char result='#';
		while(low<=high) {
			int mid=(low+high)/2;
			if(myCharArray[mid]==target) {
				low=mid+1;
			}
			else if(myCharArray[mid]>target) {
				result=myCharArray[mid];
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return result;
	}
	
	public int findPower(int a,int b) {
		if(b==0) {
			return 1;
		}
		return 0;
			//else return a*findPower(a,b-1);
	}
	
}