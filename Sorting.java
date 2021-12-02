package Var3;

import java.util.Arrays;
import java.util.Date;

public class Sorting {
    public static void main(String[] args) {
        final int SIZE = 115;
        Date start0 = new Date();
        int[] randomArray1 = RandomArray.createArray(SIZE);
        int[] randomArray2 = new int[SIZE];
        int[] randomArray3 = new int[SIZE];
        for (int i = 0; i < SIZE; i ++){
            randomArray2[i] = randomArray1[i];
            randomArray3[i] = randomArray1[i];
        }
        Date stop0 = new Date();
        System.out.println("Random array building: " + (stop0.getTime()- start0.getTime()) + " ms");
        System.out.println("Random array:\n"+Arrays.toString(randomArray1) + "\n");

        //Selection sorting
        Date start1 = new Date();
        SelectionSort.sorting(randomArray1);
        Date stop1 = new Date();
        System.out.println("Selection sorting: " + (stop1.getTime()- start1.getTime()) + " ms");
        System.out.println(Arrays.toString(randomArray1) + "\n");
        //System.out.println("Random array2:\n"+Arrays.toString(randomArray2) + "\n");

        //Bubble sorting
        Date start2 = new Date();
        BubbleSort.sorting(randomArray2);
        Date stop2 = new Date();
        System.out.println("Bubble sorting: " + (stop2.getTime()- start2.getTime()) + " ms");
        System.out.println(Arrays.toString(randomArray2) + "\n");

        //Quick sorting
        Date start3 = new Date();
        randomArray3 = QuickSort.qSort(randomArray3, 0, randomArray3.length -1);
        Date stop3 = new Date();
        System.out.println("Quick sorting: " + (stop3.getTime()- start3.getTime()) + " ms");
        System.out.println(Arrays.toString(randomArray3));



        //System.out.println(Arrays.toString(randomArray1));
        //System.out.println(Arrays.toString(randomArray2));
        //System.out.println(Arrays.toString(randomArray3));

        }



}

