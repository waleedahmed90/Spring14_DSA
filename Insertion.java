import java.util.*;

public class Insertion {

	public static int entries(int[] arr) {
			
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			// counts the no of positive instances of integers
			if (arr[i] != -1) {
				count++;
			} else {
				break;
			}

		}

		return count;
	}

	// this method prints the array
	public static void printArr(int[] arr, int n) {

		System.out.println("Here is the array");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static int[] insert(int[] arr, int k, int n, int item) {

		for (int i = n - 1; i >= k; i--) { // from insertion point until the
											// upper bound
			arr[i + 1] = arr[i]; // shifts right wards
		}

		arr[k] = item; // insertion of the item

		return arr;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// hard coded array
		int[] arr = { 54, 21, 69, 34, 65, 87, 10, 55, 54, 98, 51, 26, 49, 67,
				31, 20, 40, 81, -1, -1 };

		int n = entries(arr); // calls the function that gets the total postive
								// integers in the array

		// input of the item to be inserted
		System.out.print("Enter the item to be inserted: ");
		int item = scan.nextInt();
		// index of the item to be inserted
		System.out.println("Enter the index to be inserted at: ");
		int k = scan.nextInt();

		if (n == arr.length) { // in case the array is full
			System.out.println("Maximum limit reached. Can't insert");
		} else if (k > (arr.length - 1)) { // in case the index asked by the
											// user is invalid
			System.out.println("No Such index exists::");
		} else { // else call the insertion function
			insert(arr, k, n, item);
			n += 1;

			printArr(arr, n);
		}
	}

}
