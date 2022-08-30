package partTwoAlgoritmezation;

/**
 * Training: Introduction to Java (EPAM)
 *
 * 02. Algoritmization.
 *     01. Arrays.
 *
 * Problem 1:
 *   В массив A [N] занесены натуральные числа. Найти сумму
 *   тех элементов, которые кратны данному К.
 *
 * @version 1.01   08/29/2022
 * @author MarkSuertudo
 */

import java.util.Random;

public class ArraysProblemOne {
    public static void main(String[] args) {
        Random rnd = new Random();

        int[] arr = new int[100];

        for (int i = 0; i < 100; i++){
            arr[i] = rnd.nextInt();
        }

        int k = 10;
        int res = 0;
        for (int i = 0; i < 100; i++){
            if (arr[i] % k == 0 ){
                res += arr[i];
            }
        }

        System.out.printf("Result : %d\n", res);
    }
}
