import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] array = { 14, 32, 67, 76, 23, 41, 58, 85 };

		System.out.println("Before: " + Arrays.toString(array));
		mergeSort(array);
		System.out.println("After: " + Arrays.toString(array));
	}

	public static void mergeSort(int[] array) {
		if (array.length > 1) {
			int[] left = Left(array);
			int[] right = Right(array);

			// recursive sort
			mergeSort(left);
			mergeSort(right);

			merge(array, left, right);
		}
	}

	public static int[] Left(int[] array) {
		int size1 = array.length / 2;

		int[] left = new int[size1];

		for (int i = 0; i < size1; i++) {
			left[i] = array[i];
		}

		return left;
	}

	public static int[] Right(int[] array) {
		int size1 = array.length / 2;
		int size2 = array.length - size1;

		int[] right = new int[size2];

		for (int i = 0; i < size2; i++) {
			right[i] = array[i + size1];
		}

		return right;
	}

	public static void merge(int[] temp, int[] left, int[] right) {

		int i1 = 0, i2 = 0;

		for (int i = 0; i < temp.length; i++) {
			if (i2 >= right.length
					|| (i1 < left.length && left[i1] <= right[i2])) {
				
				temp[i]=left[i1];
				i1++;

			}else{
				temp[i]=right[i2];
				i2++;
			}
		}

	}

}
