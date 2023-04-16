package laba_projects;

import java.util.Arrays;

public class BubbleAlgorithm {
	public static void main(String[] args) {
		int[] sortDemoArray = { 19, 202, 1, 24, 4, 10 };
		System.out.println(Arrays.toString(BubbleSort(sortDemoArray)));
	}

	public static int[] BubbleSort(int[] arrayExample) {
		int index = 0;
		while (index != arrayExample.length - 1) {

			if (arrayExample[index] > arrayExample[index + 1]) {
				int store = arrayExample[index];
				arrayExample[index] = arrayExample[index + 1];
				arrayExample[index + 1] = store;
				index = 0;
			} else if (arrayExample[index] < arrayExample[index + 1]) {
				index += 1;

			}

		}
		return arrayExample;
	}
}