package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FindSmallestElementOnLeft {

	public static void main(String[] args) {
		int arr[] = { 4, 12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6 };
		System.out.println(getNextElementOnLeft(arr, arr.length));
	}

	public static List<Integer> getNextElementOnLeft(int[] myArray, int n) {
		Stack<Integer> myStack = new Stack<>();
		List<Integer> myList = new ArrayList<>();
		for (int index = 0; index < n; index++) {
			if (!myStack.empty()) {
				while (!myStack.isEmpty()) {
					if (myStack.peek()< myArray[index]) {
						myList.add(myStack.peek());
						myStack.push(myArray[index]);
						break;
					} else {
						myStack.pop();
					}
				}
			}
			if (myStack.empty()) {
				myList.add(-1);
				myStack.push(myArray[index]);
			}
		}
		return myList;
	}

}
