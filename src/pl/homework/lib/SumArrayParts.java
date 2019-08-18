package pl.homework.lib;

public class SumArrayParts {

    private static int partSum(int[] array, int startIndex, int endIndex) {
        int partSum = 0;
        for (int i = startIndex; i < endIndex; i++) {
            partSum += array[i];
        }
        return partSum;
    }

    public static int[] sumArray(int[] array, int number) throws ArrayIndexOutOfBoundsException, NullPointerException {

        if (array == null) {
            throw new NullPointerException("W miejsce tablicy przekazano wartość null");
        }
        if (number > array.length) {
            throw new ArrayIndexOutOfBoundsException("Długość tablicy jest mniejsza niż drugi argument");
        }

        int arrayLength = array.length%number == 0 ? array.length/number : array.length/number + 1;
        int[] sumArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            int startIndex = number*i;
            int endIndex = number*(i+1) < array.length ?  number*(i+1) : array.length;
            sumArray[i] = partSum(array, startIndex, endIndex);
        }
        return sumArray;
    }
}
