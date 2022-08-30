package partTwoAlgoritmezation;

/**
 * Training: Introduction to Java (EPAM)
 *
 * 02. Algoritmization.
 *     01. Arrays.
 *
 * Problem 2:
 *    Дана последовательность действительных чисел а1 ,а2 ,..., ап.
 *    Заменить все ее члены, большие данного Z, этим числом.
 *    Подсчитать количество замен.
 *
 * @version 1.01   08/29/2022
 * @author MarkSuertudo
 */

import java.util.Random;

public class ArraysProblemTwo {
    public static void main(String[] args) {
        Random rnd = new Random();

        double[] arr = new double[10];

        for (int i = 0; i < 10; i++){
            arr[i] = rnd.nextDouble(-100000000000.00, 10000000000000.0);
        }

        int replace = 0;
        double z = rnd.nextDouble(-100000000000.00, 10000000000000.0);
        ;

        for ( int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
            if (arr[i] > z) {
                arr[i] = z;
                replace++;
            }
        }

        System.out.println("Replacements " + replace);
    }
}
