package pl.homework.lib;

import java.util.Arrays;

public class SumArrayParts {

    private static int partSum(int[] array, int startIndex, int endIndex) {
        int partSum = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(array[i] + ", ");
            partSum += array[i];
        }
        System.out.println();
        return partSum;
    }

    public static int[] sumArray(int[] array, int number) throws ArrayIndexOutOfBoundsException, NullPointerException {

        if (array == null) {
            throw new NullPointerException("W miejsce tablicy przekazano wartość null");
        }
        if (number > array.length) {
            throw new ArrayIndexOutOfBoundsException("Długość tablicy jest mniejsza niż drugi argument");
        }

        int arrayLength = array.length%(number-1) == 0 ? (array.length/(number-1)-1) : array.length/(number-1);
        int[] sumArray = new int[number];

        for (int i = 0; i < number ; i++) {
            int startIndex = (arrayLength)*i < array.length ? (arrayLength)*i : array.length-1;
            int endIndex = arrayLength*(i+1)-1 < array.length ?  arrayLength*(i+1)-1 : array.length-1;

            sumArray[i] = partSum(array, startIndex, endIndex);
        }
        return sumArray;
    }
}
