package pl.homework.app;

import static pl.homework.lib.SumArrayParts.sumArray;

public class SumArrayTest {

    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int number = 4;
        try {
            int[] resultArray = sumArray(testArray, number);
            System.out.print("Tablica sum: [ ");
            for (int i : resultArray) {
                System.out.print(i + ", ");
            };
            System.out.print("]\n");
        } catch (ArrayIndexOutOfBoundsException | NullPointerException ex) {
            ex.getMessage();
        }
    }
}
