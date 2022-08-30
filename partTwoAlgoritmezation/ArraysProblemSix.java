package partTwoAlgoritmezation;

/**
 * Training: Introduction to Java (EPAM)
 *
 * 02. Algoritmization.
 *     01. Arrays.
 *
 * Problem 6:
 *   Задана последовательность N вещественных чисел. Вычислить сумму чисел,
 *   порядковые номера которых являются простыми числами.
 *
 * @version 1.01   08/29/2022
 * @author MarkSuertudo
 */

import java.util.Random;

public class ArraysProblemSix {
    final static int SIZE_ARR = 100;

    public static void main(String[] args) {
        Random rnd = new Random();
        double[] arr = new double[SIZE_ARR];

        // TODO: 1 is prime or no.
        arr[0] = 0.0;
        for (int i = 1; i < SIZE_ARR; i++){
            arr[i] = rnd.nextDouble(-100.0, 100.0);
        }

        for (int i = 3; i < SIZE_ARR; i+=2){
            arr[i] = 0.0;
        }

        for (int i = 4; i < SIZE_ARR; i++) {
            for (int n = 3; n * n <= (i + 1); n += 2) {
                if ((i + 1) % n == 0) {
                    arr[i] = 0.0;
                    break;
                }
            }
        }

        double res = 0.0;
        for (int i = 0; i < SIZE_ARR; i++){
            res += arr[i];
            if (arr[i] != 0.0)
                System.out.printf("Index+1 %d value %f\n", i+1, arr[i]);
        }
        System.out.println(res);
    }
}
