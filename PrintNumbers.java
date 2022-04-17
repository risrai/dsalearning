package recursion;

public class PrintNumbers {

	public static void main(String[] args) {
		printNum(10);
	}

	public static void reversePrintNum(int limit) {
		if(limit > 0) {
			System.out.println(limit);
			printNum(limit - 1);
		}
	}
	
	public static void printNum(int limit) {
		if(limit==1) {
			System.out.println(limit);
		}
		printNum(limit-1);
		System.out.println(limit);
	}
	
}
