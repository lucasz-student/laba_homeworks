package laba_projects;

import java.util.Arrays;

public class InsertionAlgorithm {

    public static void main(String[] args) {

        int[] array1 = { 20, 19, 202, 1, 24, 4, 10 };
        System.out.println(Arrays.toString(InsertionSort(array1)));
    }

    public static int[] InsertionSort(int[] givenArray) {
        for (int i = 1; i < givenArray.length; i++) {
            int index = i;
            while (givenArray[index] < givenArray[index - 1]) {
                int store = givenArray[index];
                givenArray[index] = givenArray[index - 1];
                givenArray[index - 1] = store;
                if (index != 1) {
                    index -= 1;
                }
            }
        }
        return givenArray;
    }
}
