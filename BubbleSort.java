import java.util.*;

public class BubbleSort {

	public static int[] bubbleAsc(int[] arr) {

		for (int i = 0; i < arr.length; i++) {// until the total length
			for (int j = 0; j < (arr.length - i - 1); j++) {// one value before
															// the (last-i)
				if (arr[j] > arr[j + 1]) {// if true then swaps
					arr[j] = arr[j] + arr[j + 1];
					arr[j + 1] = arr[j] - arr[j + 1];
					arr[j] = arr[j] - arr[j + 1];
				}
			}
		}

		return arr;
	}

	public static int[] bubbleDesc(int[] arr) {

		for (int i = 0; i < arr.length; i++) { // until the total length
			for (int j = 0; j < (arr.length - i - 1); j++) { // one value before
																// the (last-i)
				if (arr[j] < arr[j + 1]) { // if true then swaps
					arr[j] = arr[j] + arr[j + 1];
					arr[j + 1] = arr[j] - arr[j + 1];
					arr[j] = arr[j] - arr[j + 1];
				}
			}
		}

		return arr;
	}

	public static void printArr(int[] arr) {

		System.out.println("here is the sorted array");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

	}

	public static void main(String[] args) {

		int arr[] = { 54, 54, 65, 14, 23, 25, 18, 14 };

		arr = bubbleAsc(arr);// calls the Ascending Bubble sort
		System.out.println("Ascending order");
		printArr(arr);// calls the print array function
		arr = bubbleDesc(arr);// calls the Descending Bubble sort
		System.out.println("\n\nDescending order");
		printArr(arr);// calls the print array function

	}

}
