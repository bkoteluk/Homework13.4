package pl.homework.app;

import static pl.homework.lib.SumArrayParts.sumArray;

public class SumArrayTest {

    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 10, 11};
        int number = 3;
        try {
            int[] resultArray = sumArray(testArray, number);
            for (int i : resultArray) {
                System.out.print(i + " ");
            };
        } catch (ArrayIndexOutOfBoundsException | NullPointerException ex) {
            ex.getMessage();
        }
    }
}
