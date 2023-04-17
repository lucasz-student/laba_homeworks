package laba_projects;

import java.util.Arrays;

public class BubbleAlgorithm {
	public static void main(String [] args) { 
		int [] sortDemoArray = {19, 202, 1, 24, 4, 10};
		System.out.println(Arrays.toString(BubbleSort(sortDemoArray))); 
	}
	
	public static int[] BubbleSort(int[] arrayExample) {

		for(int i = 0; i != arrayExample.length - 1; i++) {
			for (int j = 0; j < arrayExample.length - 1; j++) {
				if (arrayExample[j] > arrayExample[j + 1]) {
					int store = arrayExample[j];
					arrayExample[j] = arrayExample[j + 1];
					arrayExample[j+1] = store;
				}
			}
	}
		return arrayExample;
}
}