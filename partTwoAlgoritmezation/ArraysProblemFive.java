package partTwoAlgoritmezation;

/**
 * Training: Introduction to Java (EPAM)
 *
 * 02. Algoritmization.
 *     01. Arrays.
 *
 * Problem 5:
 *   Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа,
 *   для которых аi > i.
 *
 * @version 1.01   08/29/2022
 * @author MarkSuertudo
 */

import java.util.Random;

public class ArraysProblemFive {
    public static void main(String[] args) {
        Random rnd = new Random();

        int[] arr = new int[100];

        for (int i = 0; i < 100; i++){
            arr[i] = rnd.nextInt(-100,100);
        }

        for (int i = 0; i < 100; i++){
            if (arr[i] > (i+1)) { System.out.printf("index %d value %d\n", i, arr[i] ); }
        }
    }
}
