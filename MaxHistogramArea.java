package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * We need to first find index of NSL and NSR for each element in 
 * given array.
 * Then, subtracting NSR and NSL, we will get the width of
 * rectangle.Multiplying it with respective element or 
 * height, we will get the area.
 * @author User
 *
 */
public class MaxHistogramArea {

	public static void main(String[] args) {
		int arr[] = {2,3,3,2};
		System.out.println(findMaxAreaInHistogram(arr, arr.length));
	}
	
	public static int findMaxAreaInHistogram(int[] ar,int n) {
		List<Integer> leftArray=getNextIndexofElementOnLeft(ar, n);
		List<Integer> rightArray=getNextIndexOfElementOnRight(ar, n);
		int result=0;
		int[] widthArray=new int[n];
		for(int index=0;index<n;index++) {
			widthArray[index]=rightArray.get(index)-leftArray.get(index)-1;
			if(widthArray[index]*ar[index]>result) {
				result=widthArray[index]*ar[index];
			}
		}
		return result;
	}
	
	public static List<Integer> getNextIndexofElementOnLeft(int[] myArray, int n) {
		Stack<Pair> myStack = new Stack<>();
		List<Integer> myList = new ArrayList<>();
		for (int index = 0; index < n; index++) {
			if (!myStack.empty()) {
				while (!myStack.isEmpty()) {
					if (myStack.peek().first< myArray[index]) {
						myList.add(myStack.peek().second);
						myStack.push(new Pair(myArray[index],index));
						break;
					} else {
						myStack.pop();
					}
				}
			}
			if (myStack.empty()) {
				myList.add(-1);
				myStack.push(new Pair(myArray[index],index));
			}
		}
		return myList;
	}
	
	public static List<Integer> getNextIndexOfElementOnRight(int[] myArray, int n) {
		Stack<Pair> myStack = new Stack<>();
		List<Integer> myList = new ArrayList<>();
		for (int index =n-1; index >=0; index--) {
			if (!myStack.empty()) {
				while (!myStack.isEmpty()) {
					if (myStack.peek().first< myArray[index]) {
						myList.add(myStack.peek().second);
						myStack.push(new Pair(myArray[index],index));
						break;
					} else {
						myStack.pop();
					}
				}
			}
			if (myStack.empty()) {
				myList.add(myArray.length);
				myStack.push(new Pair(myArray[index],index));
			}
		}
		Collections.reverse(myList);
		return myList;
	}


}
