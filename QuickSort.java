import java.util.Arrays;


public class QuickSort {

	
	public static void main(String[] args) {
		int[] array = { 14, 32, 67, 76, 23, 41, 58, 85 };

		System.out.println("Before Quick_Sort: " + Arrays.toString(array));
		Sort(array);
		System.out.println("After Quick_Sort: " + Arrays.toString(array));
	
	}
	
	public static void Sort(int []array){
		if(array.length == 0)
			return;
		else{
			quickSort(array,0,array.length-1);
		}
	}
	
	public static void quickSort(int []array, int low, int high){
		int i=low;
		int j=high;
	
		int pivot=array[low + (high-low)/2];	//somewhere in the middle of no_where
		
		while(i<=j){	//dividing the list into two parts
			
			while(array[i]<pivot){	//while the certain element has a lesser value than that of pivot
				i++;	//result-> keep moving rightwards
			}
			
			while(array[j]>pivot){	//while the certain element is greater than the pivot on the right side of the pivot
				j--;	//result-> keep moving leftwards
			}
			
			if(i<=j){	//in case the pointers collide
				swap(array, i, j);	//swap those values
				i++;	//move left pointer right
				j--;	//move right pointer left
			}	
		}
		
		if(low<j){		//recursion--- if right pointer is greater than the lower bound even after the pointers collide
			quickSort(array,low,j);	//recall that ... now low is the low and the right pointer is the new high
		}
		if(i<high){	//recursion... if the left pointer is still less than the upper bound after pointer collision
			quickSort(array,i,high);	//recall that... now right pointer is the new low and the high is the high
		}
	}
	
	
	public static void swap(int []array, int i, int j){	//this is just for swapping.. not a big deal
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	
	
	

}
