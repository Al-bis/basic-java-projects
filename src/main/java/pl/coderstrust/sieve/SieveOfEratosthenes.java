package pl.coderstrust.sieve;

import java.util.Arrays;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sieve(122)));
    }

    public static int[] sieve(int maximumNumber) {
        if (maximumNumber < 2) {
            return new int[0];
        }
        int[] array = createInitialArray(maximumNumber);
        int countOfPrimeNumbers = markNonePrimeNumbers(array);
        return extractPrimesNumbers(array, countOfPrimeNumbers);
    }

    private static int markNonePrimeNumbers(int[] array) {
        for (int i = 2; i <= Math.sqrt(array.length - 1); i++) {
            if (array[i] == 1) {
                for (int j = (int) Math.pow(i, 2); j <= array.length - 1; j = j + i) {
                    array[j] = 0;
                }
            }
        }
        int primaryAmount = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] == 1) {
                primaryAmount++;
            }
        }
        return primaryAmount;
    }

    private static int[] extractPrimesNumbers(int[] array, int countOfPrimeNumbers) {
        int[] primaryNumbers = new int[countOfPrimeNumbers];
        int position = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] == 1) {
                primaryNumbers[position] = i;
                position++;
            }
        }
        return primaryNumbers;
    }

    private static int[] createInitialArray(int maximumNumber) {
        int[] numbers = new int[maximumNumber + 1];
        for (int i = 2; i <= maximumNumber; i++) {
            numbers[i] = 1;
        }
        return numbers;
    }
}
