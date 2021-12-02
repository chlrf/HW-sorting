package Var3;


public class QuickSort {

    static int [] qSort(int[] arr, int start, int end){
        if (start < end) {
            int separateIndex = separator(arr, start, end);
            qSort(arr, start, separateIndex - 1);
            qSort(arr, separateIndex, end);
        }
    return arr;
    }

    static int separator(int[] arr, int start, int end) {
        int leftInd = start;
        int rightInd = end;

        int pivot = arr[leftInd + (-leftInd+rightInd)/2];

        while (leftInd <= rightInd){
            while (arr[leftInd] < pivot){
                leftInd++;
            }
            while (arr[rightInd] > pivot){
                rightInd--;
            }

            if (leftInd <= rightInd) {
                int tmp = arr[leftInd];
                arr[leftInd] = arr[rightInd];
                arr[rightInd] = tmp;
                leftInd++;
                rightInd--;
            }
        }
        return leftInd;
    }
}
