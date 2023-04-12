package laba_projects_homeworks;

import java.util.Arrays;

/* Insertion sort, Selection sort, bubble sort, Merge sort, Quicksort. */

public class SortingAlgorithm {
	public static void main(String [] args) { 
		
		int[] arrayExample = {19, 1, 15 , 12 , 20};
		int index = 0; 
		
		while (index != arrayExample.length -1) {
			if (((index != 0) && (index != 1)) && (arrayExample[index-1] < arrayExample[index - 2])) { 
				int store = arrayExample[index -1];
				arrayExample[index - 1] = arrayExample[index-2]; 
				arrayExample[index - 2] = store;
				index -= 1;
			}
			else if (arrayExample[index] > arrayExample[index + 1]) {
				int store = arrayExample[index];
				arrayExample[index] = arrayExample[index+1]; 
				arrayExample[index + 1] = store;
				index += 1;
			}
			else { 
				index += 1;
			}

			System.out.println(Arrays.toString(arrayExample));
			
		
		}
		System.out.println(Arrays.toString(arrayExample));
	}
	
	
}
