package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * We need to find the consecutive number of days before
 * current day where price of stock was less than or equal to current
 * element.In order to solve this, we should find the greatest element
 * on left side of current number and get the index of that element.
 * Then, we need to subtract current element's index with 
 * the NGL to get the span.
 * @author User
 *
 */
public class StockSpanProblem {

	public static void main(String[] args) {
		int arr[] = {100,80,60,70,60,75,85 };
		StockSpanProblem ssp = new StockSpanProblem();
		int[] myftty=ssp.findConsecutiveSpan(arr, arr.length);
		for(int number:myftty) {
			System.out.print(number);
		}
	}

	public int[] findConsecutiveSpan(int[] myArray, int n) {
		Stack<Pair> myStack = new Stack<>();
		List<Integer> myList = new ArrayList<>();
		int[] myAnswerArray = new int[myArray.length];
		for (int index = 0; index < n; index++) {
			if (!myStack.empty()) {
				while (!myStack.isEmpty()) {
					if (myStack.peek().first > myArray[index]) {
						myList.add(myStack.peek().second);
						myStack.push(new Pair(myArray[index], index));
						break;
					} else {
						myStack.pop();
					}
				}
			}
			if (myStack.empty()) {
				myList.add(-1);
				myStack.push(new Pair(myArray[index], index));
			}
		}
		for (int i = 0; i < myList.size(); i++) {
			myAnswerArray[i] = i - myList.get(i);
		}
		return myAnswerArray;
	}

}
