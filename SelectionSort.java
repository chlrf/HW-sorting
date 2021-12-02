package Var3;

public class SelectionSort{
    static int[] sorting(int[] array){
        for (int i = 0; i < array.length-1; i++){
            int minValue = array[i];
            int minIndex = i;
            for (int j = i+1; j < array.length ; j++){
                if (array[j] < minValue){
                    minValue = array[j];
                    minIndex = j;
                }
            }
            array[minIndex] = array[i];
            array[i] = minValue;
        }
        return array;
    }
}
