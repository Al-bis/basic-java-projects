package pl.coderstrust.sieve;

import java.util.Arrays;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sieve(12)));
    }

    public static int[] sieve(int maximumNumber) {
        boolean[] numbers = new boolean[maximumNumber + 1];
        for (int i = 2; i <= maximumNumber; i++) {
            numbers[i] = true;
        }
        for (int i = 2; i <= Math.sqrt(maximumNumber); i++) {
            if (numbers[i] == true) {
                for (int j = (int) Math.pow(i, 2); j <= maximumNumber; j = j + i) {
                    numbers[j] = false;
                }
            }
        }
        int primarysAmount = 0;
        for (int i = 0; i <= maximumNumber; i++) {
            if (numbers[i] == true) {
                primarysAmount++;
            }
        }
        int[] primaryNumbers = new int[primarysAmount];
        int position = 0;
        for (int i = 0; i <= maximumNumber; i++) {
            if (numbers[i] == true) {
                primaryNumbers[position] = i;
                position++;
            }
        }
        return primaryNumbers;
    }
}
