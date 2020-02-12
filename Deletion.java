import java.util.*;

public class Deletion {

	public static int countEntries(int arr[]) {
		int count = 0;
		// counts the positive entries (instances of the integers)
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != -1) {
				count++;
			} else {
				break;
			}
		}

		return count;
	}

	public static int[] delete(int arr[], int n, int k) {

		int item = arr[k]; // securing the value to be deleted

		for (int i = k; i < n - 1; i++) {
			arr[i] = arr[i + 1]; // shifts leftwards
		}

		System.out.println("The item deleted from the array is: " + item);

		return arr;
	}

	public static void printArr(int arr[], int n) {
		System.out.println("Here is the array after deletion");
		// array printing module
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] arr = { 54, 21, 69, 34, 65, 87, 10, 55, 54, 98, 51, 26, 49, 67,
				31, 20, 40, 81, -1, -1 };

		System.out.print("enter the index you want to delete: ");
		int k = scan.nextInt();

		int n = countEntries(arr);

		if (n == 0) { // if the array is empty
			System.out.println("There is nothing inside to be deleted");
		} else if (k >= n) { // if index is invalid
			System.out.println("Sorry. No Such index exists");
		} else {
			arr = delete(arr, n, k);
			n -= 1; // decrements the N
			printArr(arr, n);

		}

	}

}
