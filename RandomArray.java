package Var3;

public class RandomArray {

    static int[] createArray(int size) {
        int[] randArray = new int[size];
        randArray[0] = (int) (Math.random() * size + 1);
        for (int i = 1; i < size; i++) {
            randArray[i] = (int) (Math.random() * size + 1);
            for (int j = 0; j < i; ) {
                if (randArray[i] == randArray[j]) {
                    randArray[i] = (int) (Math.random() * size + 1);
                    j = 0;
                } else {
                    j++;
                }
            }
        }
        return randArray;
    }
}
