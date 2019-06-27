package pl.coderstrust.sieve;

import java.util.Arrays;

public class SieveOfEratosthenes {

    private static final int NON_PRIME_MARKER = 0;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sieve(100)));
    }

    public static int[] sieve(int maximumNumber) {
        if (maximumNumber < 2) {
            return new int[0];
        }
        int[] array = createInitialArray(maximumNumber);
        int countOfPrimeNumbers = (maximumNumber + 1) - markNonePrimeNumbers(array);
        return extractPrimesNumbers(array, countOfPrimeNumbers);
    }

    private static int markNonePrimeNumbers(int[] array) {
        int counter = 2;
        for (int i = 2; (i * i) <= array.length; i++) {
            if (array[i] != NON_PRIME_MARKER) {
                for (int j = i; i * j <= array.length - 1; j++) {
                    if (array[i * j] != NON_PRIME_MARKER) {
                        array[i * j] = NON_PRIME_MARKER;
                        counter++;
                    }
                }
            }
        }
        return counter;
    }

    private static int[] extractPrimesNumbers(int[] array, int countOfPrimeNumbers) {
        int[] primaryNumbers = new int[countOfPrimeNumbers];
        int position = 0;
        for (int i = 2; i < array.length; i++) {
            if (array[i] != NON_PRIME_MARKER) {
                primaryNumbers[position++] = array[i];
            }
        }
        return primaryNumbers;
    }

    private static int[] createInitialArray(int size) {
        int[] numbers = new int[size + 1];
        for (int i = 0; i <= size; i++) {
            numbers[i] = i;
        }
        return numbers;
    }
}
