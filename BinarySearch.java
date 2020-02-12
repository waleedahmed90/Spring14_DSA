import java.util.*;

public class BinarySearch {

	public static void binary(int arr[], int val) {
		// segmential initialization

		int beg = 0, end = arr.length - 1, mid = ((beg + end) / 2);

		// beginning is 0: End is Length-1: Mid is the mean point

		while (beg <= end && arr[mid] != val) { // break condition is if the
												// element is located at the
												// particular mid
			if (val > arr[end] || val < arr[beg]) { // eliminating condition
													// that if the element is
													// not present. i.e.,
													// greater than the last one
													// and smaller than the
													// middle one
				break; // break---not found
			}

			if (arr[mid] < val) { // if item is greater than the middle value.
				beg = mid + 1; // eliminate the least significant part
			} else {
				end = mid - 1; // else.. eliminate the most significant part
			}
			// change the mid point accordingly
			mid = ((beg + end) / 2);
		}//end while

		if (arr[mid] == val) { // if found
			System.out.println(val + " found at index " + mid);
		} else { // if not
			System.out.println("Sorry. The value " + val
					+ " doesn't exist in the array");
		}

		return;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] arr = { 21, 32, 38, 47, 51, 63, 65, 68, 70, 71, 74, 77, 79, 81,
				83, 86, 88, 92, 93, 94 };

		System.out.print("Enter the value to be searched: ");
		int val = scan.nextInt();

		// calling the binary search routine
		binary(arr, val);

		// scan.close();

	}

}
