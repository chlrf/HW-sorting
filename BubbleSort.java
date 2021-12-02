package Var3;

import java.util.Arrays;

public class BubbleSort {

    static int[] sorting(int[] arr){
        int size = arr.length;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int j = 0; j < size- 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    isSorted = false;
                }
            }
            size--;
        }
        return arr;
    }
}
