package recursion;

public class JosephusProblem {
	String s="";
	
	public static void main(String[] args) {
		JosephusProblem js = new JosephusProblem();
		System.out.println(js.reverseString("ABCD"));
		System.out.println(js.findSafePlace(5, 2));
		System.out.println(js.checkPallindrome("AbaabA", 0, 5));
	}

	/**
	 * Returns the position number which will be safe. Assuming first position to be
	 * 1. After the first person (kth from beginning) is killed, n-1 persons are
	 * left. So we call josephus(n – 1, k) to get the position with n-1 persons. But
	 * the position returned by josephus(n – 1, k) will consider the position
	 * starting from k%n + 1. So, we must make adjustments to the position returned
	 * by josephus(n – 1, k).
	 * 
	 * Newindex=(CurrentIndex+k-1)%n
	 * If we start from 0 index and we need to kill 3rd member
	 * i.e. K=3.
	 * Then, next time index will be 0 +3 -1=2
	 * position will be index+1
	 */
	public int findSafePlace(int n, int k) {
		if (n == 1) {
			return 1;
		}
		return (findSafePlace(n - 1, k) + k - 1) % n + 1;
	}
	
	public String reverseString(String originalString) {
		if(originalString.length()!=0) {
			s+=originalString.charAt(originalString.length()-1);
			originalString=originalString.substring(0,originalString.length()-1);
			return reverseString(originalString);
		}
		return s;
	}
	
	public boolean checkPallindrome(String s,int first,int last) {
		if(first>=last) {
			return true;
		}
		if(s.charAt(first)==s.charAt(last)) {
			return checkPallindrome(s,first+1,last-1);
		}
		return false;
	}
}
