package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class FindGreatestElementOnRight {

	public static void main(String[] args) {
		int arr[] = { 4, 12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6 };
		FindGreatestElementOnRight fs = new FindGreatestElementOnRight();
		System.out.println(fs.getNextElementOnRight(arr, arr.length));
	}

	/**
	 * We will start iterating the array from right,we will maintain one stack and
	 * list. List will store the Greatest Element on right of each element of the
	 * given array. First, we will check whether stack is empty, if yes, we will
	 * insert -1 in the list and store the current element in the stack.Because
	 * empty stack implies there is no element greater than current element on right
	 * side. If stack is not empty, we will compare the top element with current
	 * element, if top element is greater, we will add top element to List and
	 * current element to stack. If top element is less than current element, we
	 * will keep on removing the top element until either we reach the highest
	 * element or stack gets empty. If stack gets empty,we will add -1 to list and
	 * current element to stack.
	 * 
	 * @param myArray
	 * @param n
	 * @return
	 */
	public List<Integer> getNextElementOnRight(int[] myArray, int n) {
		Stack<Integer> myStack = new Stack<>();
		List<Integer> myList = new ArrayList<>();
		for (int index = n - 1; index >= 0; index--) {
			if (!myStack.empty()) {
				while (!myStack.isEmpty()) {
					if (myStack.peek() > myArray[index]) {
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
		Collections.reverse(myList);
		return myList;
	}
}
