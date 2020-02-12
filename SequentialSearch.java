import java.util.*;

public class SequentialSearch {

	public static void search(int arr[], int val) {
		boolean flag = true; // to flag the found value
		int temp = 0; // to store the index
		for (int i = 0; i < arr.length && flag; i++) {
			if (arr[i] == val) { // if the value is found
				flag = false;
				temp = i; // stores the index
			}
		}

		if (!flag) {
			System.out.println(val + " found at index " + temp);
		} else {
			System.out.println(val + " not present in the array");
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = { 54, 21, 69, 34, 65, 87, 10, 55, 54, 98, 51, 26, 49, 67,
				31, 20, 40, 81, 61, 94 };

		System.out.print("Enter the value to be searched: ");
		int val = scan.nextInt();

		// the sequential search routine
		search(arr, val);
	}

}
